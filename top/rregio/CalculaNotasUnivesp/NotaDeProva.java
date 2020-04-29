package top.rregio.CalculaNotasUnivesp;

/**
 * Algorítmo para calcular a nota de prova Criado em C# por Fernando e
 * convertido em Java por Rodrigo Régio de Araújo
 * 
 * @author Fernando 
 * @version 1.0.0
 */
public class NotaDeProva
{

    public static double calculaMediaAtividades(double notas[]){
        double valor = 0;
        for(int i = 0;i<4;i++){
            valor = valor + notas[i];
        }
        valor = (valor/4)*0.4;
        return valor;
    }

    public static double mediaFinal(double mediaAtividades){
        double media2, mediaFinal, pontos = 0;

        while(true){
            media2 = pontos*0.6;
            mediaFinal = (mediaAtividades+media2);
            if(mediaFinal >= 4.8){
                break;
            }
            pontos = pontos+0.1;
        }
        return pontos;
    }
}
