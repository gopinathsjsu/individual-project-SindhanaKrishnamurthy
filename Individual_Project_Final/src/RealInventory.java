import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class RealInventory {
	
	public static final Map<String,Item> MasterInventory = createInventory();
	
	private static Map<String, Item>createInventory() {
		
		//System.out.println("Coming here");
		
		final Map<String, Item> masterInventory = new HashMap<>();
	
		//-------------Essentials------------------------
		// row 1
		Item i = new Item("Milk","Essential", 6, 4.72);
		masterInventory.put("Milk", i);
		// row 2
		i=new Item("Bread", "Essential", 8 , 2.98);
		masterInventory.put("Bread", i);
		// row 3
		i=new Item("Oil", "Essential", 2 ,8.5);
		masterInventory.put("Oil", i);
		// row 4
		i=new Item("Cotton", "Essential", 4 , 11.2);
		masterInventory.put("Cotton", i);
		// row 5
		i=new Item("Apples", "Essential", 8 , 1);
		masterInventory.put("Apples", i);
		
		//-------------Luxury------------------------
		// row 6
		i=new Item("Chocolates", "Luxury", 12 , 3);
		masterInventory.put("Chocolates", i);
		// row 7
		i=new Item("Honey", "Luxury", 4 , 4.2);
		masterInventory.put("Honey", i);
		// row 8
		i=new Item("Cereal", "Luxury", 6 , 6.34);
		masterInventory.put("Cereal", i);
		// row 9
		i=new Item("Soap", "Luxury", 5 , 5);
		masterInventory.put("Soap", i);
		// row 10
		i=new Item("Detergent", "Luxury", 8 , 3);
		masterInventory.put("Detergent", i);
		// row 11
		i=new Item("Paint", "Luxury", 5 , 7);
		masterInventory.put("Paint", i);
		
		//-------------Misc------------------------
		// row 12
		i=new Item("Pillow", "Misc", 10 , 6.76);
		masterInventory.put("Pillow", i);
		// row 13
		i=new Item("Sheets", "Misc", 13 , 11.43);
		masterInventory.put("Sheets", i);
		// row 14
		i=new Item("Blanket", "Misc", 12 , 45.5);
		masterInventory.put("Blanket", i);
		// row 15
		i=new Item("Television", "Misc", 5 , 1100.54);
		masterInventory.put("Television", i);
		// row 16
		i=new Item("Map", "Misc", 2 , 2.92);
		masterInventory.put("Map", i);
		
		return masterInventory;
	}

    
	

}
