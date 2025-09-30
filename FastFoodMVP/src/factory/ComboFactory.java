
package factory;
import model.Combo;
import model.ComboType;
/**
 *
 * @author ASUS
 */
public class ComboFactory {
    public static Combo createCombo(ComboType type){
        switch (type) {
            case HAMBURGUESA:
                Combo c1 = new Combo("Hamburguesa", 22.90);
                c1.setMain("Hamburguesa clasica");
                return c1;
            case POLLO:
                Combo c2 = new Combo("pollo", 21.90);
                c2.setMain("Combo de pollo");
                return c2;
            case VEGETARIANO:
                Combo c3 = new Combo("Vegetariano", 27.00);
                c3.setMain("Combo vegetariano");
                return c3;
            case CHEESEBURGER:
                Combo c4 = new Combo("Hamburguesa de queso", 28.90);
                c4.setMain ("Combo Queso ");
                return c4;
                default:
             case  VEGETARIANOANDCARNE:
                Combo c5;
            c5 = new Combo("Hamburguesa de VEGETALE Y CARNE", 30.90);
                c5.setMain ("Combo  VEGETALE Y CARNE ");
                throw new IllegalArgumentException("Tipo de combo desconocido");
        }
    }
}
