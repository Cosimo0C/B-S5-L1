package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Bevanda extends Elemento{
    public Bevanda(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Bevanda{" +
                "prezzo=" + prezzo +
                ", calorie=" + calorie +
                ", nome='" + nome + '\'' +
                '}';
    }
}
