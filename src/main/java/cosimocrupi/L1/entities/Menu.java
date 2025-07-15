package cosimocrupi.L1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    protected List<Pizza> pizze;
    protected List<Bevanda> bevande;
    protected List<Toppings> toppings;

    @Override
    public String toString() {
        return "Menu{" +
                "pizze=" + pizze +
                ", bevande=" + bevande +
                ", toppings=" + toppings +
                '}';
    }

    public void stampaMenu(){
        System.out.println("*****************Menù*****************");
        System.out.println("Pizze");
        this.pizze.forEach(System.out::println);
        System.out.println();

        System.out.println("Aggiunte");
        this.toppings.forEach(System.out::println);
        System.out.println();

        System.out.println("Bevande");
        this.bevande.forEach(System.out::println);
        System.out.println();
    }
}
