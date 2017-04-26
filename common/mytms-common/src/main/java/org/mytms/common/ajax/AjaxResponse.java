package org.mytms.common.ajax;

import java.io.Serializable;

public class AjaxResponse<T> implements Serializable {

    public final static int RESPONSE_STATUS_SUCCESS = 200;

    protected int code = RESPONSE_STATUS_SUCCESS;
    protected String message = null;
    protected T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static AjaxResponse success() {
        AjaxResponse response = new AjaxResponse();
        response.setCode(RESPONSE_STATUS_SUCCESS);
        return response;
    }

    public static AjaxResponse failed(int statusCode) {
        AjaxResponse response = new AjaxResponse();
        response.setCode(statusCode);
        return response;
    }
}
