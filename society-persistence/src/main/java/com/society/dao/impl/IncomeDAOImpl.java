package com.society.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.society.common.DateRange;
import com.society.dao.IncomeDAO;
import com.society.domain.entity.Income;
import com.society.generic.dao.impl.SocietyDAOImpl;

/**
 * The Class IncomeDAOImpl.
 */
@Repository
public class IncomeDAOImpl extends SocietyDAOImpl<Income> implements IncomeDAO
{

	/* (non-Javadoc)
	 * @see com.personal.dao.IncomeDAO#getIncomeListForUser(com.personal.common.IncomeExpenseDateRange, java.lang.Integer)
	 */
	@Override
	@Transactional
	public List<Income> getIncomeListForUser(DateRange incomeExpenseValueRange,Integer applicationUserId)
	{

		List<Income> incomeList = new ArrayList<Income>();
		try
		{
			Query query = getEntityManager().createNamedQuery("Income.incomeListForUser", Income.class);
			query.setParameter("user_Id", new Long(1));
			query.setParameter("startDate", incomeExpenseValueRange.getFromDate(),TemporalType.DATE);
			query.setParameter("endDate", incomeExpenseValueRange.getToDate(),TemporalType.DATE);
			incomeList = (List<Income>) query.getResultList();
			//System.out.println(""+incomeList);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return incomeList;
	}
}
