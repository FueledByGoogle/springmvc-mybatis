package com.ssm.dao.entities;

public class User {

	private int iD;
	private String name;

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [iD=" + iD + ", name=" + name + "]";
	}

}
