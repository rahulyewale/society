package com.society.rest.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.society.common.DateRange;
import com.society.common.json.util.CommonUtil;
import com.society.dao.IncomeDAO;
import com.society.domain.entity.Income;
import com.society.dto.IncomeDetails;

/**
 * The Class IncomeService.
 */
@Component
public class IncomeService
{
	
	/** The income dao. */
	@Autowired
	private IncomeDAO incomeDAO;

	/**
	 * Gets the income list for user.
	 *
	 * @param incomeExpenseValueRange the income expense value range
	 * @param applicationUserId the application user id
	 * @return the income list for user
	 */
	public IncomeDetails getIncomeDetailsForUserByDateRange(DateRange incomeExpenseValueRange, Integer applicationUserId)
	{
		IncomeDetails incomeResponse = new IncomeDetails();

		List<Income> incomeListForUser = incomeDAO.getIncomeListForUser(incomeExpenseValueRange, applicationUserId);

		List<com.society.dto.Income> incomeDTO = getIncomeDTO(incomeListForUser);

		incomeResponse.setIncomeList(incomeDTO);

		incomeResponse.setTotalIncome(getTotalIncome(incomeListForUser));

		return incomeResponse;

	}

	/**
	 * Gets the total income.
	 *
	 * @param list of type Income
	 * @return Double Value
	 */
	private Double getTotalIncome(List<Income> incomeListForUser)
	{	
		Double totalIncome = new Double(0.0);
		
		for (Income income : incomeListForUser)
		{
			totalIncome += income.getIncomeAmount();
		}
		
		return totalIncome;
	}

	/**This is Temporary Method to convert Entity to DTO
	 * Replacement will be Orika Mapper
	 *
	 * @param list incomeListForUser
	 * @return list<com.personal.dto.Income>
	 */
	private List<com.society.dto.Income> getIncomeDTO(List<Income> incomeListForUser)
	{
		List<com.society.dto.Income> incomeList = new ArrayList<com.society.dto.Income>(0);
		for (Income income : incomeListForUser)
		{
			com.society.dto.Income incomeDTO = new com.society.dto.Income(income.getIncomeType().getIncomeTypeName(), income.getIncomeDescription(), income.getIncomeAmount(), null);
			incomeDTO.setIncomeDate(CommonUtil.getDateStringFromTimestamp(income.getIncomeDate()));
			incomeList.add(incomeDTO);
		}
		return incomeList;
	}

}
