/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author ROMOS
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursedb", "root", "");
//              Checking Connection           
//             if (conn != null) {
//                 System.out.println("success");
//            }else{
//                 System.out.println("no success");
//             }
                String query = "INSERT INTO tbl_employee(emp_name,emp_email,emp_contactNo) VALUES (?,?,?)";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setString(1, "Sujan Sapkota");
                statement.setString(2, "sujan@email.com");
                statement.setString(3, "985758585");
                
                int check = statement.executeUpdate(query);
                
                System.out.println("check param " + check);
             
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
