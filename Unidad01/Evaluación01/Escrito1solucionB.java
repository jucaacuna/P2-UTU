package evaluacion01;

/*
 * Una solución más completa. Utilizando métodos.
 * 
 */
public class Escrito1solucionB {
  static int a = 0;
  static int b = 0;
  static int c = 0;
  static int d = 0;
  static int e = 0;
  static int f = 0;
  static int g = 0;
  static int h = 0;
  static int i = 0;
  static int j = 0;
  static int k = 0;
  static int l = 0;
  static int m = 0;
  static int n = 0;
  static int o = 0;
  static int p = 0;
  static int q = 0;
  static int r = 0;
  static int s = 0;
  static int t = 0;
  static int u = 0;
  static int v = 0;
  static int w = 0;
  static int x = 0;
  static int y = 0;
  static int z = 0;

  static String texto1 = "Aqui va el texto";
  static String texto2 = "Aqui va el texto";

  public static void main(String[] args) {

    System.out.println("## TEXTO 1 ##");
    analizar(texto1); // El uso de métodos nos permite reutilizar código y como consecuencia,
                      // nuestro código no es tan extenso.
    imprimir();
    reiniciar();
    System.out.println("## TEXTO 2 ##");
    analizar(texto2);
    imprimir();

  }

  static void analizar(String txt) {
    for (int posicion = 0; posicion < txt.length(); posicion++) {

      char actual = txt.charAt(posicion);
      if (actual == 'a' || actual == 'A') {
        a++;
      } else if (actual == 'b' || actual == 'B') {
        b++;
      } else if (actual == 'c' || actual == 'C') {
        c++;
      } else if (actual == 'd' || actual == 'D') {
        d++;
      } else if (actual == 'e' || actual == 'E') {
        e++;
      } else if (actual == 'f' || actual == 'F') {
        f++;
      } else if (actual == 'g' || actual == 'G') {
        g++;
      } else if (actual == 'h' || actual == 'H') {
        h++;
      } else if (actual == 'i' || actual == 'I') {
        i++;
      } else if (actual == 'j' || actual == 'J') {
        j++;
      } else if (actual == 'k' || actual == 'K') {
        k++;
      } else if (actual == 'l' || actual == 'L') {
        l++;
      } else if (actual == 'm' || actual == 'M') {
        m++;
      } else if (actual == 'n' || actual == 'N') {
        n++;
      } else if (actual == 'o' || actual == 'O') {
        o++;
      } else if (actual == 'p' || actual == 'P') {
        p++;
      } else if (actual == 'q' || actual == 'Q') {
        q++;
      } else if (actual == 'r' || actual == 'R') {
        r++;
      } else if (actual == 's' || actual == 'S') {
        s++;
      } else if (actual == 't' || actual == 'T') {
        t++;
      } else if (actual == 'u' || actual == 'U') {
        u++;
      } else if (actual == 'v' || actual == 'V') {
        v++;
      } else if (actual == 'w' || actual == 'W') {
        w++;
      } else if (actual == 'x' || actual == 'X') {
        x++;
      } else if (actual == 'y' || actual == 'Y') {
        y++;
      } else if (actual == 'z' || actual == 'Z') {
        z++;
      }
    }
  } // fin analizar

  static void imprimir() {
    System.out.println("INCIDENCIAS" + "\nA: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d
        + "\nE: " + e + "\nF: " + f + "\nG: " + g + "\nH: " + h + "\nI: " + i + "\nJ: " + j
        + "\nK: " + k + "\nL: " + l + "\nM: " + m + "\nN: " + n + "\nO: " + o + "\nP: " + p
        + "\nQ: " + q + "\nR: " + r + "\nS: " + s + "\nT: " + t + "\nU: " + u + "\nV: " + v
        + "\nW: " + w + "\nX: " + x + "\nY: " + y + "\nZ: " + z);
  } // fin imprimir

  static void reiniciar() {
    a = 0;
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    f = 0;
    g = 0;
    h = 0;
    i = 0;
    j = 0;
    k = 0;
    l = 0;
    m = 0;
    n = 0;
    o = 0;
    p = 0;
    q = 0;
    r = 0;
    s = 0;
    t = 0;
    u = 0;
    v = 0;
    w = 0;
    x = 0;
    y = 0;
    z = 0;

  }
}
