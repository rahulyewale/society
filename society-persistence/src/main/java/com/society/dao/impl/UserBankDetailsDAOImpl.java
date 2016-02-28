package com.society.dao.impl;

import org.springframework.stereotype.Repository;

import com.society.dao.UserBankDetailsDAO;
import com.society.domain.entity.UserBankDetail;
import com.society.generic.dao.impl.SocietyDAOImpl;


@Repository
public class UserBankDetailsDAOImpl extends SocietyDAOImpl<UserBankDetail> implements UserBankDetailsDAO 
{}
