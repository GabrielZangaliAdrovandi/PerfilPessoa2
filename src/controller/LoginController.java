package controller;

import dao.LoginDao;
import model.Login;

import java.sql.SQLException;
import java.util.ArrayList;

public class LoginController {
    public ArrayList<Login> buscarLoginSenha() throws SecurityException, ClassNotFoundException, SQLException {
        return LoginDao.buscarLogin();
    }
}