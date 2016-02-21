package com.society.dao.impl;

import org.springframework.stereotype.Repository;

import com.society.dao.ItemInfoDAO;
import com.society.domain.entity.ItemInfo;
import com.society.generic.dao.impl.PersonalDAOImpl;


@Repository
public class ItemInfoDAOImpl extends PersonalDAOImpl<ItemInfo> implements ItemInfoDAO 
{

}
