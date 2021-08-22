package com.newlecture.web.entity;

import java.util.Date;

public class Orders {
	private long id;
	private Date registerDate;
	private String receiverName;
	private String receiverPhone;
	private String addr;
	private long userId;
	private long userRole;
	public Orders(long id, Date registerDate, String receiverName, String receiverPhone, String addr, long userId,
			long userRole) {
		super();
		this.id = id;
		this.registerDate = registerDate;
		this.receiverName = receiverName;
		this.receiverPhone = receiverPhone;
		this.addr = addr;
		this.userId = userId;
		this.userRole = userRole;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getUserRole() {
		return userRole;
	}
	public void setUserRole(long userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", registerDate=" + registerDate + ", receiverName=" + receiverName
				+ ", receiverPhone=" + receiverPhone + ", addr=" + addr + ", userId=" + userId + ", userRole="
				+ userRole + "]";
	}
	
}
