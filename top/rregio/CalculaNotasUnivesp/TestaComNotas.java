package top.rregio.CalculaNotasUnivesp;
import java.util.Scanner;

/**
 * Escreva a descrição da classe TestaComNotas aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class TestaComNotas
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Acertou quantas alternativas?");
        int alt = sc.nextInt();
        System.out.println("Qual sua média semanal?");
        double media = sc.nextDouble();
        double notaProva = alt*(6/4);
        System.out.println(NotaDeProva.notaFinal(media,alt));
    }
}
