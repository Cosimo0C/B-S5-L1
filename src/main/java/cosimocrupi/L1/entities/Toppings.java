package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Toppings extends Elemento{
    public Toppings(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", nome='" + nome + '\'' +
                '}';
    }
}
