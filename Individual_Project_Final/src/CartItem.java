
public class CartItem implements CartItemElement{
	
	private String itemName;
	private int Quantity;
	private String cardNumber;
	
	public CartItem(String itemName, int Quantity, String cardNumber){
		this.itemName = itemName;
		this.Quantity=Quantity;
		this.cardNumber = cardNumber;
		
	
	}
	
	public String getName() {
		return this.itemName;
	}
	
	
	public int getQuantity() {
		return this.Quantity;
	}
	
	public String getCardNumber() {
		return this.cardNumber;
	}


	@Override
	public boolean checkPermissable(ShoppingCart cart) {
		return cart.validatePermissable(this);
	}
	
	
	@Override
	public String getItemCategory(ShoppingCart cart) {
		return cart.getItemCategory(this);
	}
	

	
	
	@Override
	public double calculateCost(ShoppingCart cart) {
		return cart.calculateCost(this);
	}

	

}
