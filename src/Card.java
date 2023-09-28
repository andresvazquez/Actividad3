class Card {
    //Escribe una clase llamada Card, que representará una carta de poker.
    // Clase que representa una carta de poker
    //Card deberá tener tres atributos; palo, color, valor

    private String palo;
    private String color;
    private String valor;

    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}