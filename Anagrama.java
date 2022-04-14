public class Anagrama {
    
    static String ordenarPalabra( String palabra ){

        char letras[] = palabra.toCharArray();
        System.out.println(letras);
        for( int i = 0; i < letras.length - 1; i ++ ){
            for( int j = i + 1; j < letras.length; j ++ ){
                if( letras[i] > letras[j] ){
                    char aux = letras[j];
                    letras[j] = letras[i];
                    letras[i] = aux;
                }
            }
        }

        return new String( letras );
    }

    /*
    Crea una función que reciba dos Strings y que regrese si son anagrama
    Un anagrama es utilizar las mismas letras en dos palabras distintas
    Ej:  SERGIO y RIESGO
    
     */

    static boolean esAnagrama( String palabra1, String palabra2 ){

        if( palabra1.length() != palabra2.length() ){
            return false;
        }
        else{
            palabra1 = ordenarPalabra( palabra1 );
            palabra2 = ordenarPalabra( palabra2 );

            for( int i = 0; i < palabra1.length(); i ++ ){
                if( palabra1.charAt(i) != palabra2.charAt(i) ){
                    return false;
                }
            }
            return true;
        }    
    }
    public static void main( String args[] ){
        String palabra1 = "SERGIO";
        String palabra2 = "RIESGO";

        if( esAnagrama(palabra1, palabra2) ){
            System.out.println( palabra1 + " y " + palabra2 + " son anagramas." );
        }
        else{
            System.out.println( palabra1 + " y " + palabra2 + " NO son anagramas." );
        }
    }
}