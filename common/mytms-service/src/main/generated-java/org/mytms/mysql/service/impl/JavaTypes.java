package org.mytms.mysql.service.impl;

import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * Type constants for managed fields.
 *
 * @author Abe White
 */
public class JavaTypes {

    public static final int BOOLEAN = 0;
    public static final int BYTE = 1;
    public static final int CHAR = 2;
    public static final int DOUBLE = 3;
    public static final int FLOAT = 4;
    public static final int INT = 5;
    public static final int LONG = 6;
    public static final int SHORT = 7;
    // keep OBJECT as first non-primitive type code; other code relies on it
    public static final int OBJECT = 8;
    public static final int STRING = 9;
    public static final int NUMBER = 10;
    public static final int ARRAY = 11;
    public static final int COLLECTION = 12;
    public static final int MAP = 13;
    public static final int DATE = 14;
    public static final int PC = 15;
    public static final int BOOLEAN_OBJ = 16;
    public static final int BYTE_OBJ = 17;
    public static final int CHAR_OBJ = 18;
    public static final int DOUBLE_OBJ = 19;
    public static final int FLOAT_OBJ = 20;
    public static final int INT_OBJ = 21;
    public static final int LONG_OBJ = 22;
    public static final int SHORT_OBJ = 23;
    public static final int BIGDECIMAL = 24;
    public static final int BIGINTEGER = 25;
    public static final int LOCALE = 26;
    public static final int PC_UNTYPED = 27;
    public static final int CALENDAR = 28;
    public static final int OID = 29;
    public static final int INPUT_STREAM = 30;
    public static final int INPUT_READER = 31;
    public static final int ENUM = 32;

    private static final Map<Class<?>, Integer> _typeCodes = new HashMap<Class<?>, Integer>();

    static {
        _typeCodes.put(String.class, STRING);
        _typeCodes.put(Boolean.class, BOOLEAN_OBJ);
        _typeCodes.put(Byte.class, BYTE_OBJ);
        _typeCodes.put(Character.class, CHAR_OBJ);
        _typeCodes.put(Double.class, DOUBLE_OBJ);
        _typeCodes.put(Float.class, FLOAT_OBJ);
        _typeCodes.put(Integer.class, INT_OBJ);
        _typeCodes.put(Long.class, LONG_OBJ);
        _typeCodes.put(Short.class, SHORT_OBJ);
        _typeCodes.put(Date.class, DATE);
        _typeCodes.put(java.sql.Date.class, DATE);
        _typeCodes.put(java.sql.Timestamp.class, DATE);
        _typeCodes.put(java.sql.Time.class, DATE);
        _typeCodes.put(BigInteger.class, BIGINTEGER);
        _typeCodes.put(BigDecimal.class, BIGDECIMAL);
        _typeCodes.put(Number.class, NUMBER);
        _typeCodes.put(Locale.class, LOCALE);
        _typeCodes.put(Object.class, OBJECT);
        _typeCodes.put(Properties.class, MAP);
        _typeCodes.put(Calendar.class, CALENDAR);
    }

    /**
     * Return the field metadata type code for the given class. First class
     * objects are not recognized in this method.
     */
    public static int getTypeCode(Class<?> type) {
        if (type == null)
            return OBJECT;

        if (type.isPrimitive()) {
            switch (type.getName().charAt(0)) {
                case 'b':
                    return (type == boolean.class) ? BOOLEAN : BYTE;
                case 'c':
                    return CHAR;
                case 'd':
                    return DOUBLE;
                case 'f':
                    return FLOAT;
                case 'i':
                    return INT;
                case 'l':
                    return LONG;
                case 's':
                    return SHORT;
            }
        }

        Integer code = (Integer) _typeCodes.get(type);
        if (code != null)
            return code.intValue();

        // have to do this first to catch custom collection and map types;
        // on resolve we figure out if these custom types are
        // persistence-capable
        if (Collection.class.isAssignableFrom(type))
            return COLLECTION;
        if (Map.class.isAssignableFrom(type))
            return MAP;
        if (type.isArray())
            return ARRAY;
        if (Calendar.class.isAssignableFrom(type))
            return CALENDAR;

        if (type.isInterface()) {
            if (Serializable.class.isAssignableFrom(type))
                return OBJECT;
            return PC_UNTYPED;
        }
        if (type.isAssignableFrom(Reader.class))
            return INPUT_READER;
        if (type.isAssignableFrom (InputStream.class))
            return INPUT_STREAM;
        if (Enum.class.isAssignableFrom(type))
            return ENUM;

        return OBJECT;
    }
}

