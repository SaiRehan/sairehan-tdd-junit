package com.code.TDDdemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class removingfristtwoA {
	/*
 	1.“ABCD” => “BCD”
    2.“AACD” => “CD” 
    3.“BACD” => “BCD”
    4.“BBAA” => “BBAA”       
    5.“AABAA” => “BAA”
 */
	@Test
	void test1() {
		RemovingfirsttwoA removefirst2=new RemovingfirsttwoA();
		
		assertEquals("BCD",removefirst2.remove("ABCD"));
		
	}
	@Test
	void test2() {
		RemovingfirsttwoA removefirst2=new RemovingfirsttwoA();
		 
		assertEquals("CD",removefirst2.remove("AACD"));
		
	}
	@Test
	void test3() {
		RemovingfirsttwoA removefirst2=new RemovingfirsttwoA();
		
		assertEquals("BCD",removefirst2.remove("BACD"));
		
	}
	@Test
	void test4() {
		RemovingfirsttwoA removefirst2=new RemovingfirsttwoA();
		
		assertEquals("BBAA",removefirst2.remove("BBAA"));
		
	}
	@Test
	void test5() {
		RemovingfirsttwoA removefirst2=new RemovingfirsttwoA();
		
		assertEquals("BAA",removefirst2.remove("AABAA"));
		
	}

}
