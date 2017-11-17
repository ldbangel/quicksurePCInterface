package com.quicksure.insurance.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class InterfaceslogsWithBLOBs extends Interfaceslogs implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 917849428024930729L;

	private String requestxml;

    private String responsexml;

    public String getRequestxml() {
        return requestxml;
    }

    public void setRequestxml(String requestxml) {
        this.requestxml = requestxml == null ? null : requestxml.trim();
    }

    public String getResponsexml() {
        return responsexml;
    }

    public void setResponsexml(String responsexml) {
        this.responsexml = responsexml == null ? null : responsexml.trim();
    }
}