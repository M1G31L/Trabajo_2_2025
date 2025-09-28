package model;
import java.text.NumberFormt;
import java.util.Locale;

public class Combo {
    private string type;
    private string main;
    private string drink;
    private string side;
    private string extra;
    private double price;
    
    public Combo(String type, double basePrice){
        this.type = type:
        this.main = type:
        this.price = basePrice;
    }
    public String getType(){return type;}
    public String getMain(){return main;}
    public void setMain( String main) {this.main = main;}
    
    public String getDrink(){return drink;}
    public void setDrink (String drink;){this.drink = drink;}
    
    public String getSide(){return side;}
    public void setSide (String side;){this.side = side;}
    
    public String getExtra(){return extra;}
    public void setExtra (String extra;){this.extra = extra;}
    
    public String getPrice(){return price;}
    public void addPrice(double p;){this.price += price;}
    
    @Override
    public String to String){
    NumberFormat nf = NumberFormat.getCurrencyInstance(new locale ("es","ES"));
    StringBuilder sb = new StringBuilder();
    sb.append("_____Resumen del Combo_____\n");
    sb.append("Tipo : ").append(type).append("\n");
    sb.append("Bebida :").append(drink == null? "Sin bebida" : drink).append("\n");
    sb.append("Acompañamiento :").append(side == null? "Sin acompañamiento" : side).append("\n");
    sb.append("Precio total :").append(nf.fortmat(price)).append("\n");
    sb.append("___________________\n");
    return sb.toString();
    }
}    
   
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    
}
