package com.society.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.society.dao.BankMasterDAO;
import com.society.domain.entity.BankMaster;
import com.society.generic.dao.impl.SocietyDAOImpl;


@Repository
public class BankMasterDAOImpl extends SocietyDAOImpl<BankMaster> implements BankMasterDAO 
{

	@Override
	public List<BankMaster> getBankMasterList() {
		

		List<BankMaster> bankMasterList = new ArrayList<BankMaster>(0);
		try
		{
			Query query = getEntityManager().createNamedQuery("BankMaster.findAll", BankMaster.class);
			bankMasterList = (List<BankMaster>) query.getResultList();
			//System.out.println("Expenses=" + expenses);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return bankMasterList;
	
	}

}
