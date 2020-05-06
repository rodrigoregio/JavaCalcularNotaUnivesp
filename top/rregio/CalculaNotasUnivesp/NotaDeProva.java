package top.rregio.CalculaNotasUnivesp;

/**
 * Algorítmo para calcular a nota de prova Criado em C# por Fernando Rafael e
 * convertido em Java por Rodrigo Régio de Araújo.
 * 
 * Algorítmo tirado em https://dotnetfiddle.net/fyzySP
 * 
 * Perfil github: <a href="https://github.com/Stuksgens">Github do Fernando</a>
 * 
 * @author Fernando Rafael 
 * @version 1.0.0
 */
public class NotaDeProva
{
    /**
     * Método para calcular a média das notas das atividades semanais (semana de 3 a 6, normalmente)
     * 
     * @param notas[] recebe um array de notas (e o sistema calcula somente as 4 primeiras)
     * @return a média das notas
     */
    public static double calculaMediaAtividades(double notas[]){
        //Valor da média
        double valor = 0;
        //para i = 0; i < 4 (4 é o numero de elementos do array, ou seja, vai ver todos os 4 elementos); i++
        for(int i = 0; i < 4; i++){
            //valor receberá o valor mais a nota de indice i
            valor = valor + notas[i];
        }
        //não entendi bem, mas acho que vai receber a media do valor x a nota máxima
        valor = (valor/4)*0.4;
        return valor;
    }
    /**
     * Método para calcular a média final
     * 
     * @param médiaAtividades é o valor da média das atividades (obtido com o método anterior).
     * @return pontos é os pontos necessários para se passar na matéria.
     */
    public static double mediaFinal(double mediaAtividades){
        double media2;//é os pontos necessário x a nota máxima na prova
        double mediaFinal;//é a media final de acordo com os pontos da media2
        double pontos = 0;// é os pontos necessários para passar na matéria
        //enquanto estiver verdadeiro
        while(true){
            //media2 recebe os pontos x 0.6 (que é a nota maxima / 10)
            media2 = pontos*0.6;
            //mediaFinal recebe a mediaAtividades + media2
            mediaFinal = (mediaAtividades+media2);
            //se a media final for maior que 4.8 (que é a nota final minima para se passar na matéria
            if(mediaFinal >= 4.8){
                //quebra o while (ou seja o while fica false)
                break;
            }
            //se não for maior ou igual 4.8 os pontos recebem os pontos +0.1 (um decimo de nota, para maior precisão do sistema)
            pontos = pontos+0.1;
        }
        return pontos;
    }
}
//fim classe