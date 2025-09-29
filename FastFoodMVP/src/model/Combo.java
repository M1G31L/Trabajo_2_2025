package model;
import java.text.NumberFormat;
import java.util.Locale;

public class Combo {
    private final String type;
    private String main; 
    private String drink;
    private String side;
    private String extra;
    private double price;
    
    public Combo(String type, double basePrice){
        this.type = type;
        this.main = type;
        this.price = basePrice;
    }
    public String getType(){return type;}
    public String getMain(){return main;}
    public void setMain( String main) {this.main = main;}
    
    public String getDrink() { return drink; }
    public void setDrink(String drink) { this.drink = drink; }
    
    public String getSide() { return side; }
    public void setSide(String side) { this.side = side; }
    
    public String getExtra() { return extra; }
    public void setExtra(String extra) { this.extra = extra; }
    
    public double getPrice() { return price; }
    public void addPrice(double p) { this.price += p; }
    
    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es","ES"));
        StringBuilder sb = new StringBuilder();
        sb.append("----- Resumen del Combo -----\n");
        sb.append("Tipo: ").append(type).append("\n");
        sb.append("Principal: ").append(main).append("\n");
        sb.append("Bebida: ").append(drink == null ? "Sin bebida" : drink).append("\n");
        sb.append("Acompañamiento: ").append(side == null ? "Sin acompañamiento" : side).append("\n");
        sb.append("Extra: ").append(extra == null ? "Sin extra" : extra).append("\n");
        sb.append("Precio total: ").append(nf.format(price)).append("\n");
        sb.append("----------------------------\n");
        return sb.toString();
    }
}  
