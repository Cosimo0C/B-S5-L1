package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Elemento {
    protected int calorie;
    protected double prezzo;

    public Elemento(int calorie, double prezzo){
        this.calorie=calorie;
        this.prezzo=prezzo;
    }
}
