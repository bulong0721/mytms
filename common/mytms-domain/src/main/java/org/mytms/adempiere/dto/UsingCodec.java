package org.mytms.adempiere.dto;

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
        UsingDto component = (UsingDto) object;
        if (null == component) {
            return;
        }

        SerializeWriter out = serializer.out;

        if (!isEmpty(component.getName())) {
            out.write(component.getName());
            return;
        }
    }

    private boolean isEmpty(String name) {
        return null == name || name.trim().length() == 0;
    }
}
