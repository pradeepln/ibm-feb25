package com.ibm.training.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

	public static void main(String[] args) throws SQLException {
		
		Product sample = new Product("NewBalance", 9999, 123);
		
		//save(sample);

		List<Product> all = findAll();
		
		for(Product p : all) {
			System.out.println(p);
		}
	}

	private static List<Product> findAll() throws SQLException {
		List<Product> list = new ArrayList<>();
		
		Connection c = DBUtil.getConnection();
		Statement st = c.createStatement();
		String sql = "select * from product";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			Product p = new Product();
			
			p.setId(rs.getInt(1));
			p.setName(rs.getString(2));
			p.setPrice(rs.getFloat(3));
			p.setQoh(rs.getInt(4));
			
			list.add(p);
		}
		
		c.close();
		return list;
	}

	private static void save(Product p) throws SQLException {
		Connection c = DBUtil.getConnection();
		String sql = "insert into product(product_name,product_price,product_qoh) values('"+p.getName()+"',"+p.getPrice()+","+p.getQoh()+")";
		System.out.println(sql);
		Statement st = c.createStatement();
		st.executeUpdate(sql);
		c.close();
	}
	
	

}
