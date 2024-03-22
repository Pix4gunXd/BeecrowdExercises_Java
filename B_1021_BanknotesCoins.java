package beeCrowd;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author caiop
 */
public class B_1021_BanknotesCoins {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        int nota_100 = 0;
        int nota_50 = 0;
        int nota_20 = 0;
        int nota_10 = 0;
        int nota_5 = 0;
        int nota_2 = 0;
        
        int moeda_1   = 0;
        int moeda_050 = 0;
        int moeda_025 = 0;
        int moeda_010 = 0;
        int moeda_005 = 0;
        int moeda_001 = 0;
        
        
        double valor = sc.nextDouble();
        
        
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
            moeda_1++;
            valor = valor - 1;
        }else if(valor >= 0.50){
            moeda_050++;
            valor = valor - 0.50;
        }else if(valor >= 0.25){
            moeda_025++;
            valor = valor - 0.25;
        }else if(valor >= 0.10){
            moeda_010++;
            valor = valor - 0.10;
        }else if(valor >= 0.05){
            moeda_005++;
            valor = valor - 0.05;
        }else if(valor >= 0.01){
            moeda_001++;
            valor = valor - 0.01;
        }//Fim IFs'
        
        
       }
     
        System.out.println("NOTAS:");
        System.out.println(nota_100 + " nota(s) de R$ 100,00");
        System.out.println(nota_50 + " nota(s) de R$ 50,00");
        System.out.println(nota_20 + " nota(s) de R$ 20,00");
        System.out.println(nota_10 + " nota(s) de R$ 10,00");
        System.out.println(nota_5 + " nota(s) de R$ 5,00");
        System.out.println(nota_2 + " nota(s) de R$ 2,00");
        
        System.out.println("MOEDAS:");
        System.out.println(moeda_1 + " moeda(s) de R$ 1,00");
        System.out.println(moeda_050 + " moeda(s) de R$ 0,50");
        System.out.println(moeda_025 + " moeda(s) de R$ 0,25"); 
        System.out.println(moeda_010 + " moeda(s) de R$ 0,10");
        System.out.println(moeda_005 + " moeda(s) de R$ 0,05");
        System.out.println(moeda_001 + " moeda(s) de R$ 0,01");
        
        
        
        
        
    }//Fim psvm
    
    
}
