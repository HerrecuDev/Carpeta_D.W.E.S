import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import streams.Operacion;

public class Calculadora {

    /**
     *
     */
    private static Map< String , Operacion > mapOperaciones = new HashMap<>();


        //Declaramos un Mapa estatico : 
        public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Operacion suma = (double x , double y) -> x+y;
        Operacion resta = (double x , double y) -> x-y;
        Operacion mult = (double x , double y) -> x*y;
        Operacion div = (double x , double y) -> x/y;


        //Declaramos el lambda y asigno el valor al objeto :
        mapOperaciones.put("+", suma);
        mapOperaciones.put("add", suma);

        mapOperaciones.put("-", resta);
        mapOperaciones.put("sub", resta);

        mapOperaciones.put("*", mult);
        mapOperaciones.put("mult", mult);

        mapOperaciones.put("/", div);
        mapOperaciones.put("div", div);

        System.out.println("¿ Que operacion desea realizar ?");
        System.out.println("----------------------------------");

        System.out.println(" + = Sumar");
        System.out.println(" - = restar");
        System.out.println(" mult = para multiplicar");
        System.out.println(" div = para division");

        System.out.println("exit = salir del programa");

        System.out.println("----------------------------------");


        String opcion = "";



        do {
            System.out.println("Escriba la operacion que desea hacer seguido de los numeros con espacio entre cada dato");
            opcion = sc.nextLine().toLowerCase();


            //El trim es para borrar los espacios que hay antes y despues y el split quita el espacio entre los datos :
            String [] intruccionArr = opcion.trim().split(" ");


            if (intruccionArr.length != 3) {
                
                System.out.println("FORMATO DE ENTRADA" + opcion + "INVALIDO");
            }

            else{

                // 3 elementos en intrucción : 
                // ["+" , "34" , "50"]

                if (mapOperaciones.keySet().contains(intruccionArr[0])) {

                    Double oper1 = parseo(intruccionArr[1]);
                    Double oper2 = parseo(intruccionArr[2]);

                    if (oper1 != null && oper2 != null) {

                        Operacion op = mapOperaciones.get(intruccionArr[0]);
                        double resul = op.oper(oper1, oper2);

                        
                        System.out.println("El resultado es : " + resul);
                        
                        
                        
                    }
                    
                   
                    
                    
                }else{
                    System.out.println("Operacion" + intruccionArr [0] + "no contemplada");
                }
                


            }
           


            
        } while (!"exit".equalsIgnoreCase(opcion) || !"salir".equalsIgnoreCase(opcion));


        System.out.println("HA FINALZADO LA EJECUCCION DE LA CALCULADORA");
        


        

        
        
    }

    //Para no repetirnos tanto seria lo suyo generar esta funcion :
        public static Double parseo(String str){

            Double digito = null;
                        
                        try {

                        digito =  Double.parseDouble(str);

                        } catch (NumberFormatException nfe) {

                            System.out.println("Formato del primer parámetro " + str + "incorrecto");
                        
                        }

                        return digito;
        }
}
