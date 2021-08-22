package com.newlecture.web.entity;

import java.util.Date;

public class ProductImageFile {
	private long id;
	private long productId;
	private String originName;
	private String remoteName;
	private long fileSize;
	private Date registerDate;
	public ProductImageFile(long id, long productId, String originName, String remoteName, long fileSize,
			Date registerDate) {
		super();
		this.id = id;
		this.productId = productId;
		this.originName = originName;
		this.remoteName = remoteName;
		this.fileSize = fileSize;
		this.registerDate = registerDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getRemoteName() {
		return remoteName;
	}
	public void setRemoteName(String remoteName) {
		this.remoteName = remoteName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String toString() {
		return "ProductImageFile [id=" + id + ", productId=" + productId + ", originName=" + originName
				+ ", remoteName=" + remoteName + ", fileSize=" + fileSize + ", registerDate=" + registerDate + "]";
	}
	
}
