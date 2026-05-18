
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args) {
    
    BigDecimal preco = new BigDecimal("49.90");
    BigDecimal quantidade = new BigDecimal("3"); 
    BigDecimal desconto = new BigDecimal("0.95");
    BigDecimal total = preco.multiply(quantidade).multiply(desconto); 
    System.out.println("Total: " + total);
    
    
    }
}


