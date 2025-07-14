package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Toppings extends Elemento{
    public Toppings(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}
