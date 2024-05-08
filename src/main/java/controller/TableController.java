/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import model.Card;
import model.Table;
import service.TableService;

/**
 *
 * @author froste
 */
@AllArgsConstructor
public class TableController {
    
    private final TableService tableService;

    public TableController() {
        this.tableService = new TableService();
    }

    public boolean hasCard(Table table, Card card) {    
        
        return tableService.hasCard(table,card);
    }

    public void disableCard(Table table, Card card) {
        this.tableService.disableCard(table,card);
    }

    public boolean isWinner(Table table) {
        return this.tableService.isWinner(table);
    }
    
}
