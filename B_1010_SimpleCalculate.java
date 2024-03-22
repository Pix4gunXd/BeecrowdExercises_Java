package beeCrowd;

import java.util.Scanner;

public class B_1010_SimpleCalculate {
    
    
    
    
    public static void main(String []args){
        
        String L1;
        String L2;
        
        Scanner sc = new Scanner(System.in);
        
        //Inicio do programa....
        L1 = sc.nextLine();
        
        String[] ns = L1.split(" ");
        
        if(ns.length >=2){
            
           String codigo_L1 = ns[0];
           String unidades_L1 = ns[1];
           String valor_L1 = ns[2];
            
          //LOG System.out.println( codigo_L1 + unidades_L1 + valor_L1 );
         
            L2 = sc.nextLine();

            String[] ns_2 = L2.split(" ");

            if (ns_2.length >= 2) {

                String codigo_L2 = ns_2[0];
                String unidades_L2 = ns_2[1];
                String valor_L2 = ns_2[2];

            //LOG System.out.println(codigo_L2 + " " +  unidades_L2 + " " +  valor_L2);

            

            double unidade_1;    
            double unidade_2;    
            double valor_1;
            double valor_2;

            double totalPagar;
           
            unidade_1 = Double.parseDouble(unidades_L1);
            valor_1 = Double.parseDouble(valor_L1);
           
            unidade_2 = Double.parseDouble(unidades_L2);
            valor_2 = Double.parseDouble(valor_L2);
          
            
            totalPagar = ((valor_1 * unidade_1) + (valor_2 * unidade_2));
            
            String totalP = String.format("%.2f", totalPagar);
            System.out.println("VALOR A PAGAR: R$ " + totalP);
            
            }//Fim if 2  
           
        }// Fim if
        
        
     
        
    }//Fim Main PSVM
    
    
}
