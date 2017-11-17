package com.quicksure.insurance.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.quicksure.insurance.entity.AgentCode;
import com.quicksure.insurance.entity.Baseinfor;
import com.quicksure.insurance.entity.Coverageinfor;
import com.quicksure.insurance.entity.InsuranceDetailsVO;
import com.quicksure.insurance.entity.OTPGeneration;
import com.quicksure.insurance.entity.Userinfor;

/**
 * The Interface MyAccountService.
 *
 * @Description: (这里用一句话描述这个类的作用)
 * @author sunxiaodong
 * @date 2017-2-22 10:48:39
 */
public interface MyAccountService {

	/**
	 * User exists.
	 *
	 * @param userinfor the userinfor
	 * @param request the request
	 * @return the string
	 * @throws Exception the exception
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String userExists(Userinfor userinfor, HttpServletRequest request)
			throws Exception;

	/**
	 * Reset password.
	 *
	 * @param phoneno the phoneno
	 * @param password the password
	 * @return the string
	 * @throws Exception the exception
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String resetPassword(String phoneno, String password)
			throws Exception;

	/**
	 * User find password.
	 *
	 * @param userinfor the userinfor
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String userFindPassword(Userinfor userinfor,
			HttpServletRequest request);

	/**
	 * Regist user.
	 *
	 * @param username the username
	 * @param password the password
	 * @param type the type
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String registUser(String username, String password, int type,
			HttpServletRequest request);

	/**
	 * Validate code.
	 *
	 * @param phoneNo the phone no
	 * @param request the request
	 * @return the oTP generation
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public OTPGeneration validateCode(String phoneNo, HttpServletRequest request);

	/**
	 * Phone code exist.
	 *
	 * @param phoneNo the phone no
	 * @param checkCode the check code
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String phoneCodeExist(String phoneNo, String checkCode,
			HttpServletRequest request);

	/**
	 * User ever regist.
	 *
	 * @param username the username
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String userEverRegist(String username);

	/**
	 * Validate agent code.
	 *
	 * @param agentCode the agent code
	 * @return the agent code
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public AgentCode validateAgentCode(String agentCode);

	/**
	 * Gets the my orders infor.
	 *
	 * @param request the request
	 * @return the my orders infor
	 */
	public Map<String, Object> getMyOrdersInfor(Map<String,Object> map);

	/**
	 * Cancel order.
	 *
	 * @param orderNo the order no
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String cancelOrder(String orderNo);

	/**
	 * Continue pay.
	 *
	 * @param orderNo the order no
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String continuePay(String orderNo);

	/**
	 * Continue insure.
	 *
	 * @param orderNo the order no
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public Map<String,Object> continueInsure(String orderNo);

	/**
	 * Show order detail.
	 *
	 * @param orderNo the order no
	 * @param request the request
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public InsuranceDetailsVO showOrderDetail(String orderNo);

	/**
	 * Gets the my account init infor.
	 *
	 * @param request the request
	 * @return the my account init infor
	 */
	public Map<String, Object> getMyAccountInitInfor(Userinfor userinfor,String startTime,String endTime);

	/**
	 * Gets the list coverage.
	 *
	 * @param orderNo the order no
	 * @return the list coverage
	 */
	public List<Coverageinfor> getListCoverage(String orderNo);

	/**
	 * Gets the orderinformation.
	 *
	 * @param map the map
	 * @param request the request
	 * @return the orderinformation
	 */
	public List<InsuranceDetailsVO> getOrderinformation(
			Map<String, Object> map, HttpServletRequest request);

	/**
	 * Cancel order no.
	 *
	 * @param baseinfor the baseinfor
	 * @param request the request
	 * @return the string
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public String cancelOrderNo(Baseinfor baseinfor, HttpServletRequest request);

	/**
	 * Continue payment.
	 *
	 * @param insuranceDetails the insurance details
	 * @param request the request
	 * @param response the response
	 * @return the insurance details vo
	 * @Description: (这里用一句话描述这个方法的作用)
	 * @author sunxiaodong
	 * @date 2017-2-22 10:48:39
	 */
	public InsuranceDetailsVO continuePayment(
			InsuranceDetailsVO insuranceDetails, HttpServletRequest request,
			HttpServletResponse response);

	/**
	 * Gets the all baseinfor.
	 *
	 * @return the all baseinfor
	 */
	public List<Baseinfor> getAllBaseinfor();
}
