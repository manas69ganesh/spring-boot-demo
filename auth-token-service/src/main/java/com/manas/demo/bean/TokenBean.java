package com.manas.demo.bean;

public class TokenBean {

	private String tokenString;

	public TokenBean() {
		super();
	}

	public TokenBean(String tokenString) {
		super();
		this.tokenString = tokenString;
	}

	public String getTokenString() {
		return tokenString;
	}

	public void setTokenString(String tokenString) {
		this.tokenString = tokenString;
	}

	@Override
	public String toString() {
		return "TokenBean [tokenString=" + tokenString + "]";
	}

}
