package TestePainel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class PainelCadastro {

    private JFrame janela = new JFrame("Painel de Cadastro");
    private JTextField campNome = new JTextField(25);
    private JTextField campIdade = new JTextField(25);
    private JTextField campTelefone = new JTextField(25);
    private JButton save = new JButton("Encerrar e salvar dados.");
    private JButton retornar = new JButton("Retornar para cadastro.");
    private JPanel painel = new JPanel();
    private Map<String, String> dadosPessoa = new HashMap<>();


    public void nome() {
        painel.add(new JLabel("Nome:"));
        painel.add(campNome);
    }
    public void idade() {
        painel.add(new JLabel("Idade:"));
        painel.add(campIdade);
    }
    public void telefone() {
        painel.add(new JLabel("Telefone: "));
        painel.add(campTelefone);
    }
    public void encerrar() {
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dadosPessoa.put("Nome:", campNome.getText());
                dadosPessoa.put("Idade:", campIdade.getText());
                dadosPessoa.put("Telefone:", campTelefone.getText());

                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");

                // Limpar os campos de texto
                campNome.setText("");
                campIdade.setText("");
                campTelefone.setText("");

                // Iterar sobre o mapa e imprimir cada par chave-valor
                for (Map.Entry<String, String> entry : dadosPessoa.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }
            }
        });
    }

    public void PainelPessoa() {
        janela.setSize(300, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setBackground(Color.CYAN);

        nome();
        idade();
        telefone();
        encerrar();

        janela.add(painel);

        painel.add(save);
        painel.add(retornar);

        retornar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.dispose();
            }
        });
        // Definir textos iniciais dos campos de texto
        campNome.setText("Insira o nome aqui");
        campIdade.setText("Insira a idade aqui");
        campTelefone.setText("Insira o telefone aqui");

        janela.setVisible(true);
    }
}
