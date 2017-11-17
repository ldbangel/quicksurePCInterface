package com.quicksure.insurance.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;

import com.quicksure.insurance.entity.AgentCode;
import com.quicksure.insurance.entity.Agreementinfor;
import com.quicksure.insurance.entity.Baseinfor;
import com.quicksure.insurance.entity.Coverageinfor;
import com.quicksure.insurance.entity.Deliveryinfor;
import com.quicksure.insurance.entity.Dptinfor;
import com.quicksure.insurance.entity.InsuranceDetailsVO;
import com.quicksure.insurance.entity.Insuranceperinfor;
import com.quicksure.insurance.entity.OTPGeneration;
import com.quicksure.insurance.entity.Taxinfor;
import com.quicksure.insurance.entity.Userinfor;
import com.quicksure.insurance.entity.Vhlinfor;


/**
 * The Interface InsureanceService.
 *
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunxiaodong
 * @date 2017-2-22 10:45:12
 */
public interface InsuranceService{

	/**
	 * Modle serach by vin.
	 *
	 * @param vhlinfor the vhlinfor
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO modleSerachByVin(Vhlinfor vhlinfor,InsuranceDetailsVO insuranceDetails
			);

	/**
	 * Modle serach by name.
	 *
	 * @param vhlinfor the vhlinfor
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO modleSerachByName(Vhlinfor vhlinfor,
			InsuranceDetailsVO insuranceDetails);
	
	public InsuranceDetailsVO modleSerachFromSinosafe(Vhlinfor vhlinfor,
			InsuranceDetailsVO insuranceDetails);

	/**
	 * Save vehicle date.
	 *
	 * @param vhlinfor the vhlinfor
	 * @param baseinfor the baseinfor
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO saveVehicleDate(Vhlinfor vhlinfor,
			Baseinfor baseinfor, InsuranceDetailsVO insuranceDetails);

	/**
	 * Go to vehicleinfor.
	 *
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO goToVehicleinfor(InsuranceDetailsVO insuranceDetails);

	/**
	 * Gets the alldeptinfor.
	 *
	 * @return the alldeptinfor
	 */
	public List<Dptinfor> getAlldeptinfor();

	/**
	 * Gets the vehicleinfor by ocr.
	 *
	 * @param myfile the myfile
	 * @param imgdata the imgdata
	 * @return the vehicleinfor by ocr
	 */
	public String getVehicleinforByOCR(MultipartFile myfile, String imgdata);

	/**
	 * Sets the page flag.
	 *
	 * @param orderNo the order no
	 * @param insuranceDetailsVO the insurance details vo
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO setPageFlag(String orderNo,
			InsuranceDetailsVO insuranceDetailsVO);

	/**
	 * Premium count.
	 *
	 * @param vhlinfor the vhlinfor
	 * @param baseinfor the baseinfor
	 * @param coverageinfors the coverageinfors
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO PremiumCount(Vhlinfor vhlinfor,
			Baseinfor baseinfor, List<Coverageinfor> coverageinfors,
			InsuranceDetailsVO insuranceDetailsVO);

	/**
	 * Save premium infor.
	 *
	 * @param modelMap the model map
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO savePremiumInfor(InsuranceDetailsVO insuranceDetailsVO);

	/**
	 * Submit underwriting.
	 *
	 * @param modelMap the model map
	 * @param deliveryinfor the deliveryinfor
	 * @param insuranceperinfor the insuranceperinfor
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO submitUnderwriting(
			InsuranceDetailsVO insuranceDetails);

	/**
	 * Save submit infor.
	 *
	 * @param baseinfor the baseinfor
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public void saveSubmitInfor(Baseinfor baseinfor);

	/**
	 * Adds the submit infor.
	 *
	 * @param deliveryinfor the deliveryinfor
	 * @param insuranceperinfor the insuranceperinfor
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO AddSubmitInfor(InsuranceDetailsVO insuranceDetails);

	/**
	 * Insert coverage batch.
	 *
	 * @param coverageinfors the coverageinfors
	 * @param baseinfor the baseinfor
	 * @param taxinfor the taxinfor
	 * @param agreementinfors the agreementinfors
	 * @param request the request
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public void insertCoverageBatch(List<Coverageinfor> coverageinfors,
			Baseinfor baseinfor, Taxinfor taxinfor,
			List<Agreementinfor> agreementinfors, HttpServletRequest request);

	/**
	 * Payment application.
	 *
	 * @param httpRequest the http request
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO paymentApplication(InsuranceDetailsVO insuranceDetailsVo);

	/**
	 * Update payment infor.
	 *
	 * @param request the request
	 * @param response the response
	 * @return true, if successful
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public boolean updatePaymentInfor(Baseinfor baseinfor);

	/**
	 * Process payment success data.
	 *
	 * @param request the request
	 * @param response the response
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO processPaymentSuccessData(String orderNo);

	/**
	 * Delivery to customer.
	 *
	 * @param deliveryinfor the deliveryinfor
	 * @param httprequest the httprequest
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:45:12
	 */
	public InsuranceDetailsVO deliveryToCustomer(
			InsuranceDetailsVO insuranceDetailsVO);
	
	public InsuranceDetailsVO selectDistributionInfors(String orderno);
	
	public String test(InsuranceDetailsVO insuranceDetailsVO);
	
	public String test2(Userinfor userinfor);
	
    public Userinfor userExists(Userinfor userinfor,int loginType) throws Exception;
	
	public String resetPassword(String phoneno,String password) throws Exception;
	
	public String userFindPassword(Userinfor userinfor,HttpServletRequest request);
	
	public String registUser(String username,String password, int type, String agentCode);
	
	public OTPGeneration validateCode(String phoneNo);
	
	public String phoneCodeExist(String phoneNo,String checkCode);
	
	public String userEverRegist(String username);
	
	public AgentCode validateAgentCode(String agentCode);
	
	public OTPGeneration templateSMS(String phoneNo,OTPGeneration otpGeneration);
	
}
