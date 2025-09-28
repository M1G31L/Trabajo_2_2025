
package factory;
import model.Combo;
import model.ComboType;
/**
 *
 * @author ASUS
 */
public class ComboFactory {
    public static Combo createCombo(ComboType type){
        switch (type){
            case HAMBURGUESA:
                Combo c1 = new Combo("Hamburguesa", 22.90);
                c1.setMain("Hamburguesa clasica");
                return c1;
            case POLLO:
                Combo c2 = new Combo("pollo", 21.90);
                c2.setMain("Combo de pollo");
                return c2;
            case VEGETARIA:
                Combo c3 = new Combo("vegetariano",27.90);
                c3.setMain("combo Vegetariano");
                return c3;
            case CHEESEBURGER:
                Combo c4 = new Combo("Hamburguesa de queso", 28.90);
                c4.setMain ("Combo Queso ");
                return c4;
                default:
                throw new IllegalArgumentException("Tipo de combo desconocido");
        }
    }
}
