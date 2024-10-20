// 1 We have a list of dictionaries representing product information 
// (keys: "name", "price", "quantity"). Write a function that generates 
// a dictionary from this list, in which the key is the product name and the 
// value is the total price of this product (price * quantity).
//

import java.util.*;

public class Exercise1 {
    
    public static Map<String, Double> calculateTotalPrices(List<Map<String, Object>> products) {
        Map<String, Double> result = new HashMap<>();
        
        for (Map<String, Object> product : products) {
            String name = (String) product.get("name");
            double price = ((Number) product.get("price")).doubleValue();
            int quantity = ((Number) product.get("quantity")).intValue();
            
            double totalPrice = price * quantity;
            result.put(name, totalPrice);
        }
        
        return result;
    }
    
    public static void main(String[] args) {

        List<Map<String, Object>> products = new ArrayList<>();
        
        Map<String, Object> product1 = new HashMap<>();
        product1.put("name", "Laptop");
        product1.put("price", 1000.0);
        product1.put("quantity", 2);
        products.add(product1);
        
        Map<String, Object> product2 = new HashMap<>();
        product2.put("name", "Mysz");
        product2.put("price", 50.0);
        product2.put("quantity", 5);
        products.add(product2);
        
        Map<String, Double> result = calculateTotalPrices(products);
        System.out.println(result);
    }
}
