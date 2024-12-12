package com.classes.Conexao;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;

public class Conexao {

	final static String NOME_DO_BANCO = "poo1";
    public static Connection conectar() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/" + NOME_DO_BANCO;
            return DriverManager.getConnection(url,"root","");
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }
    }
}