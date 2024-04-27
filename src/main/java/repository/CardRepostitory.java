/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Card;

/**
 *
 * @author froste
 */
public class CardRepostitory {
    
    //Repositoriio de imagenes
    private List<Card> images;
    
    //se contruye la ruta de las imagenes
    public CardRepostitory(){
        
        this.images = new ArrayList<>();

        //se agregan las imagenes a la listas
        this.images.add(new Card("/resources/images/1 gallo.jpg",
                "El que le cantó a San Pedro, no le volverá a cantar", "El gallo", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/2 diablo.jpg",
                "Pórtate bien cuatito, si no te lleva el coloradito", "El diablo", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/3 la dama.jpg"
                , "La dama puliendo el paso, por toda la calle real ", "La dama", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/4 el catrin.jpg",
                "Don Ferruco en la Alameda su bastón quería tirar", "El catrin", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/5 el paraguas.jpg",
                "Para el sol y para el agua ", "El paraguas", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/6 la sirena.jpg",
                "Con los cantos de sirena no te vayas a marear", "La sirena", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/7 la escalera.jpg",
                "Súbeme paso a pasito, no quieras de un brinquito", "La escalera", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/8 la botella.jpg",
                "La herramienta del borracho", "La botella", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/9 barril.jpg",
                "Tanto bebió el albañil, que quedó como barril", "El barril", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/10 arbol.jpg",
                "El que a buen árbol se arrima, buena sombra le cobija", "El arbol", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/11 melon.jpg",
                "Me lo das o me lo quitas", "El melon", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/12 el valiente.jpg",
                "Por qué le corres cobarde trayendo tan buen puñal", "El valiente", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/13 el gorrito.jpg",
                "Ponle su gorrito al nene, no se nos vaya a enfermar", "El gorrito", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/14 la muerte.jpg",
                "Aquí viene la señora muerte, la tilica y flaca", "La muerte", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/15 la pera.jpg",
                "El que espera, desespera o se casa con doña Espera", "La pera", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/16 la bandera.jpg",
                "Verde, blanco y colorado, la bandera del soldado", "La bandera", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/17 el bandolon.jpg",
                "Tocando su bandolón, está el mariachi Simón", "El bandolon", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/18 el violoncello.jpg",
                "Como no fue violón, tuvo que ser violoncello", "El violoncello", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/19 la garza.jpg",
                "Ya vinieron picos largos, de la feria de San Juan", "La garza", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/20 el pajaro.jpg",
                "Tú me traes a puros brincos, como pájaro en la rama", "El pajaro", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/21 la mano.jpg",
                "La mano más larga es la de un criminal", "La mano", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/22 la bota.jpg",
                "Una bota es igual que l’otra ", "La bota", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/23 la luna.jpg",
                "El farol de los enamorados", "La luna", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/24 el cotorro.jpg",
                "Cotorro, da acá la pata y empiézame a platicar", "El cotorro", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/25 el borracho.jpg",
                "¡Ah, que borracho tan necio, ya no lo puedo aguantar! ", "El borracho", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/26 el negrito.jpg",
                "El que se comió el azúcar", "El negrito", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/27 el corazon.jpg",
                "No me extrañes corazón, que regreso en el camión", "El corazon", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/28 la sandia.jpg",
                "La barriga que Juan tenía, era empacho de sandía", "La sandia", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/29 el tambor.jpg",
                "No te arrugues cuero viejo que te quiero pa’ tambor", "El tambor", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/30 el camaron.jpg",
                "Camarón que se duerme, se lo lleva la corriente", "El camaron", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/31 el las jaras.jpg",
                "Las jaras del indio Adán, donde pegan, dan", "Las jaras", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/32 el musico.jpg",
                "El músico trompa de hule, ya no me quiere tocar", "El musico", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/33 la araña.jpg",
                "Atarántamela a palos, no me la dejes llegar", "La araña", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/34 el soldado.jpg",
                "Uno, dos y tres, el soldado p’al cuartel", "El soldado", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/35 la estrella.jpg",
                "La guía de los marineros", "La estrella", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/36 el cazo.jpg",
                "El caso que te hago es poco ", "El cazo", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/37 el mundo.jpg",
                "Este mundo es una bola y nosotros un bolón", "El mundo", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/38 el apache.jpg",
                "¡Ay Chihuahua! cuánto apache y yo sin flechas ", "El apache", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/39 el nopal.jpg",
                "Al que todos van a ver, cuando tienen que comer", "El nopal", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/40 el alacran.jpg",
                "El que con la cola pica", "El alacran", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/41 la rosa.jpg",
                "Rosa, Rosita, Rosaura ", "La rosa", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/42 la calavera.jpg",
                "Al pasar por el panteón, me encontré un calaverón", "La calavera", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/43 la campana.jpg",
                "Tú con la campana y yo con tu hermana ", "La campana", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/44 el cantarito.jpg",
                "Tanto va el cántaro al agua, que se quiebra y te moja las enaguas", "El cantarito", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/45 el venado.jpg",
                "El venado no ve nada", "El venado", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/46 el sol.jpg",
                "La cobija de los pobres", "El sol", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/47 la corona.jpg",
                "El sombrero de los reyes", "La corona", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/48 la chalupa.jpg",
                "Rema y rema va Lupita, sentada en su chalupita", "La corona", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/49 el pino.jpg",
                "Fresco, oloroso y en todo tiempo hermoso", "El pino", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/50 el pescado.jpg",
                "El que por la boca muere, aunque mudo fuere", "El pescado", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/51 la palma.jpg",
                "Palmero sube a la palma y bájame un coco real", "La palma", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/52 la maceta.jpg",
                "El que nace pa’ maceta, no sale del corredor", "La maceta", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/53 el arpa.jpg",
                "L’arpa vieja de mi suegra, ya no sirve p’a tocar", "El arpa", 1, Boolean.FALSE));
        this.images.add(new Card("/resources/images/54 la rana.jpg",
                "Al ver a la verde rana, ¡qué brinco pegó tu hermana!", "La rana", 1, Boolean.FALSE));
       
        
       
        
        
    }
    
    public List<Card> getImages(){
        return this.images;
    }
    
}
