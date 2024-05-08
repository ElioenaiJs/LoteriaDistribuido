package service;

import java.util.Map;
import model.Card;
import model.Table;

/**
 *
 * @author froste
 */
public class TableService {

    public boolean hasCard(Table table, Card card) {
        Map<Integer, Card> tableCards = table.getTable();

        // Check if the card's number is present in the table
        if (tableCards.containsKey(card.getNumber())) {
            // If the card is present, check if the other attributes match
            Card tableCard = tableCards.get(card.getNumber());
            return tableCard.getImage().equals(card.getImage())
                    && tableCard.getPhrase().equals(card.getPhrase())
                    && tableCard.getName().equals(card.getName())
                    && tableCard.getState().equals(card.getState());
        }

        // If the card's number is not present in the table, the card is not on the table
        return false;
    }

    public void disableCard(Table table, Card card) {
        Map<Integer, Card> tableCards = table.getTable();

        // Check if the card's number is present in the table
        if (tableCards.containsKey(card.getNumber())) {
            // Get the card from the table
            Card tableCard = tableCards.get(card.getNumber());

            // Disable the card by setting its state to false
            tableCard.setState(false);
            
            tableCard.setImage("/resources/images/frijol.jpg");

            // Update the card in the table
            tableCards.put(tableCard.getNumber(), tableCard);
        } else {
            // If the card is not on the table, do nothing
            System.out.println("Card not found on the table.");
        }
    }

    /**
     *
     * @param table
     * @return true if all the cards are in state false and false if not
     */
    public boolean isWinner(Table table) {
        Map<Integer, Card> tableCards = table.getTable();

        // Iterate through all cards on the table
        for (Card card : tableCards.values()) {
            if (card.getState()) {
                // If any card is not disabled, return false
                return false;
            }
        }

        // If all cards are disabled, return true
        return true;
    }

}
