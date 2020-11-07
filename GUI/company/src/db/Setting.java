package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Setting {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?allowLoadLocalInFile=true&serverTimezone=UTC","root","0818");
		
		Statement stmt = con.createStatement(); //데이터베이스로 SQL 문을 보내기 위한 SQLServerStatement 개체를 만든다
		
		stmt.execute("DROP DATABASE IF EXISTS company"); // IF EXISTS 이 데이터 베이스가 있다면 
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
		stmt.execute("load data infile 'D:/company/file/admin.txt' into table admin ignore 1 lines" ); // 파일 값 select
		stmt.execute("load data infile 'D:/company/file/contract.txt' into table contract ignore 1 lines" );
		stmt.execute("load data infile 'D:/company/file/customer.txt' into table customer ignore 1 lines" );
		
		
		stmt.execute("drop user if exists user");
		stmt.execute("create user 'user' identified by '1234'");
		stmt.execute("grant select, insert, delete, update on company.* to 'user'"); //compony의 모든 테이블에게 권한 부여
		stmt.execute("flush privileges"); // 권한 설정 했다고 명시
		//stmt.executeQuery(sql); // return 값을 받을때, select
		//stmt.executeUpdate(sql); // create, update, delete

	}
}