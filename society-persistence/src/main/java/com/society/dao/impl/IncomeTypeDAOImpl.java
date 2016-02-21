package com.society.dao.impl;

import org.springframework.stereotype.Repository;

import com.society.dao.IncomeTypeDAO;
import com.society.domain.entity.IncomeType;
import com.society.generic.dao.impl.PersonalDAOImpl;


@Repository
public class IncomeTypeDAOImpl extends PersonalDAOImpl<IncomeType> implements IncomeTypeDAO 
{

}
