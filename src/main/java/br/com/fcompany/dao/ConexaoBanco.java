/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fcompany.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author agner
 */
public class ConexaoBanco {

    private Connection con;

    public void openConnection() throws SQLException {

        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Cliente", "postgres", "postgres");
    }

    public void closeConnection() throws SQLException {
        con.close();
    }

    public Connection getCon() {
        return con;
    }

    
    
}
