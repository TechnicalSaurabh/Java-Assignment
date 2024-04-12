package Saurabh;
public class Main {
	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();

	        cart.addProduct(new Product("Apple", 0.99));
	        cart.addProduct(new Product("Banana", 0.59));
	        cart.addProduct(new Product("Orange", 0.79));
	        cart.addProduct(new Product("Pendrive", 0.80));

	        System.out.println("Total Cost: $" + cart.calculateTotalCost());
	        cart.displayCartContents();
	    }

}
