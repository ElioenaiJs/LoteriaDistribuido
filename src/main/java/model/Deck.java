package model;

import java.util.Collections;
import java.util.Stack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deck {

    private Stack<Card> cards = new Stack<>(); // Inicialización de la pila de cartas

    public void shuffle() {
        // Barajarear las cartas
        Collections.shuffle(cards);
    }

}
