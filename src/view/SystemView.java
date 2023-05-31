package view;

import model.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SystemView extends JFrame{


    JPanel pnlSystemView = new JPanel();

    JMenuBar menuBar = new JMenuBar();

    public SystemView(){
        initComponents();
        initMenuBar();
        Listener();
        //initener();
    }







    public void initComponents(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tela do Sistema");
        setContentPane(pnlSystemView);
        setSize(1280,800);
        setVisible(true);
        pnlSystemView.setLayout(null);
        setJMenuBar(menuBar);
    }

    public  void initMenuBar() {
        JMenu cadastrosMenu = new JMenu("Cadastrar");
        JMenu pesquisarMenu = new JMenu("Pesquisar");
        JMenu sairMenu = new JMenu("Sair");

        JMenuItem PessoaItem = new JMenuItem("Aluno");
        JMenuItem pesquisarItem = new JMenuItem("Informacoes do Sistema Representativo ");
        JMenuItem sairItem = new JMenuItem("Sair");

        cadastrosMenu.add(PessoaItem);
        pesquisarMenu.add(pesquisarItem);
        sairMenu.add(sairItem);

        menuBar.add(cadastrosMenu);
        menuBar.add(pesquisarMenu);
        menuBar.add(sairMenu);

        PessoaItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaPerfilPessoa();
                dispose();
            }
        });
        pesquisarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaInformacoes();
                dispose();
            }
        });
        sairItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "Deseja sair do sistema?";
                int opcaoEscolha = JOptionPane.showConfirmDialog(
                        null,
                        msg,
                        "Sistema",
                        JOptionPane.YES_NO_OPTION);

                if (opcaoEscolha == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);
                }
            }
        });

    }
    public void Listener(){

        ImageIcon addUser;
        addUser= new ImageIcon("C:\\Trabalhos\\sistemaCadastroSWING\\src\\img\\adicionar-usuario.png");
        JButton btnCliete = new JButton("Cadastrar Pessoa",addUser);
        btnCliete.setBounds(450,300,150,100);
        pnlSystemView.add(btnCliete);

        btnCliete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaPerfilPessoa telaPerfilPessoa = new TelaPerfilPessoa();
                dispose();
            }
        });

        ImageIcon searchUser= new ImageIcon("C:\\Trabalhos\\sistemaCadastroSWING\\src\\img\\user-interface.png");
        JButton btnPesquisar = new JButton("Pesquisar as informacoes representativa ", searchUser);
        btnPesquisar.setBounds(850,300,150,100);
        pnlSystemView.add(btnPesquisar);

        btnPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaInformacoes telaInformacoes = new TelaInformacoes();
                dispose();
            }
        });
        }



    public static void main(String[] args) {
        SystemView sw = new SystemView();
    }
}
