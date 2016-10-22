package com.eliteams.quick4j.core.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * ErrorResult : 用于响应错误的请求的对象
 *
 * @author StarZou
 * @since 2014-09-27 16:38
 */
public class ErrorResult extends Result {
    private static final long serialVersionUID = 8567221653356186674L;

    /**
     * 封装多个 错误信息
     */
    private Map<String, Object> errors = new HashMap<>();

    public Map<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }

    public ErrorResult() {

    }
}
