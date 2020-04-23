package com.lh.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class NotePadT {

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date time;

    private String value;


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }


}