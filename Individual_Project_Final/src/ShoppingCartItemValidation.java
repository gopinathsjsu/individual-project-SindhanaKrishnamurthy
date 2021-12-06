import java.util.ArrayList;
import java.util.Map;

public class ShoppingCartItemValidation implements ShoppingCart{
	
	

	@Override
	public boolean validatePermissable(CartItem cartItem) {
		
		//System.out.println("Inside CartPermissable" + cartItem.getName());
		
		//checking for permissable (availbility)
		Map<String,Item> localInventory= RealInventory.MasterInventory;
		Item item = localInventory.get(cartItem.getName());
		
		System.out.println("Available Quantity for " + cartItem.getName() +" is " +item.getAvailableQuantity());
		System.out.println("Cart Quantity for " + cartItem.getName() +" is " +cartItem.getQuantity());
		if (cartItem.getQuantity()>item.getAvailableQuantity()) {
			
			return false;
		}
		
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String getItemCategory(CartItem cartItem) {
		//System.out.println("Inside getItemCategory" + cartItem.getName());
		Map<String,Item> localInventory= RealInventory.MasterInventory;
		Item item = localInventory.get(cartItem.getName());
		return item.getCategory();
		
	}

	@Override
	public double calculateCost(CartItem cartItem) {
		// TODO Auto-generated method stub
		
		//System.out.println("Inside calculateCost" + cartItem.getName());
		
		//calculatingCost
		Map<String,Item> localInventory= RealInventory.MasterInventory;
		Item item = localInventory.get(cartItem.getName());
		double cost = item.getCost() * cartItem.getQuantity();
		return cost;
	}
	
	

	

	
	
	


	


	
}
