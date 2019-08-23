package com.example.demo;

public class card {
    private Integer cno;
    private String cname;
    private String cxb;
    private  int money;
	public Integer getCno() {
		return cno;
	}
	public void setCno(Integer cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCxb() {
		return cxb;
	}
	public void setCxb(String cxb) {
		this.cxb = cxb;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public card(Integer cno, String cname, String cxb, int money) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.cxb = cxb;
		this.money = money;
	}
	public card() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
