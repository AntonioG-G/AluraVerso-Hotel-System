package com.mx.antonioguerrero.aluraverso.controller;

import com.mx.antonioguerrero.aluraverso.DAO.usersDAO;
import com.mx.antonioguerrero.aluraverso.factory.ConnectionFactory;
import com.mx.antonioguerrero.aluraverso.model.Users;

public class usersController {
    private usersDAO usersdao;
    public usersController(){
        this.usersdao = new usersDAO(new ConnectionFactory().recoverConnection());
    }

    public boolean compareInfo(Users loggeduser){
        return usersdao.compareInfo(loggeduser);

    }

}
