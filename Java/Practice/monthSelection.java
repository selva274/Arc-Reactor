package selvaz;
import java.util.Scanner;//header folder
public class selvaz {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	//title part
	System.out.println("------------------------------------------------------------------------------------------------------------");
	System.out.println("\t\t\t\t***Month Selection***");
	//it is a question rise part
	int doyouknowint;
	System.out.println("\n\n###Do You Know Month?: \n\tyes->(1) no->(2)");
	doyouknowint=scanner.nextInt();
	//it is getting the input as a month from the user
	if(doyouknowint==1) {
		System.out.println("Enter the month:");
		String monthString;
		monthString=scanner.next();
		switch(monthString) {
		case "Janaury":
			System.out.println("You are Selected Janaury");
			System.out.println("---Pongal Month---");
			break;
	    case "Febraury":
			System.out.println("You are Selected Febraury");
			System.out.println("Love Month");
			break;
	    case "March":
			System.out.println("You are Selected March");
			System.out.println("--- Hate Month---"); 
			break;
	    case "April":
			System.out.println("You are Selected April");
			System.out.println("---Feel Month---");
			break;
	    case "May":
	    	System.out.println("You are Selected May");
	    	System.out.println("---Workers Month---");
	    	break;
	    case "June":
	    	System.out.println("You are Selected June");
	    	System.out.println("---Better Month---");
	    	break;
	    case "July":
	    	System.out.println("You are Selected July");
	    	System.out.println("---July Month---");
	    	break;
	    case "August": 
	    	System.out.println("You are Selected August");
	    	System.out.println("---Independent Month---");
	    	break;
	    case "September":
	    	System.out.println("You are Selected September");
	    	System.out.println("---Cool Month---");
	    	break;
	    case "October": 
	    	System.out.println("You are Selected October");
	    	System.out.println("---Joy Month---");
	    	break;
	    case "November": 
	    	System.out.println("You are Selected November");
	    	System.out.println("---Rainy Month---");
	    	break;
	    case "December": 
	    	System.out.println("You are Selected December");
	    	System.out.println("---Winter Month---");
	    	break; 
	    default:
	    	System.out.println("Enter Correct Spelling"); 
	    	}
		}
	else { 
		System.out.println("\tGo to LKG :)");
	}
   scanner.close();
}
}
