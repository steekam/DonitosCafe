/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author steekam
 */
public class Functionalities {
    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost/Donitos";
    static final String USER = "root";
    static final String PASSWORD = "dracarys_";
    
    public static String query_menu = "SELECT * FROM menu;";
    public static String insert_menu = "INSERT INTO `menu`(`ItemCode`, `Name`, `Type`, `Price`) VALUES (?,?,?,?);";
    public static String alter_menu = "UPDATE `menu` SET `Price`= ? WHERE ItemCode = ?;";
    public static String remove_item = "DELETE FROM `menu` WHERE ItemCode = ?;";
    public static String query_expenses = "SELECT * FROM expenses;";
    public static String insert_expenses = "INSERT INTO `expenses`(`Date`, `Description`, `Amount`) VALUES (?,?,?);";
    public static String search_expense = "SELECT * FROM expenses WHERE Date = ?;";
    public static String remove_expense = "DELETE FROM `expenses` WHERE EntryNo = ?;";
    public static String dsales_query = "SELECT * FROM sales;";
    public static String dsales_insert = "INSERT INTO `sales`(`Date`, `Sales`, `Amount`) VALUES (now(),?,?);";
    public static String dsales_update = "UPDATE `sales` SET `Sales` = ?,`Amount` = ? WHERE `Date` = DATE(now());";
    public static String dsale_search = "SELECT * FROM sales WHERE Date = ?;";
    public static String msales_query = "SELECT * FROM monthlySale;";
    public static String msales_search = "SELECT * FROM `monthlySale` WHERE Year = ?;";
    
    public static String pos_menu = "SELECT ItemCode, Name, Price FROM menu;";
    public static String breakfast_query = "SELECT ItemCode, Name, Price FROM menu WHERE Type = \"breakfast\";";
    public static String snacks_query = "SELECT ItemCode, Name, Price FROM menu WHERE Type =  \"snacks\";";
    public static String meals_query = "SELECT ItemCode, Name, Price FROM menu WHERE Type = \"meals\";";
    public static String drinks_query = "SELECT ItemCode, Name, Price FROM menu WHERE Type = \"drinks\";";
    
    
   public static void fetch(JFrame window, String query, JTable table){
       try {
           Class.forName(DRIVER);
           Connection connection =  DriverManager.getConnection(URL,USER,PASSWORD);
           PreparedStatement st = connection.prepareStatement(query);
           
           ResultSet rs = st.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(window, e);
       }
               
   }
   
//   -------------------------Returning a resultset for select all queries ----------------
   public static ResultSet table_all(JFrame window, String query){
       ResultSet rs = null;
       try {
           Class.forName(DRIVER);
           Connection connection =  DriverManager.getConnection(URL,USER,PASSWORD);
           PreparedStatement st = connection.prepareStatement(query);
           
           rs = st.executeQuery();
       } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(window, e);
       }
       return rs;
   }
   

   
 }
 

               
