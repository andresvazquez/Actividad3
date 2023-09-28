import java.util.*;

class Deck {
    // Clase que representa una Deck de poker
    //Escribe una clase llamada Deck, que representará el deck o conjunto de cartas de poker.
    private ArrayList<Card> cards;
    private HashSet<Card> dealtCards;

    public Deck() {
        cards = new ArrayList<>();
        dealtCards = new HashSet<>();
        initializeDeck();
    }

    //En Deck se inicializarán las 52 cartas de poker y las almacenará en uno de los atributos del tipo de estructura de datos seleccionada del Collection Framework.
    private void initializeDeck() {
        if(cards.isEmpty()) {
            String[] palos = {"Tréboles", "Corazones", "Picas", "Diamantes"};
            String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

            for (String palo : palos) {
                for (String valor : valores) {
                    if (palo.equals("Diamantes") || palo.equals("Corazones")) {
                        cards.add(new Card(palo, "Rojo", valor));
                    } else {
                        cards.add(new Card(palo, "Negro", valor));
                    }
                }
            }
        }else{
            System.out.println("Ya se ha inicializado el deck previamente.");
        }
    }

    //shuffle: mezclar el deck. El método deberá imprimir en pantalla el siguiente mensaje: Se mezcló el Deck.
    public void shuffle() throws IndexOutOfBoundsException{
        if (cards.isEmpty()) {
            // Manejar el caso en el que el mazo esté vacío, como lanzar una excepción.
            throw new IndexOutOfBoundsException("El deck está vacío, no se pueden mezclar las cartas.");
        }
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    //head: mostrar la primera carta del deck, la carta deberá removerse del deck. El método deberá imprimir en pantalla un mensaje con el siguiente formato: {Palo},{Color},{Valor}
    //Quedan {número de cartas en deck}
    public void head() throws IndexOutOfBoundsException{
        if (cards.isEmpty()) {
            // Manejar el caso en el que el mazo esté vacío, como lanzar una excepción.
            throw new IndexOutOfBoundsException("El deck está vacío, no se pueden repartir más cartas.");
        }
        Card dealt = cards.remove(0);
        dealtCards.add(dealt);
        System.out.println(dealt.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    //pick: seleccionar una carta al azar, la carta deberá removerse del deck. El método deberá imprimir en pantalla un mensaje con el siguiente formato: {Palo},{Color},{Valor}
    //Quedan {número de cartas en deck}
    public void pick() throws IndexOutOfBoundsException {
        if (cards.isEmpty()) {
            throw new IndexOutOfBoundsException("El deck está vacío.");
        }

        int randomIndex = (int) (Math.random() * cards.size());
        Card picked = cards.remove(randomIndex);
        dealtCards.add(picked);
        System.out.println(picked.toString());
        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    //hand: regresará un arreglo de cinco cartas del deck, las cartas deberán removerse del deck. El método deberá imprimir en pantalla un mensaje con el siguiente formato: {Palo},{Color},{Valor}
    //{Palo},{Color},{Valor}
    //{Palo},{Color},{Valor}
    //{Palo},{Color},{Valor}
    //{Palo},{Color},{Valor}
    //Quedan {número de cartas en deck}
    public void hand() throws IndexOutOfBoundsException{
        if (cards.size() < 5) {
            throw new IndexOutOfBoundsException("No hay suficientes cartas para repartir una mano.");
        }

        ArrayList<Card> hand = new ArrayList<>();
        int randomIndex=0;
        for (int i = 0; i < 5; i++) {
            randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            hand.add(card);
            dealtCards.add(card);
        }

        for (Card card : hand) {
            System.out.println(card.toString());
        }

        System.out.println("Quedan " + cards.size() + " cartas en el deck.");
    }

    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        String result = "";
        for (Card card : cards) {
            result = result + card.toString() + "\n";
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println("*********initializeDeck*********");
        Deck deck = new Deck();
        System.out.println("Número de cartas en el mazo es de: " + deck.size());
        try {
            System.out.println("*********Shuffle*********");
            deck.shuffle();
            System.out.println("*********Head*********");
            System.out.println("Se consulta el orden del deck: " + deck.cards.toString());
            deck.head();
            System.out.println("*********Pick*********");
            deck.pick();
            System.out.println("*********Hand*********");
            deck.hand();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
        System.out.println("******************");
        System.out.println("Estas son las cartas que se han ido sacando:");
        for (Card card : deck.dealtCards){
            System.out.println(card.toString());
        }
        System.out.println("******************");
        System.out.println("Estas son las cartas que aun quedan en el Deck: ");
        for (Card card : deck.cards){
            System.out.println(card.toString());
        }
    }
}
