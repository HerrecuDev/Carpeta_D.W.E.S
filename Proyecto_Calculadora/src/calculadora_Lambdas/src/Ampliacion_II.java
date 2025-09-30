import java.util.Scanner;
import java.util.function.Predicate;

public class Ampliacion_II {

    private static String [] intruccion;


    //Generamos la funcion validar : 

    public static boolean validarinput(String[] intruccion){

        boolean salida = true;

        if (intruccion.length == 1) {

            salida = true;
            try {

                Integer.parseInt(intruccion[0]);
                
            } catch (NumberFormatException e) {
                salida = false;
            }
            
        }

        return salida;
    }


    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        boolean salir = false;



        while (!salir) {

            //Convertimos el input en un Array :

            String[] instruccion = input.trim().split("\\$+");


            //Valido imput y hago la operacion correspondiente :

            if (validarinput(instruccion)) {


                Predicate<Integer> predicadoEsPar =  num -> num %2  == 0;
                Predicate<Integer> predicadoEsPrimo =  num -> {
                    int cont = 2;
                    boolean esPrimo = true;
                    
                    while (!esPrimo && cont <= (int)Math.sqrt(num)) {

                        esPrimo = num % cont != 0;
                        cont++;
                        
                    }
                    return esPrimo;

                };


                if (predicadoEsPar.test(Integer.parseInt(instruccion[0]))) {

                System.out.println("Es par");
                
                }
                if (predicadoEsPrimo.test(Integer.parseInt(instruccion[0]))) {

                    System.out.println("Es primo");
                    
                }
                
            }

            
            
        }

        


    }

}
