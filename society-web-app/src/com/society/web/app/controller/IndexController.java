package com.society.web.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.society.common.CommonConstants;
import com.society.common.ServiceRequest;
import com.society.common.ServiceResponse;
import com.society.common.context.ContextInfo;
import com.society.common.json.util.JsonUtil;
import com.society.dto.IncomeExpenseSummaryRequest;
import com.society.dto.IncomeExpenseSummaryResponse;
import com.society.rest.client.RestServiceInvoker;

@Controller
public class IndexController
{
	@Autowired	
	RestServiceInvoker restServiceInvoker;
	
	@RequestMapping("/welcome")
	public ModelAndView displayWelcomePage()
	{
		ContextInfo contextInfo = new ContextInfo("System");

		ServiceRequest serviceRequest = new ServiceRequest(contextInfo);

		serviceRequest.add(CommonConstants.RequestMesageMapKeyConstant.INCOME_EXPENSE_REQUEST_KEY, new IncomeExpenseSummaryRequest());
		
		ServiceResponse serviceResponse = restServiceInvoker.invokeRestService(serviceRequest, CommonConstants.RequestMapping.INCOME_EXPENSE_SUMMARY);

		IncomeExpenseSummaryResponse incomeExpenseSummaryResponse = null;
		String responseString;
		try
		{
			responseString = JsonUtil.convertObjectToJson(serviceResponse.get(CommonConstants.RequestMesageMapKeyConstant.INCOME_EXPENSE_RESPONSE_KEY));

			incomeExpenseSummaryResponse = (IncomeExpenseSummaryResponse) JsonUtil.convertJsonToObject(responseString, IncomeExpenseSummaryResponse.class);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return new ModelAndView("welcome");
	}

}
