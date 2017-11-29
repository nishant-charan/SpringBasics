package com.nishant.mockito.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockitoAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessService;

	@Test
	public void testGetGreatestData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24, 16, 4});
		int result = businessService.getGreatestData();
		assertEquals(24, result);
	}
	
	@Test
	public void testGetGreatestData_withOneData() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4});
		int result = businessService.getGreatestData();
		assertEquals(4, result);
	}

}
