package com.oristartech.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.oristartech.pojo.MovieTicket;
@Mapper
public interface MovieUserMapper {
	
	public List<MovieTicket> findAll();

}
