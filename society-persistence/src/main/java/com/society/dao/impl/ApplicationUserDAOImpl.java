package com.society.dao.impl;

import org.springframework.stereotype.Repository;

import com.society.dao.ApplicationUserDAO;
import com.society.domain.entity.ApplicationUser;
import com.society.generic.dao.impl.PersonalDAOImpl;


@Repository
public class ApplicationUserDAOImpl extends PersonalDAOImpl<ApplicationUser> implements ApplicationUserDAO 
{

}
