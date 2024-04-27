package service;

import model.Deck;
import model.Table;

public class prueba {
    public static void main(String[] args) {
        DeckService deckService = new DeckService();
        // Crear una instancia de Deck
        Deck deck = deckService.getDeck();

        // Mostrar el contenido del mazo antes de barajar
        System.out.println("Contenido del mazo antes de barajar:");
        deck.getCards().forEach(card -> System.out.println(card));

        // Barajar el mazo
        deck.shuffle();

        // Mostrar el contenido del mazo después de barajar
        System.out.println("\nContenido del mazo después de barajar:");
        deck.getCards().forEach(card -> System.out.println(card));
        System.out.println(deck.getCards().empty());
        // Crear una instancia de Table
        Table table = new Table();

        // Configurar la tabla pasando el mazo barajado como argumento
        table.setupTable(deck);

        // Imprimir el contenido de la tabla
        System.out.println("\nContenido de la tabla:");
        table.getTable().forEach((number, card) -> {
            System.out.println("Número: " + number + ", Carta: " + card);
        });
    }
}
