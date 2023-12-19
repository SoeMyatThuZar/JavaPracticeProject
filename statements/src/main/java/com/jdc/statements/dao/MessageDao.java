package com.jdc.statements.dao;

import java.sql.SQLException;
import java.sql.Statement;

import com.jdc.statements.ConnectionManager;
import com.jdc.statements.dto.Message;

public class MessageDao {
	private ConnectionManager manager;

	public MessageDao(ConnectionManager manager) {
		super();
		this.manager = manager;
	}
	
	
	public Message createMessage(Message data)
	{
		var sql="insert into message(title,message) values ('%s','%s')".formatted(data.title(),data.message());
		
		try(var conn=manager.getConnection();
			
			var stmt=conn.createStatement()){
				
			stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
			var result=stmt.getGeneratedKeys();
			if(result.next()){
				 var id=result.getInt(1);
				 return data.cloneWithId(id);
				 
			}
			
    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	
	}
	
	
	

}
