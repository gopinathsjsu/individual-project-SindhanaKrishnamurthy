import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFiles {
	

	
	public static void writeErrorFile(ArrayList<String> arrayList,ArrayList<String> capOverFlowItems) {
	  try {
	      FileWriter myWriter = new FileWriter("error.txt");
	      myWriter.write("Please correct the quantities!!!");
	      myWriter.write("\n******************************");
	      myWriter.write("\n");
	      if(!arrayList.isEmpty()) {
	      myWriter.write("\n Item & quantity that exceeds available quantity in inventory :\n ");	     
	      myWriter.write(arrayList.toString());
	      myWriter.write("\n******************************");
	    
	      }
	      myWriter.write("\n");
	      if(!capOverFlowItems.isEmpty()) {
	      myWriter.write("\n Category Cap Reached!! Extra Items in Cart : ");
	      myWriter.write(capOverFlowItems.toString());
	      }
	      myWriter.close();
	      System.out.println("File write successful");
	    } catch (IOException e) {
	      System.out.println("An error occurred while writing file.");
	      e.printStackTrace();
	    }
	}
	
	
	public static void writeOutputCost(double final_cost) {
		  try {
		      FileWriter myWriter = new FileWriter("output.csv");
		      myWriter.write("Total cost \n");
		      myWriter.write(String.valueOf(final_cost));
		      myWriter.close();
		      System.out.println("File write successful");
		    } catch (IOException e) {
		      System.out.println("An error occurred while writing file.");
		      e.printStackTrace();
		    }
		}
	  

}
