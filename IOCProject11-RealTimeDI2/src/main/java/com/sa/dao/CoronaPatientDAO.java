package com.sa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sa.bo.CoronaPatientBO;

public final class CoronaPatientDAO implements ICoronaPatientDAO{
	
	private DataSource ds;
	public static final String INSERT_REALTIMEDI_CORONAPATIENT="INSERT INTO REALTIMEDI_CORONAPATIENT VALUES(?,?,?,?,?,?,?,?)";
	
	public CoronaPatientDAO(DataSource ds) {
		System.out.println("CoronaPatientDAO :: 1-param constructor");
		this.ds=ds;
	}
	
	public int insert(CoronaPatientBO bo) throws Exception{
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(INSERT_REALTIMEDI_CORONAPATIENT);
			
			ps.setString(1, bo.getPatientName());
			ps.setString(2, bo.getPatientAddrs());
			ps.setLong(3, bo.getMobileNo());
			ps.setInt(4, bo.getNoHospitalized());
			ps.setFloat(5, bo.getBillPerDay());
			ps.setFloat(6, bo.getTotalBillAmount());
			ps.setFloat(7, bo.getDiscount());
			ps.setFloat(8, bo.getNetBillAmount());
			int result =ps.executeUpdate();
			
			return result;
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			try {
			if(con != null)
				con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
			try {
				if(ps != null ) 
					ps.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
