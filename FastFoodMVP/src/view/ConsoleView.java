/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import model.ComboType;
import java.util.Scanner;

public class ConsoleView {
    private final Scanner sc = new Scanner(System.in);

    // 🔹 Limpia la consola con ANSI (funciona en terminales reales)
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    
    public void showWelcome(){
         System.out.println("_____Bienvenido al mennu de Combos_____");
    }
    
    public ComboType askComboType(){
        System.out.println("Elija el tipo de combo que quiera :");
        System.out.println(" 1. Hamburguesa clasica ");
        System.out.println(" 2. Hamburguesa pollo ");        
        System.out.println(" 3.Hamburguesa Vegetaria");
        System.out.println(" 4. Hamburguesa Queso y Carne");
        System.out.println("__Opcion (1-4): ");
        int opt = safeReadInt(1,4);
        return switch (opt) {
            case 1 -> ComboType.HAMBURGUESA;
            case 2 -> ComboType.POLLO;
            case 3 -> ComboType.VEGETARIANO;
            default -> ComboType.CHEESEBURGER;
        };
    }

    public String askDrink() {
        clearScreen();
        System.out.print("Elija bebida ");
        System.out.println(" 1. Gaseosa ");
        System.out.println(" 2. Jugo ");        
        System.out.println(" 3. Agua");
        System.out.println(" o Enter para omitir: ");
        int opt = safeReadInt(1,4);
        return switch (opt) {
            case 1 -> "Gase1osa";
            case 2 -> "Jugo";
            case 3 -> "Agua";
            default -> "";
        };
}
    public String askSide() {
        clearScreen();
        System.out.print("Elija acompañamiento ");
        System.out.println(" 1. Papas ");
        System.out.println(" 2. Ensalada ");        
        System.out.println(" 3. o Enter para omitir: ");
        int opt = safeReadInt(1,3);
        return switch (opt) {
            case 1 -> "Papas";
            case 2 -> "Ensalada";
            default -> "";
        };
    }

    public String askExtra() {
         clearScreen();
        System.out.print("Elija extra :");
        System.out.println(" 1. Queso ");
        System.out.println(" 2. Tocino ");        
        System.out.println(" 3. o Enter para omitir: ");
        int opt = safeReadInt(1,3);
        return switch (opt) {
            case 1 -> "Queso";
            case 2 -> "Tocino";
            default -> "";
    };
}
    public boolean confirmOrder() {
        clearScreen();
        System.out.print("¿Desea confirmar el pedido? (s/n): ");
        String r = sc.nextLine().trim().toLowerCase();
        return r.equals("s") || r.equals("si");
    }
    
    public boolean askAnotherOrder() {
    clearScreen();
    System.out.print("¿Desea pedir otro combo? (s/n): ");
    String r = sc.nextLine().trim().toLowerCase();
    return r.equals("s") || r.equals("si");
    }

    public void showSummary(Object obj) {
        System.out.println(obj.toString());
    }
    

    private int safeReadInt(int min, int max) {
        while (true) {
            try {
                String line = sc.nextLine().trim();
                int v = Integer.parseInt(line);
                if (v < min || v > max) throw new NumberFormatException();
                return v;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número válido (" + min + "-" + max + "): ");
            }
        }
    }
}