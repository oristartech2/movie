package com.oristartech.service;

import java.util.List;
import com.oristartech.pojo.MovieTicket;

public interface MovieUserService {
	
	

	/**
	 * 需求:整合mybatis框架,查询数据库
	 * 
	 */
	public List<MovieTicket> findAll();
}
