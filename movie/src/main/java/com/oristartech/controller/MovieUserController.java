package com.oristartech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oristartech.pojo.MovieTicket;
import com.oristartech.pojo.MovieUser;
import com.oristartech.service.MovieUserService;

@RestController
public class MovieUserController {
	
	//注入service对象
	@Autowired
	private MovieUserService movieUserService;
	
	/**
	 * 需求:展示页面
	 */
	
	/**
	 * 需求:返回json格式user对象
	 */
	@RequestMapping("/info")
	public MovieUser showInfo(){
		//创建用户对象
		MovieUser movieUser = new MovieUser();
		movieUser.setId("u1010110110");
		movieUser.setUsername("张三丰");
		movieUser.setPassword("12345");
		movieUser.setEmail("zhangsanfeng@qq.com");
		
		return movieUser;
	}
	/**
	 * 需求:整合mybatis框架,查询数据库
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<MovieTicket> showMybatis(){
		List<MovieTicket> list = movieUserService.findAll();
		
		return list;
		}
	
	@RequestMapping("/find")
	public String shows(){
		List<MovieTicket> list = movieUserService.findAll();
		String string="";
		for (MovieTicket movieTicket : list) {
			string = movieTicket.toString();
		}
		return string;
		}
}
