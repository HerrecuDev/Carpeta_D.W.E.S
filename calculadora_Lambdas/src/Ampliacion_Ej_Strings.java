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

            

            if (introStrings.length <= 1) {

                formato = false;
                System.out.println("No ha introducido nada");
                return formato;
                
            }
            else if (introStrings.length <=2) {

                formato = false;

                System.out.println("Escriba la frase o palabra que desea interpretar");

                return formato;
                
            }
            else{

                formato = true;

                return formato;

            }



        }

        //Realizamos un nuevo parseo para no repetirnos :
        public static Double parseo(String input){

            Double entrada = null;

            try {
                entrada = Double.parseDouble(input);
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
            double frase = parseo(introStrings[1]);

            OperacionesparaStrings op = mapStrings.get(introStrings[0]);

            


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


            mapStrings.put("Upper", mayuscula);
            mapStrings.put("Lower", mayuscula);
            mapStrings.put("Reverse", mayuscula);
            mapStrings.put("length", mayuscula);
            mapStrings.put("trim", mayuscula);




            while (!input.equals("salir")) {

                System.out.println("Escriba lo que desea realizar , seguido de la palabra o frase :");
                input = sc.nextLine();



                if (validarString()) {


                    
                }else{

                }

                
            }
            
            
        }



}
