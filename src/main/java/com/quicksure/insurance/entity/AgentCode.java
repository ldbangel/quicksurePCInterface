package com.quicksure.insurance.entity;

import java.io.Serializable;
import java.util.Date;

public class AgentCode implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6544560864052360205L;

	private Integer agentcodeid;

    private String agentcode;

    private Integer userid;

    private Integer codestatus;

    private Date createtimes;

    public Integer getAgentcodeid() {
        return agentcodeid;
    }

    public void setAgentcodeid(Integer agentcodeid) {
        this.agentcodeid = agentcodeid;
    }

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode == null ? null : agentcode.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCodestatus() {
        return codestatus;
    }

    public void setCodestatus(Integer codestatus) {
        this.codestatus = codestatus;
    }

    public Date getCreatetimes() {
        return createtimes;
    }

    public void setCreatetimes(Date createtimes) {
        this.createtimes = createtimes;
    }
}