package com.oristartech.controller;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PageController {
	@RequestMapping("index")
	public String show(){
		return "index";
	}
	
	@RequestMapping("/")
	public String s(){
		return "cinema";
	}
	@RequestMapping("movie1")
	public String show1(Model model){
		
		try {
			String requestPath="http://172.23.158.102:8080/movie/1";
			HttpPost post = new HttpPost(requestPath);
			post.setHeader("Content-Type", "text/xml;charset=UTF-8");
			CloseableHttpClient client = HttpClients.createDefault();//新方法
			CloseableHttpResponse response;
			response = client.execute(post);	
			int statusCode = response.getStatusLine().getStatusCode();
			HttpEntity responseEntity= response.getEntity();
			String res=EntityUtils.toString(responseEntity);
			System.out.println(statusCode);
			System.out.println(res);
			ModelAndView modeAndView=new ModelAndView();
			modeAndView.getModel().put("movie", res);
			modeAndView.setViewName("movie1");
			return "movie1";
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
		return "";
	}
	@RequestMapping("movie2")
	public String show2(){
		return "movie2";
	}
	@RequestMapping("movie3")
	public String show3(){
		return "movie3";
	}
	@RequestMapping("movie4")
	public String show4(){
		return "movie4";
	}
	@RequestMapping("movie5")
	public String show5(){
		return "movie5";
	}
	@RequestMapping("movie6")
	public String show6(){
		return "movie6";
	}
	@RequestMapping("movie7")
	public String show7(){
		return "movie7";
	}
	@RequestMapping("movie8")
	public String show8(){
		return "movie8";
	}
	@RequestMapping("sit1")
	public String sit1(){
		return "sit1";
	}
}
