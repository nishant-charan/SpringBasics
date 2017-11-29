package com.nishant.mockito.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;


public class SomeBusinessMockitoTest {

	@Test
	public void testGetGreatestData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 16, 4});
		SomeBusinessImpl businessService = new SomeBusinessImpl(dataServiceMock);
		int result = businessService.getGreatestData();
		assertEquals(24, result);
	}
	
	@Test
	public void testGetGreatestData_withOneData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4});
		SomeBusinessImpl businessService = new SomeBusinessImpl(dataServiceMock);
		int result = businessService.getGreatestData();
		assertEquals(4, result);
	}

}
