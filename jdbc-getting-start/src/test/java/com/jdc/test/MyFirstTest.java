package com.jdc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jdbc.database.MyFirstDao;

class MyFirstTest {

	@Test
	void test() {
		var dao=new MyFirstDao();
		var result=dao.getCourseCount();
		
		assertEquals(9,result);
	}

}
