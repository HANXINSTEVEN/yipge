package com.oracle.entity;

public class shop_cart {
	private int cid; //���ﳵid
	
	private String cimgname; //��ƷͼƬ����
	private String  pname;	 //��Ʒ����
	private  double price;	//��Ʒ�۸�
	private int cquantity;   //��������
	private int cstock;	//��Ʒ���
	private int pid ; //��Ʒid
	private int uid ; //�û�id
	private int cvalid; //�����Ƿ���Ч ���ü��� ��session
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
