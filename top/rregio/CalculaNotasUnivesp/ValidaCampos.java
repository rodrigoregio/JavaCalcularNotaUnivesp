package top.rregio.CalculaNotasUnivesp;
import java.text.DecimalFormat;
/**
 * Classe para validar e formatar os campos que irão ser utilizados no sistema.
 * 
 * @author Rodrigo Régio de Araújo
 * @version 1.0.0
 */
public class ValidaCampos{
    /**
     * Retorna o texto formatado de acordo com meu uso (exibir notas)
     * 
     * @param valor_do_campo este é o texto a ser formatado.
     * @return valor este é o valor já formatado
     */
    public static Double transformaTexto(String valor_do_campo){
        //Testa se o campo está vazio
        valor_do_campo = isVazio(valor_do_campo);
        //Testa se o campo tem virgula
        valor_do_campo = temVirgula(valor_do_campo);
        //converte o valor do campo para double
        double valor = Double.parseDouble(valor_do_campo);
        //testa se o valor é maior ou menor que 10
        valor = maiorDez(valor);
        valor = menorZero(valor);
        return valor;
    }
    /**
     * Retorna o texto trocado (se tem virgula "," coloca ponto ".")
     * 
     * @param val este é o texto a ser formatado.
     * @return val este é o valor já formatado
     */
    public static String temVirgula(String val){
        int tem_virgula = val.indexOf(',');
        if(tem_virgula != -1){
            //substitui a virgula pelo ponto
            val = val.replace(",",".");
        }
        return val;
    }
    /**
     * Se o texto está vazio e se o texto possui somente numeros, se estiver vazia e se não é somente numeros ele retorna a String "0.0"
     * 
     * @param val este é o texto a ser formatado.
     * @return val este é o mesmo valor já formatado
     */
    public static String isVazio(String val){
        if(val.isEmpty()){
            val = "0";
        }
        if(!val.matches("[0-9,.]+")){
            val = "0.0";
        }
        return val;
    }
    /**
     * Verifica se o numero é maior que 10, caso verdadeiro retornará o numero 10.0
     * 
     * @param val este é o valor a ser alterado
     * @return val este é o valor já alterado
     */
    public static double maiorDez(double val){
        if(val > 10){
            val = 10.0;// se for maior que 10 ele ira receber 10
        }
        return val;
    }
    /**
     * Verifica se o numero é menor que 0, caso verdadeiro retornará o numero 0.0
     * 
     * @param val este é o valor a ser alterado
     * @return val este é o valor já alterado
     */
    public static double menorZero(double valor){
        if(valor < 0){//testa se o valo é menor que 0
            valor = 0.0;//se for menor que 0 ele irá receber 0
        }
        return valor;
    }
    /*public static boolean isNumeric(String texto){
        if(texto.matches("[0-9]+")){
            return true;
        }else{
            return false;
        }
    }*/
    /**
     * Torna um numero do tipo double em uma String com somente duas casas
     * 
     * @param val este é o valor a ser alterado
     * @return val este é o valor já alterado
     */
    public static String soDuasCasas(double val){
        DecimalFormat df = new DecimalFormat("#,###.00");
        return df.format(val);
    }
}
