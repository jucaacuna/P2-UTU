package evaluacion01;

import java.util.Hashtable;


/*
 * La solucion más corta en líneas. Utilizando una colección de tipo mapa o diccionario.
 */
public class Escrito1solucionD {


  static String texto1 = "Aquí va el texto";
  static String texto2 = "Aquí va el texto";
  static Hashtable<Character, Integer> midiccionario;

  public static void main(String[] args) {
    System.out.println("## TEXTO 1 ##");
    analizar(texto1);
    imprimir();
    System.out.println("## TEXTO 2 ##");
    analizar(texto1);
    imprimir();
  }

  static void analizar(String txt) {
    midiccionario = new Hashtable<Character, Integer>();
    for (int posicion = 0; posicion < txt.length(); posicion++) {
      Character elemento = Character.valueOf(txt.charAt(posicion));
      if (midiccionario.containsKey(elemento)) {
        Integer nuevoValor = Integer.valueOf(midiccionario.get(elemento).intValue() + 1);
        midiccionario.put(elemento, nuevoValor);
      } else {
        midiccionario.put(elemento, Integer.valueOf(1));
      }
    }
  } // fin analizar

  static void imprimir() {
    System.out.println("  INCIDENCIAS  ");
    System.out.println(midiccionario.toString());
  } // fin imprimir


}
