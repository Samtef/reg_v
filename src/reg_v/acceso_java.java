/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reg_v;

/**
 *
 * @author erickarias
 */
import java.sql.*;
import javax.swing.*;

public class acceso_java {
   Connection conect = null;
    public Connection conxion()
            
    {
            
       try {
          
           Class.forName("org.gjt.mm.mysql.Driver");
           conect = DriverManager.getConnection("jdbc:mysql://192.186.205.4/reg_vt","st_2015","1234a");
           
          
       }catch (Exception e){
           JOptionPane.showMessageDialog(null,"Error"+e);
       }     
      
         return conect;
   
}} 