package com.oristartech.pojo;

import java.io.Serializable;
import java.util.Date;

public class MovieTicket implements Serializable{
    private Long id;

    private String title;

    private Long price;

    private Integer num;

    private String barcode;

    private String image;

    private Long cid;

    private String status;

    private Date play_time;
    private Date created;

    private Date updated;

	@Override
	public String toString() {
		return "MovieTicket [id=" + id + ", title=" + title + ", price=" + price + ", num=" + num + ", barcode="
				+ barcode + ", image=" + image + ", cid=" + cid + ", status=" + status + ", play_time=" + play_time
				+ ", created=" + created + ", updated=" + updated + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPlay_time() {
		return play_time;
	}

	public void setPlay_time(Date play_time) {
		this.play_time = play_time;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}
}