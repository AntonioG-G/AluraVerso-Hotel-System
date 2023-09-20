package com.mx.antonioguerrero.aluraverso.DAO;

import com.mx.antonioguerrero.aluraverso.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class usersDAO {
    final private Connection con;

    public usersDAO(Connection con) {
        this.con = con;
    }

    public boolean compareInfo(Users loggeduser) {
        try (con) {
            final PreparedStatement statement = con.prepareStatement(
                    "SELECT * FROM users WHERE user_name = ? AND user_password = ?");
            statement.setString(1, loggeduser.getUname());
            statement.setString(2, loggeduser.getPassword());

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    // Obtener los valores del resultado de la consulta
                    String userName = resultSet.getString("user_name");
                    String userPassword = resultSet.getString("user_password");

                    // Comparar los valores con los proporcionados por loggeduser
                    if (userName.equals(loggeduser.getUname()) && userPassword.equals(loggeduser.getPassword())) {
                        return true;
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
