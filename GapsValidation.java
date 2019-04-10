package gapsvalidation;

import java.util.Scanner;

public class GapsValidation {

    public static void main(String[] args) {
       //rango = {1,2,147,483,647};
       String Ingresado;
       Scanner estradaScanner = new Scanner(System.in);
       while(true){
           
           Ingresado=estradaScanner.nextLine();
            if (Ingresado.equals("0")) {
                break;
            } else {
                System.out.println("El binariGap mayor es: " +conversion(Ingresado));
            }
            
        }
    }
    
    public static int conversion(String n){
            int exp=0,digito=0,numero, binario=0;
            numero=Integer.parseInt(n);
            while(numero!=0){
                digito = numero % 2;            
                binario = (int)( binario + digito * Math.pow(10, exp));   
                exp++;
                numero = numero/2;
            }  
        return solucion( ""+binario);
    }

    public static int  solucion(String numero_Binario){
        int gap=0,gapfinal=0;
        if (numero_Binario.length()>1) {
            //System.out.println(""+numero_Binario.substring(0, numero_Binario.length()-1));
            if(numero_Binario.substring(numero_Binario.length()-1).equals("0"))gapfinal=1;
            String [] binarios=numero_Binario.split("1");
            gap=binarios[0].length();
            for (int i = 0; i < binarios.length-gapfinal; i++) {
                System.out.println(""+binarios[i]);
                if (gap< binarios[i].length()) {
                    gap=binarios[i].length();
                }
            }
        }
        return gap;
    }
}
