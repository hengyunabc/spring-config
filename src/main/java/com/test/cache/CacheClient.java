package com.test.cache;

public class CacheClient {
	String address;

	public CacheClient(String address) {
		this.address = address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String toString() {
		return "CacheClient: {address:" + address + "}";
	}
}
