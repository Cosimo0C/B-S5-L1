package cosimocrupi.L1.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Elemento {
    protected String nome;
    protected int calorie;
    protected double prezzo;

    public Elemento(String nome, int calorie, double prezzo){
        this.nome=nome;
        this.calorie=calorie;
        this.prezzo=prezzo;
    }
}
