package org.mytms.common.ajax;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class AjaxResponse<T> implements Serializable {

    public final static int RESPONSE_STATUS_SUCCESS = 200;

    protected int code = RESPONSE_STATUS_SUCCESS;
    protected String message = null;
    protected T data;

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
