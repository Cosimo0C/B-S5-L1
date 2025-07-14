package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Pizza extends Elemento{
    protected List<Toppings> toppings;


    public Pizza(String nome, int calorie, double prezzo, List<Toppings> toppings) {
        super(nome, calorie, prezzo);
        this.toppings = toppings;
    }
}
