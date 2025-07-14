package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bevanda extends Elemento{
    public Bevanda(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }
}
