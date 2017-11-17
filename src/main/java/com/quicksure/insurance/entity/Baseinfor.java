package com.quicksure.insurance.entity;
/**
 * 主表基本信息
 */

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Baseinfor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6765213348517190255L;

	private String orderno;// 订单�?

	private String ownersname;// 车主姓名

	private String base_applicationname;// 投保�?

	private String insrntname;// 被保险人

	private String businesssource;// 业务来源

	private String jqpolicystartdate;// 交强险保险起�?

	private String jqpolicyenddate;// 交强险保险止�?

	private String sypolicystartdate;// 商业险保险起�?

	private String sypolicyenddate;// 商业险止�?

	private String syapplicationno;// 商业险投保单�?

	private String sypolicyno;// 商业险保�?

	private String jqpolicyno;// 交强险保�?

	private String jqapplicationno;// 交强险投保单�?

	private String vehiclename;// 车辆名称

	private String taxpremium;// 车船税金�?

	private String jqpremium;// 交强险保�?

	private String sypremium;// 商业险保�?

	private String createtime;

	private String updatetime;

	private Integer userinforid;// 用户表ID

	private Integer insuranceperinforid;// 人员信息表ID

	private Integer taxinforid;// 车船税ID

	private Integer vhlinforid;// 车辆信息ID

	private Integer deliveryinforid;// 配�?信息ID

	private int orderstate;// 订单状�?

	private String deptno;// 行政区域代码

	private String quoteno;// 保价单号

	private int underwritingcode;// 保险公司代码

    private String jqpolicystatus; //交强险保单状�?
    
    private String sypolicystatus; //商业险保单状�?
    
    private int paymentinforid; //支付信息ID
    
    private String origFlg; //续保标志  
    
    private String claimAdjustRsn; //去年赔款记录
    
    private String applyTotalAdj; //申请总折�?
    
    private String provinceName;  //车主省份名字
    
    private String cityName; //车主城市名字
    
    private String countyName; //车主镇名�?
   
	private  String deptAddress;//行驶区域地址
    
    private String applicationProvinceName; //投保人省份名�?
    
    private String applicationCityName; //投保人城市名�?
    
    private String applicationCountyName; //投保人镇名字
    
    private String insuredProvinceName; //被保人省份名�?
    
    private String insuredCityName; //被保人城市名�?
    
    private String insuredCountyName; //被保人镇名字
    
    private String deliveryProvinceName; //配�?人省名字

    private String deliveryCityName; //配�?人城市名�?
    
    private String deliveryCountyName; //配�?人镇名字
    
    private String totalPremium; //订单总金�?
    
	private String agentCode;//业务员编码，对应页面上的优惠�?
	
	private int paymentMethod; //支付方式�?0线下�?0线上
	
	private String syquerySequenceNo;//商业投保查询码
	
	private String jqquerySequenceNo;//交强投保查询码
	
	private int lastImplementPage;//最后执行页
		
	
	public int getLastImplementPage() {
		return lastImplementPage;
	}

	public void setLastImplementPage(int lastImplementPage) {
		this.lastImplementPage = lastImplementPage;
	}

	public String getSyquerySequenceNo() {
		return syquerySequenceNo;
	}

	public void setSyquerySequenceNo(String syquerySequenceNo) {
		this.syquerySequenceNo = syquerySequenceNo;
	}

	public String getJqquerySequenceNo() {
		return jqquerySequenceNo;
	}

	public void setJqquerySequenceNo(String jqquerySequenceNo) {
		this.jqquerySequenceNo = jqquerySequenceNo;
	}

	public String getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getTotalPremium() {
		return totalPremium;
	}

	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getOrigFlg() {
		return origFlg;
	}

	public void setOrigFlg(String origFlg) {
		this.origFlg = origFlg;
	}

	public String getClaimAdjustRsn() {
		return claimAdjustRsn;
	}

	public void setClaimAdjustRsn(String claimAdjustRsn) {
		this.claimAdjustRsn = claimAdjustRsn;
	}

	public String getApplyTotalAdj() {
		return applyTotalAdj;
	}

	public void setApplyTotalAdj(String applyTotalAdj) {
		this.applyTotalAdj = applyTotalAdj;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getOwnersname() {
		return ownersname;
	}

	public void setOwnersname(String ownersname) {
		this.ownersname = ownersname;
	}

	public String getBase_applicationname() {
		return base_applicationname;
	}

	public void setBase_applicationname(String base_applicationname) {
		this.base_applicationname = base_applicationname;
	}

	public String getInsrntname() {
		return insrntname;
	}

	public void setInsrntname(String insrntname) {
		this.insrntname = insrntname;
	}

	public String getBusinesssource() {
		return businesssource;
	}

	public void setBusinesssource(String businesssource) {
		this.businesssource = businesssource;
	}

	public String getJqpolicystartdate() {
		return jqpolicystartdate;
	}

	public void setJqpolicystartdate(String jqpolicystartdate) {
		this.jqpolicystartdate = jqpolicystartdate;
	}

	public String getJqpolicyenddate() {
		return jqpolicyenddate;
	}

	public void setJqpolicyenddate(String jqpolicyenddate) {
		this.jqpolicyenddate = jqpolicyenddate;
	}

	public String getSypolicystartdate() {
		return sypolicystartdate;
	}

	public void setSypolicystartdate(String sypolicystartdate) {
		this.sypolicystartdate = sypolicystartdate;
	}

	public String getSypolicyenddate() {
		return sypolicyenddate;
	}

	public void setSypolicyenddate(String sypolicyenddate) {
		this.sypolicyenddate = sypolicyenddate;
	}

	public String getSyapplicationno() {
		return syapplicationno;
	}

	public void setSyapplicationno(String syapplicationno) {
		this.syapplicationno = syapplicationno;
	}

	public String getSypolicyno() {
		return sypolicyno;
	}

	public void setSypolicyno(String sypolicyno) {
		this.sypolicyno = sypolicyno;
	}

	public String getJqpolicyno() {
		return jqpolicyno;
	}

	public void setJqpolicyno(String jqpolicyno) {
		this.jqpolicyno = jqpolicyno;
	}

	public String getJqapplicationno() {
		return jqapplicationno;
	}

	public void setJqapplicationno(String jqapplicationno) {
		this.jqapplicationno = jqapplicationno;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	public String getTaxpremium() {
		return taxpremium;
	}

	public void setTaxpremium(String taxpremium) {
		this.taxpremium = taxpremium;
	}

	public String getJqpremium() {
		return jqpremium;
	}

	public void setJqpremium(String jqpremium) {
		this.jqpremium = jqpremium;
	}

	public String getSypremium() {
		return sypremium;
	}

	public void setSypremium(String sypremium) {
		this.sypremium = sypremium;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getUserinforid() {
		return userinforid;
	}

	public void setUserinforid(Integer userinforid) {
		this.userinforid = userinforid;
	}

	public Integer getInsuranceperinforid() {
		return insuranceperinforid;
	}

	public void setInsuranceperinforid(Integer insuranceperinforid) {
		this.insuranceperinforid = insuranceperinforid;
	}

	public Integer getTaxinforid() {
		return taxinforid;
	}

	public void setTaxinforid(Integer taxinforid) {
		this.taxinforid = taxinforid;
	}

	public Integer getVhlinforid() {
		return vhlinforid;
	}

	public void setVhlinforid(Integer vhlinforid) {
		this.vhlinforid = vhlinforid;
	}

	public Integer getDeliveryinforid() {
		return deliveryinforid;
	}

	public void setDeliveryinforid(Integer deliveryinforid) {
		this.deliveryinforid = deliveryinforid;
	}

	public int getOrderstate() {
		return orderstate;
	}

	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getQuoteno() {
		return quoteno;
	}

	public void setQuoteno(String quoteno) {
		this.quoteno = quoteno;
	}

	public int getUnderwritingcode() {
		return underwritingcode;
	}

	public void setUnderwritingcode(int underwritingcode) {
		this.underwritingcode = underwritingcode;
	}


	public String getJqpolicystatus() {
		return jqpolicystatus;
	}

	public void setJqpolicystatus(String jqpolicystatus) {
		this.jqpolicystatus = jqpolicystatus;
	}

	public String getSypolicystatus() {
		return sypolicystatus;
	}

	public void setSypolicystatus(String sypolicystatus) {
		this.sypolicystatus = sypolicystatus;
	}

	public int getPaymentinforid() {
		return paymentinforid;
	}

	public void setPaymentinforid(int paymentinforid) {
		this.paymentinforid = paymentinforid;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getApplicationProvinceName() {
		return applicationProvinceName;
	}

	public void setApplicationProvinceName(String applicationProvinceName) {
		this.applicationProvinceName = applicationProvinceName;
	}

	public String getApplicationCityName() {
		return applicationCityName;
	}

	public void setApplicationCityName(String applicationCityName) {
		this.applicationCityName = applicationCityName;
	}

	public String getApplicationCountyName() {
		return applicationCountyName;
	}

	public void setApplicationCountyName(String applicationCountyName) {
		this.applicationCountyName = applicationCountyName;
	}

	public String getInsuredProvinceName() {
		return insuredProvinceName;
	}

	public void setInsuredProvinceName(String insuredProvinceName) {
		this.insuredProvinceName = insuredProvinceName;
	}

	public String getInsuredCityName() {
		return insuredCityName;
	}

	public void setInsuredCityName(String insuredCityName) {
		this.insuredCityName = insuredCityName;
	}

	public String getInsuredCountyName() {
		return insuredCountyName;
	}

	public void setInsuredCountyName(String insuredCountyName) {
		this.insuredCountyName = insuredCountyName;
	}

	public String getDeliveryProvinceName() {
		return deliveryProvinceName;
	}

	public void setDeliveryProvinceName(String deliveryProvinceName) {
		this.deliveryProvinceName = deliveryProvinceName;
	}

	public String getDeliveryCityName() {
		return deliveryCityName;
	}

	public void setDeliveryCityName(String deliveryCityName) {
		this.deliveryCityName = deliveryCityName;
	}

	public String getDeliveryCountyName() {
		return deliveryCountyName;
	}

	public void setDeliveryCountyName(String deliveryCountyName) {
		this.deliveryCountyName = deliveryCountyName;
	}
    public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	public int getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(int paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
    
}