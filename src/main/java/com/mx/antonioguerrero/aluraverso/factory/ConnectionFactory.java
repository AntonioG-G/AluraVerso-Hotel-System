package com.mx.antonioguerrero.aluraverso.factory;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionFactory {
    private DataSource dataSource;
    public ConnectionFactory(){
        var pooledDataSource = new ComboPooledDataSource();

        pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/aluraverso_db?useTimeZone=true&serverTimeZone=UTC");
        pooledDataSource.setUser("root");
        pooledDataSource.setPassword("reips2109");
        pooledDataSource.setMaxPoolSize(10);

        this.dataSource = pooledDataSource;
    }

    public Connection recoverConnection() {
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
