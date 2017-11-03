package com.taojiao.wechat.dao.impl;

import org.springframework.stereotype.Repository;

import com.taojiao.wechat.dao.BaseDaoImpl;
import com.taojiao.wechat.dao.SallerDao; 
import com.taojiao.wechat.domain.Saller;
@Repository
public class SallerDaoImpl extends BaseDaoImpl<Saller> implements SallerDao{
	public SallerDaoImpl() {
		// TODO Auto-generated constructor stub
		super.setNs("com.taojiao.wechat.mapper.SallerMapper");
	}
}
