/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientes_crud;

//import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author Oscar
 */
public class conexionMysql {

    private Connection  cn;

    public Connection conectar() throws Exception{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn =(Connection)  DriverManager.getConnection("jdbc:mysql://localhost/crudclientes?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "oscar", "Resendiz123");
            System.out.println("Conectado");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.print(ex.getMessage());
            //return null;
            throw(ex);
        }
        return cn;
    }
}
