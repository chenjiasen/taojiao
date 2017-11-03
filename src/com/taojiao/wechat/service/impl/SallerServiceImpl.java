package com.taojiao.wechat.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.taojiao.wechat.dao.SallerDao;
import com.taojiao.wechat.domain.Saller;
import com.taojiao.wechat.pageination.Page;
import com.taojiao.wechat.service.SallerService;
@Service
public class SallerServiceImpl implements SallerService {
	//依赖注入
	@Resource
	SallerDao sallerDao;

	@Override
	public List<Saller> findPage(Page page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saller> find(Map paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Saller get(Serializable id) {
		// TODO Auto-generated method stub
		Saller saller = sallerDao.get(id);
		return saller;
	}

	@Override
	public void insert(Saller entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Saller entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Serializable[] ids) {
		// TODO Auto-generated method stub
		
	}

}
