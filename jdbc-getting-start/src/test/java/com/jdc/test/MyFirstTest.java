package com.jdc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.jdbc.database.ConnectionManager;
import com.jdbc.database.MyFirstDao;

class MyFirstTest {
	@BeforeAll
	static void initDatabase() {
		System.out.println("Before All:Init Database");

	}

	@AfterAll
	static void backUpDatabase() {

		System.out.println(("After All:Backup Database"));
	}

	@Test
	void test() {
		var dao = new MyFirstDao(ConnectionManager.getInstance());
		var result = dao.getCourseCount();

		assertEquals(9, result);
		System.out.println("Course Count Test");
	}

	@Test
	void getAllCourseTest() {

		System.out.println("Get All Course Test");

	}

}
