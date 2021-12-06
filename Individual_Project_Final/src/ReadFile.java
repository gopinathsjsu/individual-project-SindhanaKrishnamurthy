import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile {
	
	public String filePath;
	
	public ReadFile(String filePath) {
		// TODO Auto-generated constructor stub
		this.filePath = filePath;
	}
	
	//Reading the file for shopping cart Items
	
	public static String readCard(String filePath) {
		
		
		
        Path pathToFile = Paths.get(filePath);
        
        String[] attributes;
        String cardnumberString = null;
        
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {         
        	 
        	String line = br.readLine();
        	 while ((line = br.readLine()) != null) {
            if (!line.isEmpty()) {	
                attributes = line.split(",");      
                cardnumberString = attributes[2];
                //System.out.println("Card Number read is"+cardnumberString);
                //REading only last line of file so break;
                break;
            	}
        	 }
                   
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        return cardnumberString;
		
	}
	
	//Reading only last line of file to get Card Number

	public static ArrayList<CartItem>  readFile(String filePath) {
	
	ArrayList<CartItem> items = new ArrayList<>();
	
    Path pathToFile = Paths.get(filePath);
    String line;
    String[] attributes;
    
    try (BufferedReader br = Files.newBufferedReader(pathToFile,
            StandardCharsets.US_ASCII)) {         
    	 
    	br.readLine();
       
        while ( (line = br.readLine()) != null) { 
        	
        	 if (!line.isEmpty()) {
        		 
            attributes = line.split(",");
            CartItem item = createItem(attributes);
            items.add(item);
           
        	}
            
        }
        
    } catch (IOException ioe) {
        ioe.printStackTrace();
    }
    
    return items;
	
}
	



private static CartItem createItem(String[] metadata) {
    String itemName = metadata[0];
    int quantity = Integer.parseInt(metadata[1]);
    String cardNumber = metadata[2];
    return new CartItem(itemName, quantity,cardNumber);
}

}