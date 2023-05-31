package view;

import controller.LoginController;
import model.Login;


import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;


public class LoginView extends JFrame{
    private JPanel Login;
    private JButton loginButton;
    private JButton limparButton;
    private JTextField txtLogin;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private JPasswordField txtSenha;


    public LoginView(){
        initComponents();
        listeners();
    }

    public void initComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");
        setContentPane(Login);
        setSize(800,600);
        setVisible(true);
    }



public void listeners() {
    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String login = txtLogin.getText();
            char[] senha = txtSenha.getPassword();

            try{
                LoginController lc = new LoginController();
                ArrayList<Login> loginList = lc.buscarLoginSenha();

                for (Login l: loginList){
                    if(l.getLogin().equalsIgnoreCase(login) &&
                        l.getSenha().equalsIgnoreCase(new String(senha))){
                      System.out.println("Login valido");


                        SystemView s = new SystemView();
                        dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Verifique usuario e senha",
                                "Erro",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }catch (SQLException ex){
                ex.printStackTrace();
            }catch (ClassNotFoundException ex){
                System.out.println("Classe nao encontarda");
            }

        }
    });


}

    public static void main(String[] args) {
        LoginView loginView = new LoginView();
    }
}
