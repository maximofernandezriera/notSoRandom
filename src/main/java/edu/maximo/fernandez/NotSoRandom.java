package edu.maximo.fernandez;

public class NotSoRandom {

    /*Esta versión tiene una complejidad algorítmica de O(n), da timeout, donde n es el número total de canicas.
    Esta se debe a que, en el peor de los casos, el algoritmo
    realizaba una serie de operaciones que dependían linealmente del número total de canicas.*/
   /* public static String notSoRandom(int b, int w) {
        // Mientras haya más de una canica en el sombrero
        while (b + w > 1) {
            if (b >= 2) {
                // Si hay al menos dos canicas negras, se retiran dos y se añade una blanca
                b -= 2;
                w++;
            } else if (w >= 2) {
                // Si hay al menos dos canicas blancas, se retiran dos y se añade una blanca
                w--;
            } else {
                // Si hay una canica de cada color, se retiran ambas y se añade una negra
                b--;
                w--;
                b++;
            }
        }
        // Retornar el color de la última canica
        if (b == 1) {
            return "Black";
        } else if (w == 1) {
            return "White";
        } else {
            return "Unsure";
        }
    }*/

/*Esta versión tiene una complejidad algorítmica de O(1), no da timeout, ya que el número de operaciones
    que realiza el algoritmo es constante, independientemente del número total de canicas.
    Esta se debe a que, en el peor de los casos, el algoritmo
    realizaba una serie de operaciones que no dependían del número total de canicas.
 */
    /*public static String notSoRandom(int b, int w) {
        while (b + w > 1) {
            b = (b >= 2) ? b - 1 : b;
            w = (w >= 2 || b == 0) ? w - 1 : w + 1;
        }
        return b == 1 ? "Black" : "White";
    }*/

    /*
    Notamos que el bucle no es necesario cada acción reduce el número total de canicas en una unidad.
    Si se retiran dos canicas de diferentes colores, se añade una negra.
    Si se retiran dos del mismo color, se añade una blanca.
    Por lo tanto, si empiezas con un número par de canicas negras, siempre terminarás con una canica blanca, ya que cada acción elimina una canica negra o no altera el paridad de canicas negras.
    Si empiezas con un número impar de canicas negras, siempre terminarás con una canica negra.
    Finalmente vemos que el color de la última canica depende de la paridad del número de canicas negras. Si es par, la última canica será blanca, si es impar, será negra.
    Y la complejidad algorítmica es O(1), ya que el número de operaciones
    que realiza el algoritmo es constante, independientemente del número total de canicas.
     */

   public static String notSoRandom(int b, int w) {
        return b % 2 > 0 ? "Black" : "White";
    }
}
