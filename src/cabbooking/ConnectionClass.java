
package cabbooking;
import java.sql.*;

public class ConnectionClass {
    Connection con;
    Statement stm;
    Object resultSet;
    
    ConnectionClass()
    {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab_booking","root","95XJTa5yyTS3ocW7zL");
        stm=con.createStatement();
        
        if(con.isClosed()){System.out.println("yes");}
        
    }
    
    
    catch(Exception ex){
    ex.printStackTrace();
    }
    

        
    }
    public static void main(String[]args){
        new ConnectionClass();
        new Login().setVisible(true);
    }
}

    
    

