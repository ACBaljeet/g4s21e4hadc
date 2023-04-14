
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "206","Socrates","Atenea","Nilo","1492"
    };
    
    String[] radioR = {
        "206,2106,300,216",
        "Platon,Socrates,Aristotales,Tales de mileto",
        "Afrodita,Venuso,Atenea,Artemisa",
        "TIgris,Eufrates,Amazonas,Nilo",
        "1512,1812,1642,1492"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
