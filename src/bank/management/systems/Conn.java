package bank.management.systems;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Jagmay@2017");
            s = c.createStatement();
        
        } catch (Exception e){
            System.out.println(e);
        }
    }
 }
