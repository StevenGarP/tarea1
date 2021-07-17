
package tarea1;

import java.util.Scanner;


public class Tarea1 {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        
        String nom, Cantidad, menu;
        int Resultado;
        System.out.println("Ingrese Su Nombre: ");
        nom = teclado.nextLine();
        
        System.out.println("En que moneda de sea Convertir sus Quetzales");
        System.out.println("1: Dolares");
        System.out.println("2: Euros");
        System.out.println("3: yuanes");
        menu = teclado.nextLine();
        
        int menu1 = Integer.parseInt(menu);
        
        switch (menu1){
            case 1: 
                System.out.println("ingrese una Cantidad en Quetzales: ");
                Cantidad = teclado.nextLine();
                int Cant1 = Integer.parseInt(Cantidad);
                Resultado = Cant1/7;
                
                System.out.println("Usted: " +nom);
                System.out.println("Tiene: " +Resultado);
             case 2: 
                System.out.println("ingrese una Cantidad en Quetzales: ");
                Cantidad = teclado.nextLine();
                int Cant2 = Integer.parseInt(Cantidad);
                Resultado = Cant2/9;
                
                System.out.println("Usted: " +nom);
                System.out.println("Tiene: " +Resultado);
                
             case 3: 
                System.out.println("ingrese una Cantidad en Quetzales: ");
                Cantidad = teclado.nextLine();
                int Cant3 = Integer.parseInt(Cantidad);
                Resultado = Cant3/2;
                
                System.out.println("Usted: " +nom);
                System.out.println("Tiene: " +Resultado);
        }
               
             
    }
    
}
