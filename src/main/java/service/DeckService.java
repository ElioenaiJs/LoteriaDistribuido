/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import model.Card;
import model.Deck;
import repository.CardRepostitory;

/**
 *
 * @author froste
 */
@Data
public class DeckService {
    
    private Deck deck;
    private CardRepostitory imagesCardsRepo;
    
    public Deck getDeck(){
        
        //se instancian las clases
        deck = new Deck();
        imagesCardsRepo = new CardRepostitory();
        
        List<Card> cards = new ArrayList<>();
        
        
        for (String image : imagesCardsRepo.getImages()) {
            Card card = new Card(image, "frase", "names", Integer.SIZE, Boolean.TRUE);
            cards.add(card);
        }
        
        
        //se inicaliza el deck
        this.deck.setCards(cards);
        
        return this.deck;
    }
}
