package org.mytms.adempiere.domain;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
public class UsingCodec implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        Using using = (Using) object;
        if (null == using) {
            return;
        }

        SerializeWriter out = serializer.out;

        if (!isEmpty(using.getAlias())) {
            out.write(using.getAlias());
            return;
        }
    }

    static boolean isEmpty(String text) {
        return (text == null || text.trim().length() == 0);
    }
}
