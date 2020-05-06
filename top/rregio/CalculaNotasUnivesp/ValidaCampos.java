package top.rregio.CalculaNotasUnivesp;
public class ValidaCampos{
    public Double alteraVirgula(String valor_do_campo){
        
        int tem_virgula = valor_do_campo.indexOf(',');
        //Testa se o campo está vazio
        if(valor_do_campo.isEmpty()){
            valor_do_campo = "0.0";
        }else //testa se o campo tem virgula
        if(tem_virgula != -1){
            valor_do_campo = valor_do_campo.replace(",",".");
        }
        //converte o valor do campo para double
        double valor = Double.parseDouble(valor_do_campo);
        //testa se o valor é maior que 10
        if(valor > 10){
            valor = 10.0;// se for maior que 10 ele ira receber 10
        } else//testa se o valor é menor que 0
        if(valor < 0){//testa se o valo é menor que 0
            valor = 0.0;//se for menor que 0 ele irá receber 0
        }
        return valor;
    }
}
