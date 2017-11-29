package com.nishant.spring.basics.springbasics.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {
	
	public int[] getData() {
		return new int[] {22, 33, 44};
	}

}
