package com.nishant.mockito.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testGetGreatestData() {
		SomeBusinessImpl businessService = new SomeBusinessImpl(new DataServiceStub());
		int result = businessService.getGreatestData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {24, 16, 4};
	}
	
}
