package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Toppings extends Elemento{
    public Toppings(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}
