package com.th.common.entity;

import java.util.Date;

public class TblTalk {
    private Integer id;

    private String content;

    private Integer srcaccountid;

    private Integer targetaccountid;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getSrcaccountid() {
        return srcaccountid;
    }

    public void setSrcaccountid(Integer srcaccountid) {
        this.srcaccountid = srcaccountid;
    }

    public Integer getTargetaccountid() {
        return targetaccountid;
    }

    public void setTargetaccountid(Integer targetaccountid) {
        this.targetaccountid = targetaccountid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}