package com.love_peace.blogmgm.param.vo;

import java.io.Serializable;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_10:10
 */
public class ResultVo implements Serializable {

    private static final long serialVersionUID = -2438382032810383931L;

    public static final Integer OK = 0;

    public static final Integer ERROR = 1;

    private Integer code;//1 失败  0 成功

    private String msg;//code为1的时候返回 错误字符串

    private Object content;//code为0的时候返回 业务数据

    public ResultVo() {

    }

    public ResultVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVo(Integer code, String msg, Object content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public static ResultVo putSuccess() {
        return new ResultVo(OK, "成功");
    }

    public static ResultVo putSuccess(Object content) {
        return new ResultVo(OK, "成功", content);
    }

    public static ResultVo putSuccess(String msg, Object content) {
        return new ResultVo(OK, msg, content);
    }

    public static ResultVo putError() {
        return new ResultVo(ERROR, "失败");
    }


    public static ResultVo putError(Object msg) {
        String strMsg = null;
        if (msg != null) strMsg = msg.toString();
        return new ResultVo(ERROR, strMsg, null);
    }

    public static ResultVo putError(Object msg, Object content) {
        String strMsg = null;
        if (msg != null) strMsg = msg.toString();
        return new ResultVo(ERROR, strMsg, content);
    }

    public static ResultVo put(Integer code, String msg) {
        return new ResultVo(code, msg);
    }

    public static ResultVo put(Integer code, String msg, Object content) {
        return new ResultVo(code, msg, content);
    }

}
