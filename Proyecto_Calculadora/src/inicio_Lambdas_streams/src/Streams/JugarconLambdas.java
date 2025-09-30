package Streams;

import java.io.ObjectInputValidation;

public class JugarconLambdas {

    public static void main(String[] args) {
        
       Operacion op = (double x ,double y) -> x+y;


       System.out.println("suma: " + op.oper(1, 2));

       op = (x,y) -> x*y;

       System.out.println("Producto : " + op.oper(5, 6));


    }
    
}
