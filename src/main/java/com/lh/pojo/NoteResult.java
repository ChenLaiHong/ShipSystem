package com.lh.pojo;

import java.util.List;

/**
 * Created by laiHom on 2020/4/20.
 */
public class NoteResult {
    private int code;
    private String msg;
    private List<NotePadT> data;

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

    public List<NotePadT> getData() {
        return data;
    }

    public void setData(List<NotePadT> data) {
        this.data = data;
    }


}
