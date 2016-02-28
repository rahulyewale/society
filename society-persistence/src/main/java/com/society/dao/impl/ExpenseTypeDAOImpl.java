package com.society.dao.impl;

import org.springframework.stereotype.Repository;

import com.society.dao.ExpenseTypeDAO;
import com.society.domain.entity.ExpenseType;
import com.society.generic.dao.impl.SocietyDAOImpl;


@Repository
public class ExpenseTypeDAOImpl extends SocietyDAOImpl<ExpenseType> implements ExpenseTypeDAO 
{

}
