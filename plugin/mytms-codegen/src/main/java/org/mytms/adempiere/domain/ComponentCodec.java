package org.mytms.adempiere.domain;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import org.mytms.adempiere.domain.ADComponent;
import org.mytms.adempiere.domain.AntDUtils;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * Created by Martin.Xu on 2017/5/12.
 */
public class ComponentCodec implements ObjectSerializer {
    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        ADComponent component = (ADComponent) object;
        if (null == component) {
            return;
        }

        SerializeWriter out = serializer.out;

        if (!AntDUtils.isEmpty(component.getName())) {
            out.write(component.getName());
            return;
        }
    }
}
