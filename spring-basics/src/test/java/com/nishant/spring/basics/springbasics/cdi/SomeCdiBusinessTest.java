package com.nishant.spring.basics.springbasics.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {
	
	@InjectMocks
	SomeCdiBusiness	someCdiBusiness;
	
	@Mock
	SomeCdiDao someCdiDao;

	@Test
	public void basicTestScenario() {
		Mockito.when(someCdiDao.getData()).thenReturn(new int[] {2,3,4});
		assertEquals(4, someCdiBusiness.getGreatestNumber());
	}
	
	@Test
	public void basicTestScenario_NoElements() {
		Mockito.when(someCdiDao.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, someCdiBusiness.getGreatestNumber());
	}
	
	@Test
	public void basicTestScenario_EqualElements() {
		Mockito.when(someCdiDao.getData()).thenReturn(new int[] {5,5});
		assertEquals(5, someCdiBusiness.getGreatestNumber());
	}

}
