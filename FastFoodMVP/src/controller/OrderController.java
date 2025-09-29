package controller;

import factory.ComboFactory;
import builder.ComboBuilder;
import model.ComboType;
import model.Combo;
import view.ConsoleView;

public class OrderController {
     private ConsoleView view = new ConsoleView();

    public void start() {
        view.showWelcome();

        ComboType type = view.askComboType();
        Combo base = ComboFactory.createCombo(type);

        ComboBuilder builder = new ComboBuilder(base);
        String drink = view.askDrink();
        builder.withDrink(drink);
        String side = view.askSide();
        builder.withSide(side);
        String extra = view.askExtra();
        builder.withExtra(extra);

        Combo finalCombo = builder.build();
        view.showSummary(finalCombo);

        boolean ok = view.confirmOrder();
        if (ok) {
            System.out.println("Pedido confirmado. ¡Gracias por preferirnos!");
        } else {
            System.out.println("Pedido cancelado. Puede empezar de nuevo si desea.");
        }
    }
}
