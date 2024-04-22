/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import model.Deck;
import service.DeckService;

/**
 *
 * @author froste
 */
@AllArgsConstructor
@NoArgsConstructor
public class DeckController {
   
    private DeckService deckService;
    
    public Deck getDeck(){
        deckService = new DeckService();
        return deckService.getDeck();
    }
    
}
