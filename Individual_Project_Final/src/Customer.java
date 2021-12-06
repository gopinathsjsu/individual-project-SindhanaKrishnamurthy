
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Customer {
	


	public static void main(String[] args) {
		
		//Reading from file
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		System.out.flush();
		String filename = scanner.nextLine();
		
		File file = new File(filename);
		String absolute_filePath = file.getAbsolutePath();
		
		ArrayList<CartItem> items = ReadFile.readFile(absolute_filePath);

        String cardNumber = ReadFile.readCard(absolute_filePath);
        
		//System.out.println("Card Number is :" +cardNumber);
		
		ShoppingCartValidation shoppingCartValidation = new  ShoppingCartValidation();
		System.out.println("Validating cart items against available items: ");
		System.out.println("************************************************");
		boolean cartPermissible = shoppingCartValidation.checkIfCartItemIsPermissable(items);
		boolean capHitFlag = shoppingCartValidation.checkIfCapLimit(items);
		boolean cartValid = false;
		
		
		ArrayList<String>  capOverFlowItems = new ArrayList<String>();
		double final_cost = 0;
		
		if (!cartPermissible || capHitFlag) {
			System.out.println("Cart is Invalid");
			capOverFlowItems.addAll(shoppingCartValidation.getinvalidEssentialItem());
			capOverFlowItems.addAll(shoppingCartValidation.getinvalidLuxuryItem());
			capOverFlowItems.addAll(shoppingCartValidation.getinvalidMiscItem());
			
			WriteFiles.writeErrorFile(shoppingCartValidation.getInvalidPermissableItem(),capOverFlowItems);
		} 
		else {
			System.out.println("Cap Check succesffuly,cart is valid. ");
			System.out.println("***********************************");
			cartValid = true;
			final_cost = shoppingCartValidation.getTotalCost();
			System.out.println ("Total Cost = "+final_cost);
		}
	
	
		if (cartValid)
		{
			System.out.println("***********************************");
			CreditCard.makePayment(cardNumber);
			System.out.println("***********************************");
			WriteFiles.writeOutputCost(final_cost);
	
		}
		
		
	}	
		
	}
	
	
