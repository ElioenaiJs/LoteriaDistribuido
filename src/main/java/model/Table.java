package model;

import java.util.HashMap;
import java.util.Map;

public class Table {

    private Map<Integer, Card> table;

    public Table() {
        // Crear una tabla vacía
        table = new HashMap<>();
    }
    
     public void setupTable(Deck deck) {
        deck.shuffle(); // Barajar las cartas en el mazo

        // Sacar 16 cartas del mazo y colocarlas en la tabla
        for (int i = 0; i < 16; i++) {
            Card card = deck.getCards().pop(); // Sacar una carta del mazo
            table.put(card.getNumber(), card); // Colocar la carta en la tabla en la posición i
            System.out.println(i);
        }
        
         System.out.println("setupTable size: " + table.size());
    }
    
    // Método para obtener la tabla
    public Map<Integer, Card> getTable() {
        return this.table;
    }

    // Otros métodos de la clase Table
}
