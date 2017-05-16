package org.mytms.configuration;

import org.mytms.adempiere.dto.UsingCodec;
import org.mytms.adempiere.dto.UsingDto;
import org.mytms.common.support.FastJsonHttpMessageConverter;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.interceptor.TransactionInterceptor;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;
import java.util.Properties;

/**
 * Created by Martin.Xu on 2017/4/10.
 */
@Configuration
@ComponentScan({"org.mytms.*.dao.impl", "org.mytms.*.service.impl"})
@EntityScan("org.mytms.*.domain")
public class MytmsAutoConfiguration {

    @Bean
    public HttpMessageConverter fastJsonConverter() {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converter.getSerializeConfig().put(UsingDto.class, new UsingCodec());
        return converter;
    }

    @Bean
    public WebMvcConfigurer webConfig() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
                super.addResourceHandlers(registry);
            }

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .maxAge(3600);
                super.addCorsMappings(registry);
            }

            @Override
            public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
                super.addArgumentResolvers(argumentResolvers);
            }
        };
    }

    @Bean
    public Advisor serviceAdvisor(@Autowired PlatformTransactionManager txManager) {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression("this(org.mytms.common.service.TransactionalAspectAware)");
        return new DefaultPointcutAdvisor(pointcut, txAdvice(txManager));
    }

    private TransactionInterceptor txAdvice(PlatformTransactionManager txManager) {
        TransactionInterceptor txAdvice = new TransactionInterceptor();
        txAdvice.setTransactionManager(txManager);
        Properties properties = new Properties();
        properties.setProperty("get*", "readOnly");
        properties.setProperty("list*", "readOnly");
        properties.setProperty("page*", "readOnly");
        properties.setProperty("find*", "readOnly");
        properties.setProperty("search*", "readOnly");
        properties.setProperty("*", "-org.mytms.common.exception.ServiceException");
        txAdvice.setTransactionAttributes(properties);
        return txAdvice;
    }
}
