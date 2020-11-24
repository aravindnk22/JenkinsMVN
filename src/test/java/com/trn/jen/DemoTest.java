package com.trn.jen;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void addNumtest() {
		Demo tObj = new Demo();
		AssertJUnit.assertEquals(10, tObj.addNum(5, 5));
	}

	@Test
	public void subNumtest() {
		Demo tObj = new Demo();
		AssertJUnit.assertEquals(10, tObj.subNum(15, 5));
	}
}
