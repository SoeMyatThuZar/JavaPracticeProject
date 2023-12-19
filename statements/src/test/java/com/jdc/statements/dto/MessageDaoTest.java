package com.jdc.statements.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.statements.ConnectionManager;
import com.jdc.statements.DatabaseInitializer;
import com.jdc.statements.dao.MessageDao;

class MessageDaoTest {
	MessageDao dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
       DatabaseInitializer.truncate("message");
	
	}
	@BeforeEach
	void setUpBefore() {
		dao=new MessageDao(ConnectionManager.getInstance());		
		
	}

	@Test
	void testCreateMessage() {
		var message=new Message("hello","Hello JDBC");
		var result=dao.createMessage(message);
		assertEquals(1, result.id());
	}

}
