package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Pizza extends Elemento{
    protected List<Toppings> toppings;


    public Pizza(String nome, int calorie, double prezzo, List<Toppings> toppings) {
        super(nome, calorie, prezzo);
        this.toppings = toppings;
    }
}
