package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.cache.CacheClient;

@ContextConfiguration({ "classpath:spring-test.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
public class TestClusterConfig {
	@Autowired
	@Qualifier("cacheClusterAClient")
	CacheClient cacheClientA;

	@Autowired
	@Qualifier("cacheClusterBClient")
	CacheClient cacheClientB;
	
	@Test
	public void test() {
		System.out.println("cacheClientA: " + cacheClientA);
		System.out.println("cacheClientB: " + cacheClientB);
	}

}
