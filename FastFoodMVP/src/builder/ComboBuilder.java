package builder;

import model.Combo;

public class ComboBuilder {
    private final Combo combo;

    public ComboBuilder(Combo combo) {
        this.combo = combo;
    }

    public ComboBuilder withDrink(String drink) {
        if (drink != null && !drink.trim().isEmpty()) {
            combo.setDrink(drink);
            combo.addPrice(getDrinkPrice(drink));
        }
        return this;
    }

    public ComboBuilder withSide(String side) {
        if (side != null && !side.trim().isEmpty()) {
            combo.setSide(side);
            combo.addPrice(getSidePrice(side));
        }
        return this;
    }

    public ComboBuilder withExtra(String extra) {
        if (extra != null && !extra.trim().isEmpty()) {
            combo.setExtra(extra);
            combo.addPrice(getExtraPrice(extra));
        }
        return this;
    }

    public Combo build() {
        return combo;
    }

    private double getDrinkPrice(String drink){
        String d = drink .toLowerCase();
        if (d.contains("agua")) return 3.0;
        if (d.contains("jugo")) return 2.75;
        if (d.contains("gaseosa") || d.contains("refresco")) return 3.5;
        return 3.5;
    }
    private double getSidePrice(String side){
        String s = side.toLowerCase();
        if (s.contains("papas")) return 5.99;
        if (s.contains("ensalada")) return 4.5;
        if (s.contains("arroz")) return 6.0;
        return 6.0;
    }
    private double getExtraPrice(String extra){
        String e = extra.toLowerCase();
        if (e.contains("queso")) return 2.0;
        if (e.contains("tomate")) return 2.0;
        if (e.contains("carne")) return 3.5;
        if (e.contains("tocino") || e.contains("bacon")) return 2.5;
        return 2.5;
    }
}
