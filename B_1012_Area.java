package beeCrowd;

import java.util.Scanner;

public class B_1012_Area {

    public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        
        String resposta = sc.nextLine();
        
        String[] ns = resposta.split(" ");
        
        if(ns.length >= 2){
            
            String V1 = ns[0];
            String V2 = ns[1];
            String V3 = ns[2];
            
            
            double a;
            double b;
            double c;
            
            a = Double.parseDouble(V1);
            b = Double.parseDouble(V2);
            c = Double.parseDouble(V3);
            
            //Letra A
            double saida_a = (a * c) / 2;
            
            //Letra B
            double saida_b = ((c*c) * 3.14159);
            
            //Letra C
            double saida_c = (((a+b)* c) /2 );
            
            //Letra D
            double saida_d = b * b;
            
            //Letra E
            double saida_e = a * b;
            
            System.out.println(String.format("TRIANGULO: %.3f", saida_a));
            System.out.println(String.format("CIRCULO: %.3f", saida_b));
            System.out.println(String.format("TRAPEZIO: %.3f", saida_c));
            System.out.println(String.format("QUADRADO: %.3f" , saida_d));
            System.out.println(String.format("RETANGULO: %.3f" , saida_e));
          
        }
        
    }
}
