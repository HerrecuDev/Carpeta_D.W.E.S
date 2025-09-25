package streams;

import java.util.Map;

//Firma del metodo : 

public interface OperacionesStr {

        //
        //s -> s.toUpperCase()


    public String transforma(String str);

    public static String trasformar(String [] intruccionesArr , Map<String , OperacionesStr> mapOperacionesStr){

        return mapOperacionesStr.get(intruccionesArr[0]).transforma(intruccionesArr[1]);

    }
    
}
