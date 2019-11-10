/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sucesion;

import java.util.Scanner;

/**
 *
 * @author efren
 */
public class division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros a sumar");
        int cantSuma=lector.nextInt();
        int cantidad=1;
        int ant=1,act=1,fibo;
        //para primos
        int opcionPrimo=2,acuPrimo=2,cuentaPrimos=1;
        // para acumulador de signos
        int c=0,b=1;
        boolean positivo=true, negativo=false;
        String signo="";
        boolean bandera=true,bsalida=true,bimpresion=true;// para primos
          System.out.println("generando numeros.....");
          System.out.println(cantidad);
          //para la divicion
          double residuo=0,sumaTotal=0;
        while(cantidad<=cantSuma){
                             
            fibo=ant+act;
            ant=act;
            act=fibo;
            //System.out.println("numero fibo "+fibo);
            // generando primos 
            
            while(bsalida)
            {
                for (int i = 2; i < cantidad&&bandera; i++) {
                    if (opcionPrimo%i==0) {
                        bandera=false;
                        
                    }
                }
                if (bandera) {
                   // System.out.println("primo "+opcionPrimo); 
                    bsalida=false;
                }
                else{
                opcionPrimo+=1;
                bandera=true;
                }
                
            }
            
                bandera=true;
            bsalida=true;
            //imprimir con signos
            // asigna signos a las operaciones
              if(c==b){
            b=c+1;
            c=0;
            positivo=false;
            //negativo=                                                                                                                                                          true;
            }
              //hello
            if (c<b&&positivo) {
                signo="+";
                c+=1;
            }
          
            if (!positivo&&c<b) {
                signo="-";
                c+=1;
               // positivo=true;
            }
            if(c==b&&!positivo)
            {positivo=true;
                    b=c+1;
                    c=0;
                    }
            //imprimir fracciones sin signos
            //imprimir de manera inversa
            if(bimpresion)
            {
             System.out.print(signo+"("+fibo+"/"+opcionPrimo+")^"+cantidad);
             double fibo1=fibo;
             double opcionPrimo1=opcionPrimo;
             residuo= (fibo1/opcionPrimo1);
             residuo= Math.pow(residuo, cantidad);
              if(signo.equals("-")){residuo*=-1;}
             bimpresion=false;
             signo="";
            }
            else
            {
             System.out.print(signo+"("+opcionPrimo+"/"+fibo+")^"+cantidad);
             double fibo1=fibo;
             double opcionPrimo1=opcionPrimo;
             residuo= (fibo1/opcionPrimo1);
             residuo= Math.pow(residuo, cantidad);
             if(signo.equals("-")){residuo*=-1;}
             bimpresion=true;
             signo="";
            }
           sumaTotal+=residuo;
            opcionPrimo+=1;
            //System.out.println("pp"+cantidad);
        cantidad+=1;//acumula el whilw
        }
        System.out.println("el resultado es "+sumaTotal);
        
   //imprimir signos
//   boolean bdemo=true;
//       int c =0,imp=0;
//       
//       while(imp<=3){
//            if (bdemo) {
//                c=c+1;
//                for (int i = 0; i <=c; i++) {
//                    System.out.println("+");
//                }
//               bdemo=false;    
//            }
//           
//            else
//            { 
//                c=c+1;
//             for (int i = 0; i <=c; i++) {
//                    System.out.println("-");
//                }
//            bdemo=true;
//            }
//       imp+=1;
//       }
    }
}
