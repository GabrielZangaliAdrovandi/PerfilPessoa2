package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaInformacoes extends JFrame {


    private JPanel pnlTelaInformacoes;
    private JButton btnvoltar;

    public TelaInformacoes() {
        initComponents();
        // initMenuBar();
        Listener();
        //initener();

    }
    public void Listener(){
        btnvoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SystemView systemView = new SystemView();
                dispose();
            }
        });
    }

    public void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tela do Sistema");
        setContentPane(pnlTelaInformacoes);
        setSize(1280, 800);
        setVisible(true);
    }
}
