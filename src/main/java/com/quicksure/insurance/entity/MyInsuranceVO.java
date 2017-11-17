package com.quicksure.insurance.entity;

import java.io.Serializable;

public class MyInsuranceVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3928905336026646404L;
	private int Id;
	private Baseinfor baseinfor;
	private Vhlinfor vhlinfor;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Baseinfor getBaseinfor() {
		return baseinfor;
	}
	public void setBaseinfor(Baseinfor baseinfor) {
		this.baseinfor = baseinfor;
	}
	public Vhlinfor getVhlinfor() {
		return vhlinfor;
	}
	public void setVhlinfor(Vhlinfor vhlinfor) {
		this.vhlinfor = vhlinfor;
	}
	
}
