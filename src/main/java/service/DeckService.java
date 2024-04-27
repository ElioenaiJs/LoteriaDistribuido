package service;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import model.Card;
import model.Deck;
import repository.CardRepostitory;

@Data
public class DeckService {

    private Deck deck;
    private CardRepostitory imagesCardsRepo;

    public Deck getDeck() {

        //se instancian las clases
        deck = new Deck();
        imagesCardsRepo = new CardRepostitory();

        List<Card> cards = imagesCardsRepo.getImages();

        for (Card card : cards) {
            //   Card card = new Card(image, "frase", "names", Integer.SIZE, Boolean.TRUE);
            //cards.add(card);
            deck.getCards().add(card);
        }

        //se inicaliza el deck
        //  this.deck.setCards(cards);
        return this.deck;
    }
}
