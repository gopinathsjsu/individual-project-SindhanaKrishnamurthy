import java.util.ArrayList;

public interface ShoppingCart {

	
	boolean validatePermissable(CartItem cartItem);
	String getItemCategory(CartItem cartItem);
	double calculateCost(CartItem cartItem);

}
