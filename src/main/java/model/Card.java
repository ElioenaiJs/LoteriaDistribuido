
package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private String image;
    private String phrase;
    private String name;
    private Integer number;
    private Boolean state;
    
}
