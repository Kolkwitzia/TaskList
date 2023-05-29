/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package to.pkgdo.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Kolkwitzia
 */
public class SelectApp {
    /**
     * Connect to the test.db database
     * @return the Connection object
     */
   public static Connection connect(){
       String url = "jdbc:sqlite:C://users/kolkwitzia/documents/se/todolist.db";
       Connection conn = null;
       try{
           conn = DriverManager.getConnection(url);
           
       }catch(SQLException e){
           System.out.println(e.getMessage());
       }
       return conn;
       }
   
   public void selectAll(){
       String sql = "SELECT taskNumber, taskName FROM Task";
       
       try(Connection conn = this.connect();
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql)){
           
           while (rs.next()){
               System.out.println(rs.getInt("taskNumber")+ "\t" + rs.getString("taskName"));
           }
           
       }catch(SQLException e){
                   System.out.println(e.getMessage());
                   }
   }
   /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
       SelectApp cn = new SelectApp();
       cn.selectAll();
   }
}



       
   
   

