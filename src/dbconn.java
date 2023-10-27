/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rsp.399
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
public class dbconn {
    
public static void main(String args[])
{
  
        try{
             String url="jdbc:mysql://localhost:3306/pandey";
             String uname="root";
             String pass="Skp@3887";
             Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
}
}