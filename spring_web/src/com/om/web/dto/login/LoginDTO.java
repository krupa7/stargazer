package com.om.web.dto.login;

import java.io.Serializable;

public class LoginDTO implements Serializable {

	private String userid;
	private String pwd;

	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName() + "\tCreated...");
	}

	@Override
	public String toString() {
		return "LoginDTO [userid=" + userid + "]";
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
