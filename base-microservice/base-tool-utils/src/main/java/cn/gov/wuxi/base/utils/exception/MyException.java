package cn.gov.wuxi.base.utils.exception;

/**
 * Author:王春伟
 * Date:2019/2/22
 * 全局统一异常类
 **/
public class MyException extends Exception{

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MyException() {
        super();
    }

    public MyException(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }
}
