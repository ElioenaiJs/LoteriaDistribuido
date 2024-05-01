package controller;

import java.util.Collections;
import java.util.List;
import model.Card;
import model.Deck;
import service.DeckService;

public class DeckController {
   
    private DeckService deckService;
    
    public DeckController() {
        deckService = new DeckService();
    }
    
    public Deck getDeck() {
        return deckService.getDeck();
    }
    
    public List<Card> getShuffledDeck() {
        Deck deck = deckService.getDeck();
        deck.shuffle(); // Barajar las cartas en el mazo
        return deck.getCards(); // Devolver las cartas barajadas
    }
}
