package com.jager.crowd.exception;

/**
 * 表示用户没有登录就访问受保护资源时抛出的异常
 */
public class AccessForbiddenException extends RuntimeException{

    private static final long serialVersionUID = -1443885393842215027L;

    public AccessForbiddenException() {
        super();
    }

    public AccessForbiddenException(String message) {
        super(message);
    }

    public AccessForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccessForbiddenException(Throwable cause) {
        super(cause);
    }

    protected AccessForbiddenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
