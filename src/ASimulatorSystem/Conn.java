package ASimulatorSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/asimulator", "root", "");

            s = c.createStatement();

            //System.out.println("connection Established Successfully");
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Conn();
    }
}
