package com.society.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.society.common.DateRange;
import com.society.dao.ExpenseDAO;
import com.society.domain.entity.Expense;
import com.society.generic.dao.impl.PersonalDAOImpl;

/**
 * The Class ExpenseDAOImpl.
 */
@Repository
public class ExpenseDAOImpl extends PersonalDAOImpl<Expense> implements ExpenseDAO
{

	/* (non-Javadoc)
	 * @see com.personal.dao.ExpenseDAO#getExpenseListForUser(com.personal.common.IncomeExpenseDateRange, java.lang.Integer)
	 */
	@Override
	@Transactional
	public List<Expense> getExpenseListForUser(DateRange incomeExpenseValueRange, Integer applicationUserId)
	{
		List<Expense> expenses = new ArrayList<Expense>(0);
		try
		{
			Query query = getEntityManager().createNamedQuery("Expense.expensesForGivenDateRage", Expense.class);
			query.setParameter("user_id", new Long(1));
			query.setParameter("startDate", incomeExpenseValueRange.getFromDate());
			query.setParameter("endDate", incomeExpenseValueRange.getToDate());
			expenses = (List<Expense>) query.getResultList();
			//System.out.println("Expenses=" + expenses);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return expenses;
	}

}
