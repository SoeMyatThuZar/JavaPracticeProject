package com.jdc.test;

import org.junit.jupiter.api.Test;

import com.jdc.maven.Course;
import com.jdc.maven.CourseInsert;


public class HelloTest {
	@Test
	void test() {
		var c=new Course();
		c.setName("Full Stack Spring");
		c.setFees(500000);
		c.setDuration(6);
		
		var insert=new CourseInsert();
		insert.insert(c);
		
		
	}
	

}
