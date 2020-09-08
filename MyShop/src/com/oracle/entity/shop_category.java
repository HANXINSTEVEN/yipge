package com.oracle.entity;

public class shop_category {
	private int cid; //分类id
	private String cname; //分类名称
	private int parentid; //上级分类
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public shop_category(int cid, String cname, int parentid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.parentid = parentid;
	}
	public shop_category() {
		super();
	}
	@Override
	public String toString() {
		return "shop_category [cid=" + cid + ", cname=" + cname + ", parentid=" + parentid + "]";
	}
	
}
