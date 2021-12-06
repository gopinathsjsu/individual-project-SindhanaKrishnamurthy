import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CreditCard {
	
	private static ArrayList<String> existingCreditCards = new ArrayList<String>();
	
	private static CreditCard creditcardInstance = null;
	  

	    // Constructor
	    // Here we will be creating private constructor
	    // restricted to this class itself
	private CreditCard() {
		existingCreditCards = addCards();
	}
	
	public static CreditCard getInstance()
	{
	        if (creditcardInstance == null)
	        	creditcardInstance = new CreditCard();
	 
	        return creditcardInstance;
	}

	  

	private ArrayList<String> addCards() {
		  existingCreditCards.add("5023 4512 7612 9087");
		  existingCreditCards.add("1234 5678 9101 4519");
		
		return existingCreditCards;
	}
	
	public static void checkAndAddCards(String newCard) {
		
		      if(existingCreditCards.contains(newCard)) {
		    	  System.out.println("Card is already present in DB  : " + newCard);
		    	   
		      }
		      else {
		    	  existingCreditCards.add(newCard);
		    	  System.out.println("New Card doesnt exist in DB, adding now");
		    }
		      
		   displayExistingCreditCards();
	}
	
	private static void displayExistingCreditCards() {
		System.out.println("********* Printing all credit cards *********");
		for ( String cards: existingCreditCards)
	        System.out.println(cards);
		
	}
	
	
	public static void makePayment(String cardNumber) {
		// TODO Auto-generated method stub
		CreditCard.getInstance();
		checkAndAddCards(cardNumber);
		System.out.println("Payment Successful");
		
	}
	
	
	
	 
	    

}
