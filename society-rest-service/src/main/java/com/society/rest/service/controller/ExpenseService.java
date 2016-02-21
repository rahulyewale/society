package com.society.rest.service.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.society.common.DateRange;
import com.society.common.json.util.CommonUtil;
import com.society.dao.ExpenseDAO;
import com.society.domain.entity.Expense;
import com.society.dto.ExpenseDetails;

/**
 * The Class ExpenseService.
 */
@Component
public class ExpenseService
{
	
	/** The expense dao. */
	@Autowired
	private ExpenseDAO expenseDAO;

	/**
	 * Gets the expense list for user.
	 *
	 * @param incomeExpenseValueRange the income expense value range
	 * @param applicationUserId the application user id
	 * @return the expense list for user
	 */
	public ExpenseDetails getExpenseDetailsForUserByDateRange(DateRange incomeExpenseValueRange, Integer applicationUserId)
	{
		ExpenseDetails expenseResponse = new ExpenseDetails();
		
		List<Expense> expensesOfUserForGivenDates = expenseDAO.getExpenseListForUser(incomeExpenseValueRange, applicationUserId);
		
		List<com.society.dto.Expense> expenseDTO = getExpenseDTO(expensesOfUserForGivenDates);
		
		expenseResponse.setExpenseList(expenseDTO);
		
		expenseResponse.setTotalExpense(getTotalExpensesForTheGivenDuration(expensesOfUserForGivenDates));

		return expenseResponse;
	}
	
	/**
	 * Gets the total expenses for the given duration.
	 *
	 * @param expenses the expenses
	 * @return the total expenses for the given duration
	 */
	private Double getTotalExpensesForTheGivenDuration(List<Expense> expenses)
	{
		Double totalExpenseAmount = new Double(0.0);
		
		for (Expense expense : expenses)
		{
			totalExpenseAmount += expense.getExpenseAmount();
		}
		
		return totalExpenseAmount;
	}

	/**
	 * Gets the expense dto.
	 *
	 * @param expensesOfUserForGivenDates the expenses of user for given dates
	 * @return the expense dto
	 */
	private List<com.society.dto.Expense> getExpenseDTO(List<Expense> expensesOfUserForGivenDates)
	{
		List<com.society.dto.Expense> expenseList = new ArrayList<com.society.dto.Expense>(0);

		for (Expense expense : expensesOfUserForGivenDates)
		{
			com.society.dto.Expense expenseDTO = new com.society.dto.Expense(expense.getExpenseType().getExpenseTypeName(), expense.getExpenseDescription(), expense.getExpenseAmount(),null, expense.getIsInvestment());
			expenseDTO.setExpenseDate(CommonUtil.getDateStringFromTimestamp(expense.getExpenseDate()));
			expenseList.add(expenseDTO);
			
		}
		return expenseList;
	}

}
