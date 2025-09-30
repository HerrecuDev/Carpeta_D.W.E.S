package streams;

import java.util.Map;

//Firma del metodo : 

public interface OperacionesparaStrings {

        //
        //s -> s.toUpperCase()


    public String transforma(String str);

    public static String trasformar(String [] intruccionesArr , Map<String , OperacionesparaStrings> mapOperacionesStr){

        return mapOperacionesStr.get(intruccionesArr[0]).transforma(intruccionesArr[1]);

    }
    
}
