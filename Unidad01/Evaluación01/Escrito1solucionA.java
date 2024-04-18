package evaluacion01;

/*
 * Una solución flojita pero válida para el escrito.
 */
public class Escrito1solucionA {
  static String texto1 = "Aquí va el texto";
  static String texto2 = "Aquí va el texto";

  public static void main(String[] args) {
    int a = 0; // Defino una variable por cada letra del alfabeto inglés. Total: 26
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    int n = 0;
    int o = 0;
    int p = 0;
    int q = 0;
    int r = 0;
    int s = 0;
    int t = 0;
    int u = 0;
    int v = 0;
    int w = 0;
    int x = 0;
    int y = 0;
    int z = 0;

    for (int posicion = 0; posicion < texto1.length(); posicion++) { // recorro el string como si
                                                                     // fuese un array.

      char actual = texto1.charAt(posicion); // Recordemos que un String no es una suma de char.
                                             // Pero con el método charAt() puedo transformar la
                                             // posoción dada en un char. Por eso lo almaceno en una
                                             // variable char.
      if (actual == 'a' || actual == 'A') {
        a++;
      } else if (actual == 'b' || actual == 'B') { // para definir un char usamos una sola comilla.
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
    System.out.println("## TEXTO 1 ##");
    System.out.println("INCIDENCIAS" + "\nA: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d
        + "\nE: " + e + "\nF: " + f + "\nG: " + g + "\nH: " + h + "\nI: " + i + "\nJ: " + j
        + "\nK: " + k + "\nL: " + l + "\nM: " + m + "\nN: " + n + "\nO: " + o + "\nP: " + p
        + "\nQ: " + q + "\nR: " + r + "\nS: " + s + "\nT: " + t + "\nU: " + u + "\nV: " + v
        + "\nW: " + w + "\nX: " + x + "\nY: " + y + "\nZ: " + z);
    // --------------------- COMIENZA EL PROCESAMIENTO DEL SEGUNDO TEXTO
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

    for (int posicion = 0; posicion < texto2.length(); posicion++) { // recorro el string como si
                                                                     // fuese un array.

      char actual = texto2.charAt(posicion); // Recordemos que un String no es una suma de char.
                                             // Pero con el método charAt() puedo transformar la
                                             // posoción dada en un char. Por eso lo almaceno en una
                                             // variable char.
      if (actual == 'a' || actual == 'A') {
        a++;
      } else if (actual == 'b' || actual == 'B') { // para definir un char usamos una sola comilla.
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
    System.out.println("## TEXTO 2 ##");
    System.out.println("INCIDENCIAS" + "\nA: " + a + "\nB: " + b + "\nC: " + c + "\nD: " + d
        + "\nE: " + e + "\nF: " + f + "\nG: " + g + "\nH: " + h + "\nI: " + i + "\nJ: " + j
        + "\nK: " + k + "\nL: " + l + "\nM: " + m + "\nN: " + n + "\nO: " + o + "\nP: " + p
        + "\nQ: " + q + "\nR: " + r + "\nS: " + s + "\nT: " + t + "\nU: " + u + "\nV: " + v
        + "\nW: " + w + "\nX: " + x + "\nY: " + y + "\nZ: " + z);
  }


}
