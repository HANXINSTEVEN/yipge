package com.oracle.entity;

public class shop_cart {
	private int cid; //购物车id
	
	private String cimgname; //商品图片名称
	private String  pname;	 //产品名称
	private  double price;	//商品价格
	private int cquantity;   //购买数量
	private int cstock;	//商品库存
	private int pid ; //商品id
	
	private int uid ; //用户id
	private int cvalid; //订单是否有效 设置监听 存session
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCimgname() {
		return cimgname;
	}
	public void setCimgname(String cimgname) {
		this.cimgname = cimgname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCquantity() {
		return cquantity;
	}
	public void setCquantity(int cquantity) {
		this.cquantity = cquantity;
	}
	public int getCstock() {
		return cstock;
	}
	public void setCstock(int cstock) {
		this.cstock = cstock;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getCvalid() {
		return cvalid;
	}
	public void setCvalid(int cvalid) {
		this.cvalid = cvalid;
	}
	public shop_cart(int cid, String cimgname, String pname, double price, int cquantity, int cstock, int pid, int uid,
			int cvalid) {
		super();
		this.cid = cid;
		this.cimgname = cimgname;
		this.pname = pname;
		this.price = price;
		this.cquantity = cquantity;
		this.cstock = cstock;
		this.pid = pid;
		this.uid = uid;
		this.cvalid = cvalid;
	}
	@Override
	public String toString() {
		return "shop_cart [cid=" + cid + ", cimgname=" + cimgname + ", pname=" + pname + ", price=" + price
				+ ", cquantity=" + cquantity + ", cstock=" + cstock + ", pid=" + pid + ", uid=" + uid + ", cvalid="
				+ cvalid + "]";
	}
	public shop_cart() {
		super();
	}
	
}
