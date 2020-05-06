package top.rregio.CalculaNotasUnivesp;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import top.rregio.CalculaNotasUnivesp.NotaDeProva;
/**
 * Esta é a tela da calculadora de notas
 * 
 * @author Rodrigo Régio de Araújo
 * @version 1.0.0
 */
public class CalculaNotasScreen extends JFrame implements ActionListener{
    //Instanciando os componentes (botão, labels e textfields) da tela 
    JButton btnCalcular = new JButton("Calcular");
    JLabel lNota1 = new JLabel("Nota Semana 3");
    JLabel lNota2 = new JLabel("Nota Semana 4");
    JLabel lNota3 = new JLabel("Nota Semana 5");
    JLabel lNota4 = new JLabel("Nota semana 6");
    JTextArea tResultado = new JTextArea();
    JTextField tNota1 = new JTextField();
    JTextField tNota2 = new JTextField();
    JTextField tNota3 = new JTextField();
    JTextField tNota4 = new JTextField();
    
    public CalculaNotasScreen(){
        //Setando a janela
        super("Calcule quantos pontos precisa para passar nas provas da UNIVESP");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //método para montar a tela        
        this.montaTela();
    }
    public void montaTela(){
        //Setando o tamanho dos componentes
        lNota1.setBounds(10,10,100,25);
        tNota1.setBounds(170,10,150,25);
        lNota2.setBounds(10,45,100,25);
        tNota2.setBounds(170,45,150,25);
        lNota3.setBounds(10,80,100,25);
        tNota3.setBounds(170,80,150,25);
        lNota4.setBounds(10,115,100,25);
        tNota4.setBounds(170,115,150,25);
        //setando o tamanho do botão e do TextArea, setando ainda o evento do botão
        btnCalcular.setBounds(10,150,310,25);
        btnCalcular.addActionListener(this);
        tResultado.setBounds(10,185,310,300);
        //isto deixa o textarea não ser editável (não podendo alterar)
        tResultado.setEditable(false);
        //Adicionando os componentes na tela
        getContentPane().add(lNota1);
        getContentPane().add(lNota2);
        getContentPane().add(lNota3);
        getContentPane().add(lNota4);
        getContentPane().add(tNota1);
        getContentPane().add(tNota2);
        getContentPane().add(tNota3);
        getContentPane().add(tNota4);
        getContentPane().add(btnCalcular);
        getContentPane().add(tResultado);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        //se a fonte do evento vier do botão calcular
        if(e.getSource() == btnCalcular){
            ValidaCampos vc = new ValidaCampos();
            //cria um array de 4 elementos
            double notas[] = new double[4];
            //pega o que foi digitado nos textfields e armazena nos indices do vetor
            notas[0] = vc.alteraVirgula(tNota1.getText());
            notas[1] = vc.alteraVirgula(tNota2.getText());
            notas[2] = vc.alteraVirgula(tNota3.getText());
            notas[3] = vc.alteraVirgula(tNota4.getText());
            
            double mediaAtividades = NotaDeProva.calculaMediaAtividades(notas);
            tResultado.setText("Nota Semana 1: "+notas[0]+
                               "\nNota Semana 2: "+notas[1]+
                               "\nNota Semana 3: "+notas[2]+
                               "\nNota Semana 4: "+notas[3]+
                               "\n\nMedia de notas semanas: "+mediaAtividades+
                               "\n\nVocê precisa de "+NotaDeProva.mediaFinal(mediaAtividades)+" pontos na prova!");
            
        }
    }
    public static void main(String[] args){
        CalculaNotasScreen calcula = new CalculaNotasScreen();
        calcula.setSize(600,600);
        calcula.setVisible(true);
    }
}
