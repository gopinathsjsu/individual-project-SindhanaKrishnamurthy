
public interface CartItemElement {
	
	public boolean checkPermissable(ShoppingCart cart);
	String getItemCategory(ShoppingCart cartItem);
	double calculateCost(ShoppingCart cartItem);
	//String getCardNumbervalue(ShoppingCart cartItem);


}
