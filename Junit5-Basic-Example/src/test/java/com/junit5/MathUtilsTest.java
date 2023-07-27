package com.junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mathUtils=new MathUtils();
		int expect= 2;
		int actual= mathUtils.add(1,1);
		
		assertEquals(expect,actual);
		
	}

}
