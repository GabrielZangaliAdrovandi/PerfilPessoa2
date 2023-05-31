package view;

import javax.swing.*;

public class SearchView  extends JFrame{
    private JTextField textField1;
    private JButton pesquisaButton;
    private JButton limparButton;
    private JTable table1;
    private JPanel pnlSearchView;


    public SearchView(){
        initComponents();
    }

    public void initComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tela do Sistema");
        setContentPane(pnlSearchView);
        setSize(1280,800);
        setVisible(true);
        pnlSearchView.setLayout(null);

    }
}

