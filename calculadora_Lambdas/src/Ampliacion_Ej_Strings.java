import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import streams.OperacionesparaStrings;

public class Ampliacion_Ej_Strings {

    private static Map<String , OperacionesparaStrings> mapStrings = new HashMap<>();

    private static String [] introStrings;

    private static String opcion  = "";

    private static Scanner sc =  new Scanner(System.in);



     //Para validar lo que nos pide el usuario :
        public static Boolean validarString(){

            boolean formato = false;

            //Limpio los espacios :
            introStrings = opcion.trim().split(" ");

            if (!introStrings[0].equalsIgnoreCase("upper") && !introStrings[0].equalsIgnoreCase("lover") && !introStrings[0].equalsIgnoreCase("reverse") && !introStrings[0].equalsIgnoreCase("length") && !introStrings[0].equalsIgnoreCase("trimp")) {

                formato = false;
                System.out.println("Introduzca bien lo que desea realizar");
                
                
            }else{
                formato = true;
            }

            return formato;
            

            

        }

        //Realizamos un nuevo parseo para no repetirnos :
        public static String parseo(String a){

            String entrada = "";

            try {
                entrada = String.valueOf(a);
            } catch (NumberFormatException e) {
              
                System.out.println("Indicacion introducida es incorrecta");
            }

            return entrada;


        }

        public void revertir(String a){

        }

        public int calculoDelongitud(String a){
            int longitud = a.length();

            return longitud;

        }

        public static String realizar(){

            //Declaro resultado y datos :
            String result = "";
            String frase = parseo(introStrings[1]);

            OperacionesparaStrings op = mapStrings.get(introStrings[0]);
            System.out.println(op);
            result = op.transforma(frase);

            return result;


        }

        


        //COMENZAMOS EL MAIN :
        public static void main(String[] args) {

            String input = "";
            //DEclaramos el lambda y asignamos valor a los objetos :

            OperacionesparaStrings mayuscula = a -> a.toUpperCase();
            OperacionesparaStrings minuscula = a -> a.toLowerCase();
            OperacionesparaStrings revertir;
            OperacionesparaStrings longitud;
            OperacionesparaStrings borrarEspacios = a -> a.trim();

            System.out.println();

            mapStrings.put("Upper", mayuscula);
            mapStrings.put("Lower", minuscula);
            //mapStrings.put("Reverse", revertir);
            //mapStrings.put("length", longitud);
            mapStrings.put("trim", borrarEspacios);




            while (!input.equals("salir")) {

                System.out.println("Escriba lo que desea realizar , seguido de la palabra o frase :");
                opcion = sc.nextLine();



                if (validarString()) {

                    realizar();

                    

                    
                }else{
                    
                    System.out.println("Datos introducidos son erroneos");

                }

                
            }
            
            
        }



}
