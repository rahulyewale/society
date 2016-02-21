package com.society.rest.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.society.common.CommonConstants;
import com.society.common.ResponseData;
import com.society.common.ServiceRequest;
import com.society.common.ServiceResponse;
import com.society.common.constant.ResponseCategory;
import com.society.common.constant.ResponseSeverity;
import com.society.common.constant.ResponseType;
import com.society.dto.IncomeExpenseSummaryResponse;

/**
 * The IncomeExpenseServiceController use-full to server the incomeExpenseRequest for given period of Date.
 */
@Controller
public class IncomeExpenseServiceController
{

	/** The Constant APPLICATION_JSON. */
	private static final String APPLICATION_JSON = "application/json";

	/** The income expense summary service. */
	@Autowired
	private IncomeExpenseSummaryService incomeExpenseSummaryService;
	
	/**
	 * This service operation use to serve Income Expense Request.
	 *
	 * @param serviceRequest the service request
	 * @return serviceResponse
	 */

	@RequestMapping(value = CommonConstants.RequestMapping.INCOME_EXPENSE_SUMMARY, method = RequestMethod.POST, consumes = APPLICATION_JSON, produces = APPLICATION_JSON)
	@ResponseBody
	public ServiceResponse getIncomeExpenseSummary(@RequestBody	ServiceRequest serviceRequest)
	{
		return prepareServiceReponse(incomeExpenseSummaryService.getIncomeExpenseSummary(serviceRequest));
	}

	
	/**
	 * method use to prepare the ServiceResponse
	 *
	 * @param incomeExpenseSummaryResponse the income expense summary response
	 * @return the service response
	 */
	private ServiceResponse prepareServiceReponse(IncomeExpenseSummaryResponse incomeExpenseSummaryResponse)
	{
		ResponseData responseData = new ResponseData(ResponseType.SUCCESS, ResponseSeverity.INFO, ResponseCategory.SUCCESS, "Success");
		
		return new ServiceResponse(responseData, CommonConstants.RequestMesageMapKeyConstant.INCOME_EXPENSE_RESPONSE_KEY, incomeExpenseSummaryResponse);
	}

}
