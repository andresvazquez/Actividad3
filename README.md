## Actividad 3
Actividad 3 del curso Computación en Java

Esta Actividad es una aplicación que simula una baraja de cartas, desarrollado por Andrés Eduardo Vázquez Pérez (Matrícula: AL03065873).

## Funcionamiento

El programa representa una baraja de poker y proporciona una serie de operaciones para simular acciones que se realizan comúnmente en una baraja de cartas.

•	InitializeDeck: Al ejecutar el programa, se crea una instancia de la clase Deck, que representa una baraja de poker. Esta baraja se inicializa automáticamente con las 52 cartas de poker, y las cartas se almacenan en una estructura de datos (en este caso, un ArrayList<Card>).

•	Operación de Barajado (shuffle): El programa permite barajar la baraja de poker. Cuando se llama al método shuffle, las cartas en la baraja se mezclan aleatoriamente, lo que cambia su orden. Se muestra un mensaje indicando que la baraja se ha mezclado.

•	Operación de Sacar la Primera Carta (head): El programa permite sacar la primera carta del mazo. Cuando se llama al método head, se retira la primera carta de la baraja, se muestra en la pantalla y se registra en un conjunto de cartas repartidas. Además, se muestra cuántas cartas quedan en el mazo.

•	Operación de Elegir una Carta Aleatoria (pick): El programa permite elegir una carta aleatoria del mazo. Cuando se llama al método pick, se selecciona una carta al azar de la baraja, se muestra en la pantalla y se registra en el conjunto de cartas repartidas. También se muestra cuántas cartas quedan en el mazo.

•	Operación de Repartir una Mano (hand): El programa permite repartir una mano de cinco cartas del mazo. Cuando se llama al método hand, se seleccionan cinco cartas al azar de la baraja, se muestran en la pantalla y se registran en el conjunto de cartas repartidas. También se muestra cuántas cartas quedan en el mazo.

•	Visualización de Cartas Repartidas (HashSet<Card> dealtCards): El programa muestra las cartas que se han sacado o repartido en el conjunto de cartas repartidas.

•	Visualización de Cartas en el Mazo (ArrayList<Card> cards): El programa muestra las cartas que aún quedan en la baraja de poker después de realizar las operaciones anteriores.

•	Excepciones Manejadas (try – catch): Se han manejado excepciones, como cuando se intenta realizar una operación en una baraja vacía, y se muestran mensajes de error adecuados en caso de que ocurran estas excepciones.

## Creditos
Autor: Andrés Eduardo Vázquez Pérez.
Matricula: AL03065873.
Universidad: Tec Milenio.

## Licencia
Este proyecto está bajo la [GNU General Public License, Versión 3](LICENSE). Consulta el archivo [LICENSE](LICENSE) para obtener más información sobre los términos y condiciones de la licencia.
