package com.arwizon.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.arwizon.model.Product;
import com.arwizon.utility.ConnectionDB;

public class AdminInterfaceImpl implements AdminInterface{
	Connection con = ConnectionDB.connectDB();

	@Override
	public void addProduct(String name, String description, int price, String manufacturerName, int discount,
			String imgUrl, int noOfUnits, String category) {


		int i =0;
		String sql="insert into Product values(?,?,?,?,?,?,?,?,?)";
		String sql1="select max(product_Id)  from Product";
		PreparedStatement stmt1=null;
		ResultSet rs=null;
		PreparedStatement stmt = null;

		try {
			stmt1 = con.prepareStatement(sql1);
			rs = stmt1.executeQuery();
			while(rs.next()) {
				i = rs.getInt(1);
			}
		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1,i+2);
			stmt.setString(2,name);
			stmt.setString(3,description);
			stmt.setInt(4,price);
			stmt.setString(5,manufacturerName);
			stmt.setInt(6,discount);
			stmt.setString(7,imgUrl);
			stmt.setInt(8,noOfUnits);
			stmt.setString(9,category);
			stmt.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				if(stmt1!=null)
					stmt1.close();
				if(rs!=null)
					rs.close();
				if(stmt!=null)
					stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public Set<Product> searchProduct(String name) {
		Set<Product> s = new HashSet<Product>();
		String sql="select * from Product where name=? ";
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1,name);
			rs = stmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setProductId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setPrice(rs.getInt(4));
				p.setManufacturerName(rs.getString(5));
				p.setDiscount(rs.getInt(6));
				p.setImgUrl(rs.getString(7));
				p.setNoOfUnits(rs.getInt(8));
				p.setCategory(rs.getString(9));
				s.add(p);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


		return s;
	}

	@Override
	public void deleteProduct(int productId) {

		String sql = "delete from Product where product_Id=?";
		PreparedStatement stmt  = null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, productId);
			stmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
					stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


	}


	@Override
	public void updateProduct(int productId, int noOfUnits) {


		String sql = "update Product  set noOfUnits=? where product_Id=?";
		PreparedStatement stmt=null;
		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(2, productId);
			stmt.setInt(1,noOfUnits);
			stmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
					stmt.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}


	@Override
	public Set<Product> DisplayAllProducts() {
		Set<Product> s = new HashSet<Product>();
		String sql="select * from Product ";
		PreparedStatement stmt =null;
		ResultSet rs  =null;
		try {
			stmt = con.prepareStatement(sql);

			rs = stmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setProductId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setPrice(rs.getInt(4));
				p.setManufacturerName(rs.getString(5));
				p.setDiscount(rs.getInt(6));
				p.setImgUrl(rs.getString(7));
				p.setNoOfUnits(rs.getInt(8));
				p.setCategory(rs.getString(9));
				s.add(p);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(stmt!=null)
					stmt.close();
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


		return s;
		
	}
	
}

