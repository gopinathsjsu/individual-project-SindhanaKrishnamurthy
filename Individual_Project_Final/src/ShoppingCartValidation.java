import java.util.ArrayList;

public class ShoppingCartValidation {
	
	
	private ArrayList<String>  invalidPermissableItem = new ArrayList<String>();
	private ArrayList<String> invalidEssentialItem = new ArrayList<String>();
	private ArrayList<String> invalidLuxuryItem = new ArrayList<String>();
	private ArrayList<String> invalidMiscItem = new ArrayList<String>();
	private static int essentialCap = 5;
	private static int luxuryCap = 3;
	private static int miscCap = 6;
	
	private static double totalCost;
	
	public ShoppingCartValidation(){
		
	}
	public double getTotalCost() {
		return totalCost;
	}
	public ArrayList<String>  getInvalidPermissableItem(){
		return invalidPermissableItem;
	}
	
	public ArrayList<String> getinvalidEssentialItem() {
		return invalidEssentialItem;
	}
	
	public ArrayList<String> getinvalidLuxuryItem() {
		return invalidLuxuryItem;
	}
	
	public ArrayList<String> getinvalidMiscItem() {
		return invalidMiscItem;
	}
	
	
	public boolean checkIfCartItemIsPermissable(ArrayList<CartItem> cart) {
		boolean permissableFlag=true;
		ShoppingCart shoppingCart = new ShoppingCartItemValidation();
		
		String tempString = null;
		
		for(CartItem cartItem : cart){
			
			
			//checking if item is permissable based on item quantity 
			if (!cartItem.checkPermissable(shoppingCart)) {
				permissableFlag=false;
				tempString = cartItem.getName().concat(" : ").concat(Integer.toString(cartItem.getQuantity()));
				invalidPermissableItem.add(tempString);
				
			}
		
		}
		
		return permissableFlag;
	}
	
	
	
	public boolean checkIfCapLimit(ArrayList<CartItem> cart) {
		boolean capHitFlag=false;
		int essentialsCount=0;
		int luxuryCount=0;
		int miscCount=0;
		ShoppingCart shoppingCart = new ShoppingCartItemValidation();
		
		
		
		for(CartItem cartItem : cart){
			//checking if category cap hit happens
			String tempCategory =cartItem.getItemCategory(shoppingCart);
			if (tempCategory.equals("Essential")) {
				essentialsCount += cartItem.getQuantity();
				if (essentialsCount > essentialCap ) {
					capHitFlag=true;
					invalidEssentialItem.add(tempCategory +" : " .concat(cartItem.getName()).concat(" : ").concat(Integer.toString(cartItem.getQuantity())));
				}
			
			}
			else if (tempCategory.equals("Luxury")) {
				luxuryCount += cartItem.getQuantity();
				if (luxuryCount > luxuryCap ) {
					capHitFlag=true;
					invalidLuxuryItem.add(tempCategory +" : " .concat(cartItem.getName()).concat(" : ").concat(Integer.toString(cartItem.getQuantity())));
				}
			}
			else if (tempCategory.equals("Misc")) {
				miscCount += cartItem.getQuantity();
				if (miscCount > miscCap ) {
					capHitFlag=true;
					invalidMiscItem.add(tempCategory +" : " .concat(cartItem.getName()).concat(" : ").concat(Integer.toString(cartItem.getQuantity())));
				}
			}
			
			totalCost = totalCost + cartItem.calculateCost(shoppingCart);
		
		}
		
		
		return capHitFlag;
	}
	
	
}

