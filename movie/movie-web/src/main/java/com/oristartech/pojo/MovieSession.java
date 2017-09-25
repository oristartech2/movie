package com.oristartech.pojo;

public class MovieSession {
	//票id
    private long MId;
    //电影院名
	private String CinemaName;
	//影厅名
	private String HallName;
	//座次
	private long SeatName;
	//电影名
	private String name;
	//电影类型
	private String type;
	//语言
	private String  language;
	//价格
	private long price;
	//是否3d
	private String sight;
	//放映时间
	private  String beginTime;
	public long getMId() {
		return MId;
	}
	public void setMId(long mId) {
		MId = mId;
	}
	public String getCinemaName() {
		return CinemaName;
	}
	public void setCinemaName(String cinemaName) {
		CinemaName = cinemaName;
	}
	public String getHallName() {
		return HallName;
	}
	public void setHallName(String hallName) {
		HallName = hallName;
	}
	public long getSeatName() {
		return SeatName;
	}
	public void setSeatName(long seatName) {
		SeatName = seatName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getSight() {
		return sight;
	}
	public void setSight(String sight) {
		this.sight = sight;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	
}
