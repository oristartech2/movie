package com.oristartech.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.Header;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oristartech.pojo.MovieTicket;
import com.oristartech.service.MovieUserService;

@RestController
public class MovieTicketController {
	
	//注入service对象
	@Autowired
	private MovieUserService movieUserService;
	/**
	 * 需求:整合mybatis框架,查询数据库
	 */
	@RequestMapping("/findAll")
	@ResponseBody	
	public String shows(){
		List<MovieTicket> list = movieUserService.findAll();
		String string="";
		for (MovieTicket movieTicket : list) {
			string = movieTicket.toString();
		}
		return string;
		}
	@RequestMapping(value="showTicket/{id}",method=RequestMethod.POST)
	public String service(@PathVariable Integer id,HttpServletRequest request){
		String parameter = request.getParameter("time");
		try {
			String requestPath1="http://172.23.158.102:8080/movie/"+id;
			HttpGet get1=new HttpGet(requestPath1);
			/*HttpPost post = new HttpPost(requestPath);*/
			get1.setHeader("Content-Type", "application/json;charset=UTF-8");
			CloseableHttpClient client = HttpClients.createDefault();//新方法
			CloseableHttpResponse response1;
			response1 = client.execute(get1);	
			int statusCode1 = response1.getStatusLine().getStatusCode();
			HttpEntity responseEntity= response1.getEntity();
			String string1 = EntityUtils.toString(responseEntity);
			string1+="放映时间："+parameter;
			System.out.println(statusCode1);
			System.out.println(string1);
			
			String requestPath2="http://172.23.159.48:8080/findAllHall";
			HttpGet get2=new HttpGet(requestPath2);
			/*HttpPost post = new HttpPost(requestPath);*/
			get1.setHeader("Content-Type", "application/json;charset=UTF-8");
			CloseableHttpResponse response2;
			response2 = client.execute(get2);	
			int statusCode2 = response2.getStatusLine().getStatusCode();
			HttpEntity responseEntity2= response2.getEntity();
			String string2 = EntityUtils.toString(responseEntity2);
			String[] strings = string2.split(",");
			string1+=strings[2];
			string1+=strings[7];
			string1="大地影院"+"\r\n"+string1;
			return string1;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
