# https://www.codewars.com/kata/58ad2e9c0e3c08126000003f/solutions/java

## Debemos predecir el color de la última canica en un sombrero mágico.

* Empezamos con un número de canicas negras (b) y blancas (w). 
* Las canicas se retiran en pares y, según el par retirado, se agrega una canica nueva al sombrero. 
* Si las canicas son del mismo color, se añade una canica blanca; si son de colores diferentes, se añade una negra.

## El objetivo es determinar el color de la última canica que quedará en el sombrero, devolviendo "Black", "White" o "Unsure".

Notamos que el bucle no es necesario cada acción reduce el número total de canicas en una unidad.
    - Si se retiran dos canicas de diferentes colores, se añade una negra.
    - Si se retiran dos del mismo color, se añade una blanca.
    - Por lo tanto, si empiezas con un número par de canicas negras, siempre terminarás con una canica blanca, ya que cada acción elimina una canica negra o no altera el paridad de canicas negras.
    - Si empiezas con un número impar de canicas negras, siempre terminarás con una canica negra.
    - Finalmente vemos que el color de la última canica depende de la paridad del número de canicas negras. Si es par, la última canica será blanca, si es impar, será negra.
    - Y la complejidad algorítmica es O(1), ya que el número de operaciones que realiza el algoritmo es constante, independientemente del número total de canicas.
