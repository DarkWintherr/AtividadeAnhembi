package TestePainel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

public class PainelEvento {

    private final JFrame janela = new JFrame();
    private JTextField campNome = new JTextField(25);
    private JTextField campEndereco = new JTextField(25);
    private JPanel panel = new JPanel();
    private JButton save = new JButton("Encerrar e Salvar dados");
    private JButton retornar = new JButton("Retornar para cadastro");
    private JSpinner spinnerDia;
    private JSpinner spinnerMes;
    private JSpinner spinnerAno;

    public void nomeEvento() {
        panel.add(new JLabel("Nome Evento:"));
        panel.add(campNome);
        campNome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }
    public void enderecoEvento() {
        panel.add(new JLabel("Endereço Evento:"));
        panel.add(campEndereco);
        campEndereco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public void dataEvento() {
        spinnerDia = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
        spinnerMes = new JSpinner(new SpinnerNumberModel(1, 1, 12, 1));
        spinnerAno = new JSpinner(new SpinnerNumberModel(2022, 2010, 2100, 1)); // Anos válidos de 1900 a 2100

        panel.add(new JLabel("Data Evento:"));
        panel.add(spinnerDia);
        panel.add(new JLabel("/"));
        panel.add(spinnerMes);
        panel.add(new JLabel("/"));
        panel.add(spinnerAno);
    }
    public void Encerrar() {
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Map<String, String> dadosEvento = new HashMap<>();

                dadosEvento.put("Nome", campNome.getText());
                dadosEvento.put("Endereço", campEndereco.getText());
                dadosEvento.put("Dia", String.valueOf(spinnerDia.getValue()));
                dadosEvento.put("Mês", String.valueOf(spinnerMes.getValue()));
                dadosEvento.put("Ano", String.valueOf(spinnerAno.getValue()));

                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                System.out.println(dadosEvento);
            }
        });
    }
    public void CadastroEven() {
        janela.setSize(300, 500);
        panel.setBackground(Color.lightGray);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nomeEvento();
        enderecoEvento();
        dataEvento();
        Encerrar();

        panel.add(save);
        panel.add(retornar);

        janela.add(panel);

        retornar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.dispose();
            }
        });
        janela.setVisible(true);
    }

}
