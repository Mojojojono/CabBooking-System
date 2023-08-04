package cabbooking;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Humai
 */
public class ViewCustomers extends JFrame{
    Font f;
    JTable t;
   String x[]={"Username","Name","DateofBirth","Email","Gender","Age","Address","PhoneNo","CnicNo"};
    String y[][]=new String[100][100];
    int i,j;
    ViewCustomers(){
        super("Customer Details");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("MS UI Gothic",Font.BOLD,17);
        
         try{
             
                   ConnectionClass obj=new ConnectionClass();
                   String q="select * from customer ";
                   ResultSet rs= obj.stm.executeQuery(q);
                    while(rs.next()){
                    y[i][j++]=rs.getString("Username");
                    y[i][j++]=rs.getString("Name");
                    y[i][j++]=rs.getString("DateofBirth");
                    y[i][j++]=rs.getString("Email");
                    y[i][j++]=rs.getString("Gender");
                    y[i][j++]=rs.getString("Age");
                    y[i][j++]=rs.getString("Address");
                    y[i][j++]=rs.getString("PhoneNo");
                    y[i][j++]=rs.getString("CnicNo");

                    i++;
                    j=0;
                    }
                    t=new JTable(y,x);
                    
                    
                    
        }
                    catch(Exception e){
                          e.printStackTrace();
                        }
         t.setFont(f);
         t.setBackground(Color.BLACK);
         t.setForeground(Color.WHITE);
         JScrollPane js=new JScrollPane(t);
         add(js);
         
    }

    public static void main(String[] args)
{
   new ViewCustomers().setVisible(true);
   }

    void setVisible(String q3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  

    
    }
 