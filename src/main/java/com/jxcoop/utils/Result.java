package com.jxcoop.utils;

/**
 * 返回json格式工具类
 * @param <T>
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    /**
     * 返回成功信息
     * @param object 传入的数据
     * @return AjaxMsg
     */
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(1);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    /**
     * 返回成功信息
     * @return AjaxMsg
     */
    public static Result success(){
        return Result.success(null);
    }

    /**
     * 返回失败信息
     * @param code 状态码
     * @param msg 信息
     * @return AjaxMsg
     */
    public static Result error(Integer code, String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }


    /**
     * 返回失败信息
     * @param msg 信息
     * @return AjaxMsg
     */
    public static Result error(String msg){
        return Result.error(0,msg);
    }
    /**
     * 使用默认返回失败信息
     * @return AjaxMsg
     */
    public static Result error(){
        return Result.error(0,"失败");
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
