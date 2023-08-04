/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cabbooking;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author Humai
 */
public class ViewBooking extends JFrame {
    
    Font f;
    JTable t;
   String x[]={"Id","UserName","DriverName","CarName","Cartype","PickupLocation","DropoffLocation","Fare"};
    String y[][]=new String[100][100];
    int i,j;
    ViewBooking(){
        
   super("Booking Details");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("MS UI Gothic",Font.BOLD,17);
        
        try{
         ConnectionClass obj=new ConnectionClass();
                   String q="select * from booking ";
                   ResultSet rs= obj.stm.executeQuery(q);
                    while(rs.next()){
                         y[i][j++]=rs.getString("Id");
                    y[i][j++]=rs.getString("Username");
                    y[i][j++]=rs.getString("DriverName");
                    y[i][j++]=rs.getString("CarName");
                    y[i][j++]=rs.getString("Cartype");
                    y[i][j++]=rs.getString("PickupLocation");
                    y[i][j++]=rs.getString("DropoffLocation");
                    y[i][j++]=rs.getString("Fare");

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
    public static void main(String[] args){
    new ViewBooking().setVisible(true);
    }
}
