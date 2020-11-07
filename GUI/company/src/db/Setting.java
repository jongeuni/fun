package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Setting {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?allowLoadLocalInFile=true&serverTimezone=UTC","root","0818");
		
		Statement stmt = con.createStatement(); //�����ͺ��̽��� SQL ���� ������ ���� SQLServerStatement ��ü�� �����
		
		stmt.execute("DROP DATABASE IF EXISTS company"); // IF EXISTS �� ������ ���̽��� �ִٸ� 
		stmt.execute("CREATE DATABASE company");
		stmt.execute("use company");
		stmt.execute("create table admin ("
				+ "name varchar(20),"
				+ "passwd varchar(20),"
				+ "position varchar(20),"
				+ "jumin char(14),"
				+ "inputDate date,"
				+ "primary key(name, passwd))"
					);
		stmt.execute("create table customer ("
				+ "code char(7),"
				+ "name varchar(20),"
				+ "birth date,"
				+ "tel varchar(20),"
				+ "address varchar(100),"
				+ "company varchar(20),"
				+ "primary key(code, name))"
				);
		stmt.execute("create table contract ("
				+ "customerCode char(7) not null,"
				+ "contractName varchar(20) not null,"
				+ "regPrice int,"
				+"regDate date not null,"
				+"monthPrice int,"
				+"adminName varchar(20) not null)");
		
		stmt.execute("set global local_infile=true");			
		stmt.execute("load data infile 'D:/company/file/admin.txt' into table admin ignore 1 lines" ); // ���� �� select
		stmt.execute("load data infile 'D:/company/file/contract.txt' into table contract ignore 1 lines" );
		stmt.execute("load data infile 'D:/company/file/customer.txt' into table customer ignore 1 lines" );
		
		
		stmt.execute("drop user if exists user");
		stmt.execute("create user 'user' identified by '1234'");
		stmt.execute("grant select, insert, delete, update on company.* to 'user'"); //compony�� ��� ���̺��� ���� �ο�
		stmt.execute("flush privileges"); // ���� ���� �ߴٰ� ���
		//stmt.executeQuery(sql); // return ���� ������, select
		//stmt.executeUpdate(sql); // create, update, delete

	}
}