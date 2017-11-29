package com.nishant.spring.basics.springbasics.basics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.nishant.spring.basics.springbasics.SpringBasicsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=SpringBasicsBasicApplication.class)
public class BinarySearchXMLConfigurationTest {
	
	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void test() {
		int result = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, result);
	}

}
