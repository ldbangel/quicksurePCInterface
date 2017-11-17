package com.quicksure.insurance.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.quicksure.insurance.entity.Baseinfor;
import com.quicksure.insurance.entity.Coverageinfor;
import com.quicksure.insurance.entity.Deliveryinfor;
import com.quicksure.insurance.entity.Dptinfor;
import com.quicksure.insurance.entity.DropdownListInfor;
import com.quicksure.insurance.entity.InsuranceDetailsVO;
import com.quicksure.insurance.entity.Insuranceperinfor;
import com.quicksure.insurance.entity.InterfaceDetails;
import com.quicksure.insurance.entity.InterfaceslogsWithBLOBs;
import com.quicksure.insurance.entity.Paymentinfor;
import com.quicksure.insurance.entity.Taxinfor;
import com.quicksure.insurance.entity.Userinfor;
import com.quicksure.insurance.entity.Vhlinfor;

public class InsuranceDetailsVOHelp {
	/**
    * 大对象初始化
    * 孙小东
    * @return
    */
   public static InsuranceDetailsVO initInsuranceDetailsVO(){
	   InsuranceDetailsVO insuranceDetailsVO= new InsuranceDetailsVO();
	   
	   Baseinfor baseinfor=new Baseinfor();
	   Deliveryinfor deliveryinfor=new Deliveryinfor();
	   Dptinfor dptinfor=new Dptinfor();
	   DropdownListInfor dropdownListInfor=new DropdownListInfor();
	   Insuranceperinfor insuranceperinfor=new Insuranceperinfor();
	   InterfaceDetails interfaceDetails=new InterfaceDetails();
	   Paymentinfor paymentinfor=new Paymentinfor();
	   Taxinfor taxinfor=new Taxinfor();
	   Userinfor userinfor=new Userinfor();
	   Vhlinfor vhlinfor=new Vhlinfor();
	   InterfaceslogsWithBLOBs interfaceslogsWithBLOBs=new InterfaceslogsWithBLOBs();
	   List<Map<String, Object>> vhlinfoLis=new ArrayList<Map<String,Object>>();
	   List<Coverageinfor> coverageinfors=new ArrayList<Coverageinfor>();
	   
	   insuranceDetailsVO.setBaseinfor(baseinfor);
	   insuranceDetailsVO.setCoverageinfors(coverageinfors);
	   insuranceDetailsVO.setDeliveryinfor(deliveryinfor);
	   insuranceDetailsVO.setDptinfor(dptinfor);
	   insuranceDetailsVO.setDropdownListInfor(dropdownListInfor);
	   insuranceDetailsVO.setInsuranceperinfor(insuranceperinfor);
	   insuranceDetailsVO.setInterfaceDetails(interfaceDetails);
	   insuranceDetailsVO.setInterfaceslogsWithBLOBs(interfaceslogsWithBLOBs);
	   insuranceDetailsVO.setTaxinfor(taxinfor);
	   insuranceDetailsVO.setUserinfor(userinfor);
	   insuranceDetailsVO.setVhlinfoList(vhlinfoLis);
	   insuranceDetailsVO.setPaymentinfor(paymentinfor);
	   insuranceDetailsVO.setVhlinfor(vhlinfor);
	   
	   return insuranceDetailsVO;
   }
}
