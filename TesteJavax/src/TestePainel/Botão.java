package TestePainel;

import javax.swing.*;
import java.awt.event.*;

public class Botão {
    public class botaoNome {

        public JButton CadastrarNome = new JButton("Cadastrar Convidado");
        public PainelCadastro painelCadastro = new PainelCadastro();
        public botaoNome() {
            CadastrarNome.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    painelCadastro.PainelPessoa();
                }
            });
        }
    }
    public class botaoEvento {
        public JButton CadastrarEvento = new JButton("Cadastrar Evento");
        public PainelEvento painelEvento = new PainelEvento();

        public botaoEvento() {

            CadastrarEvento.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    painelEvento.CadastroEven();
                }
            });
        }
    }
}