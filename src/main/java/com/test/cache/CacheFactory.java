package com.test.cache;

public class CacheFactory {
	String address;

	public CacheClient getClient() {
		return new CacheClient(address);
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
	
	public String toString() {
		return "CacheFactory: {address:" + address + "}";
	}
}
