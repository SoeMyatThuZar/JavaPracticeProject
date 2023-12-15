package com.jdc.locations;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.tomcat.jdbc.pool.DataSource;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LocationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/LocationDB")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		var list = new ArrayList();

		try (var conn = dataSource.getConnection(); var stmt = conn.prepareStatement("select* from state")) {

			var rs = stmt.executeQuery();

			while (rs.next()) {

				var data = new Location();
				list.add(data);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		req.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, resp);

	}

}
