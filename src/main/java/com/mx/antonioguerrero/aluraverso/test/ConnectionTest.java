package com.mx.antonioguerrero.aluraverso.test;

import com.mx.antonioguerrero.aluraverso.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().recoverConnection();

        System.out.println("Cerrando la conexión");

        con.close();
    }
}
