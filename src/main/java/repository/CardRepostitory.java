/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author froste
 */
public class CardRepostitory {
    
    //Repositoriio de imagenes
    private List<String> images;
    
    //se contruye la ruta de las imagenes
    public CardRepostitory(){
        
        this.images = new ArrayList<>();

        //se agregan las imagenes a la listas
        this.images.add("/resources/images/1 gallo.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/54 la rana.jpg");
        this.images.add("/resources/images/image-removebg-preview.png");
        
        
    }
    
    public List<String> getImages(){
        return this.images;
    }
    
}
