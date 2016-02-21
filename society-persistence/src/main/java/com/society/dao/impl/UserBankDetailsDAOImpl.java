package com.society.dao.impl;

import org.springframework.stereotype.Repository;

import com.society.dao.UserBankDetailsDAO;
import com.society.domain.entity.UserBankDetail;
import com.society.generic.dao.impl.PersonalDAOImpl;


@Repository
public class UserBankDetailsDAOImpl extends PersonalDAOImpl<UserBankDetail> implements UserBankDetailsDAO 
{}
