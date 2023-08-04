package cabbooking;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author Humai
 */
public class ViewDrivers extends JFrame{
    Font f;
    JTable t;
   String x[]={"Name","CnicNo","LicenseNo","PhoneNo","PickupLocation","DropoffLocaion","CarName","CarType","Fare"};
    String y[][]=new String[100][100];
    int i,j;
    ViewDrivers(){
        super("Driver Details");
        setSize(1300,400);
        setLocation(0,10);
        f=new Font("MS UI Gothic",Font.BOLD,17);
        
         try{
             
                   ConnectionClass obj=new ConnectionClass();
                   String q="select * from driver ";
                   ResultSet rs= obj.stm.executeQuery(q);
                    while(rs.next()){
                    y[i][j++]=rs.getString("Name");
                    y[i][j++]=rs.getString("CnicNo");
                    y[i][j++]=rs.getString("LicenseNo");
                    y[i][j++]=rs.getString("PhoneNo");
                    y[i][j++]=rs.getString("PickupLocation");
                    y[i][j++]=rs.getString("DropoffLocaion");
                    y[i][j++]=rs.getString("CarName");
                    y[i][j++]=rs.getString("CarType");
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

    public static void main(String[] args)
{
   new ViewDrivers().setVisible(true);
   }
  

    
    }
 