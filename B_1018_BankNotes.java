package beeCrowd;

// @author caiop
 
import java.util.Scanner;

public class B_1018_BankNotes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int nota_100 = 0;
        int nota_50 = 0;
        int nota_20 = 0;
        int nota_10 = 0;
        int nota_5 = 0;
        int nota_2 = 0;
        int nota_1 = 0;
        
        int valor = sc.nextInt();
        
        int valorI= valor;
       
       while(valor > 0){ 
        if(valor >= 100){
            nota_100++;
            valor = valor - 100;
        }else if(valor >= 50){
            nota_50++;
            valor = valor -50;
        }else if(valor >= 20){
            nota_20++;
            valor = valor - 20;
        }else if(valor >= 10){
            nota_10++;
            valor = valor - 10;
        }else if(valor >= 5){
            nota_5++;
            valor = valor - 5;
        }else if(valor >= 2){
            nota_2++;
            valor = valor - 2;
        }else if(valor >= 1){
            nota_1++;
            valor = valor - 1;
        }//Fim dos IFs'
       }
     
        System.out.println(valorI);
        System.out.println(nota_100 + " nota(s) de R$ 100,00");
        System.out.println(nota_50 + " nota(s) de R$ 50,00");
        System.out.println(nota_20 + " nota(s) de R$ 20,00");
        System.out.println(nota_10 + " nota(s) de R$ 10,00");
        System.out.println(nota_5 + " nota(s) de R$ 5,00");
        System.out.println(nota_2 + " nota(s) de R$ 2,00");
        System.out.println(nota_1 + " nota(s) de R$ 1,00");
        
        
    }//Fim psvm
    
}
