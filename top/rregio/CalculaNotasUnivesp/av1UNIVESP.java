package top.rregio.CalculaNotasUnivesp;
import java.util.Scanner;
public class av1UNIVESP
{
    public static void main(String[] args){
        double x,y,z;
        char resposta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        x = sc.nextDouble();
        System.out.println("Digite um outro numero: ");
        y = sc.nextDouble();
        z = (x*y)+5;
        if(z<=0){
            resposta = 'A';
        }else{
            if(z<100){
                resposta = 'B';
            }else{
                resposta = 'C';
            }
        }
        System.out.println("Z = "+z);
        System.out.println("Resposta = "+resposta);
    }
}
