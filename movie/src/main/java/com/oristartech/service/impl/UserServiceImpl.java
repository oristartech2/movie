package com.oristartech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oristartech.mapper.MovieUserMapper;
import com.oristartech.pojo.MovieTicket;
import com.oristartech.service.MovieUserService;
@Service
public class UserServiceImpl implements MovieUserService {
	
	//注入mapper接口代理对象
	@Autowired
	private MovieUserMapper movieUserMapper;
	/**
	 * 需求:整合mybatis框架,查询所有商品数据
	 */

	@Override
	public List<MovieTicket> findAll() {
		// TODO Auto-generated method stub
		List<MovieTicket> list = movieUserMapper.findAll();
		return list;
	}
	

}
