import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import TestePainel.Botão;
public class Main {
    public static void main(String[] args) {

           JFrame frame = new JFrame("Painel Cadastro");
           JPanel panel = new JPanel();

           Botão.botaoNome botaoNome = new Botão().new botaoNome();
           Botão.botaoEvento botaoEvento = new Botão().new botaoEvento();

           panel.add(botaoNome.CadastrarNome);
           panel.add(botaoEvento.CadastrarEvento);
           frame.add(panel);

           frame.setSize(300, 100);
           panel.setBackground(Color.GRAY);
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setVisible(true);

    }

}

