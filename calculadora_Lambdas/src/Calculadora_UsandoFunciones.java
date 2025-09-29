import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import streams.Operacion;

public class Calculadora_UsandoFunciones {

    private static Map< String , Operacion > mapOperaciones = new HashMap<>();

    private static String opcion = "";

    private static Scanner sc = new Scanner(System.in);

    private static String [] intruccionArr ;

    //Funciones Utilizadas en la primera parte :

    public static Boolean validar(){

            boolean datosOk = false;

            //El trim es para borrar los espacios que hay antes y despues y el split quita el espacio entre los datos :
            intruccionArr = opcion.trim().split(" ");

            // 3 elementos en intrucción : 
            // ["+" , "34" , "50"]

            if (intruccionArr.length != 3) {
                
                datosOk = false;
                
                System.out.println("Error ha introducido mal los datos");
            
            }

            else{
                datosOk = true;
                
            }
                
            return datosOk;

        }


        public static Double operar(){

            
            //Declaro el resultado y los datos :
            double resul = 0;
            double oper1 = parseo(intruccionArr[1]);
            double oper2 = parseo(intruccionArr[2]);

            Operacion op = mapOperaciones.get(intruccionArr[0]);


           

            
            if (((intruccionArr[0].equals("div")) || intruccionArr[0].equals("/")) && (oper2 == 0)) {

                System.out.println("No se puede Dividir entre 0");
            
            }else{


                    resul = op.oper(oper1, oper2);

                    System.out.println("El resultado es = " + resul);

            }
            
            return resul;
                    
        }



    //Y la ampliacicón 2 :
    /* 
                ¿Es par?

                ¿Es primo?

                ¿Es múltiplo de 5?

                ¿Está entre 10 y 100?

    */



        //Declaramos un Mapa estatico : 
        public static void main(String[] args) throws Exception {

        System.out.println("¿ Que operacion desea realizar ?");
        System.out.println("----------------------------------");

        System.out.println(" + = Sumar");
        System.out.println(" - = restar");
        System.out.println(" mult = para multiplicar");
        System.out.println(" div = para division");

        System.out.println("exit = salir del programa");

        System.out.println("----------------------------------");


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


        do {
     
                System.out.println("Escriba la operacion que desea hacer seguido de los numeros con espacio entre cada dato");
                opcion = sc.nextLine().toLowerCase();

                if (validar()) {

                    operar();
        
                }
                else if(intruccionArr[0].equals("salir") || intruccionArr[0].equals("exit")){

                    System.out.println("HA FINALZADO LA EJECUCCION DE LA CALCULADORA");

                }else{
                    System.out.println("Operacion indicada no es posible de realizar" );
                }
  
            
        } while (opcion != intruccionArr[0]);


        System.out.println();
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




