package com.yupi.usercenter.common;

/**
 * 返回工具类
 *
 * @author： phil
 */
public class ResultUtils {
    /**
     * When Success
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok","");
    }

    /**
     * When fail
     * @param errorCode
     * @return
     */
    public static BaseResponse error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }

    public static BaseResponse error(ErrorCode errorCode, String message, String description){
        return new BaseResponse(errorCode.getCode(), null, message, description);
    }

    public static BaseResponse error(int code, String message, String description){
        return new BaseResponse(code, null, message, description);
    }

    public static BaseResponse error(ErrorCode errorCode, String description){
        return new BaseResponse(errorCode.getCode(), null, errorCode.getMessage(), description);
    }
}
