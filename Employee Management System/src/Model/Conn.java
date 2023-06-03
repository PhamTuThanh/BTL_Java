package Model;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    public Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///qlns", "root", "04102003");
            s = c.createStatement();  //tạo đối tượng để thực thi câu lệnh
        } catch (Exception e) {
            e.printStackTrace();// in ra phương thức ngoại lệ
        }
    }
}
