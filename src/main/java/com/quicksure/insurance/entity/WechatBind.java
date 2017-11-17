package com.quicksure.insurance.entity;

import java.io.Serializable;
import java.util.Date;

public class WechatBind implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7486853493480879525L;

	private Integer binduserid;

    private String openid;

    private String phoneno;

    private Integer phoneuserid;

    private Integer wechatuserid;

    private Date createtimes;

    public Integer getBinduserid() {
        return binduserid;
    }

    public void setBinduserid(Integer binduserid) {
        this.binduserid = binduserid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public Integer getPhoneuserid() {
        return phoneuserid;
    }

    public void setPhoneuserid(Integer phoneuserid) {
        this.phoneuserid = phoneuserid;
    }

    public Integer getWechatuserid() {
        return wechatuserid;
    }

    public void setWechatuserid(Integer wechatuserid) {
        this.wechatuserid = wechatuserid;
    }

    public Date getCreatetimes() {
        return createtimes;
    }

    public void setCreatetimes(Date createtimes) {
        this.createtimes = createtimes;
    }
}