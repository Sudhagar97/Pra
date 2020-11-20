package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	private void test1() {
		Assert.assertTrue(true);
		System.out.println("test1");
		}
	@Test
	private void test2() {
		Assert.assertTrue(false);
		System.out.println("test2");

	}

}
