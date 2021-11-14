package Lab3StringsAndParsing;

import java.util.*;

class MirrorImage{
	
	public String getImage(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		sb1.append("|");  
		StringBuffer sb2 = new StringBuffer(str);
		sb2.reverse();
		sb1.append(sb2);
		return sb1.toString();
	}
}

public class Excersice_2 {

	public static void main(String[] args) {
		
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the String value : ");
		str = input.nextLine();
		MirrorImage mi = new MirrorImage();
		
		System.out.println("User Entered String is  : "+str);
		System.out.println("Mirror Imaged String is : "+mi.getImage(str));
	}

}
/* Output
 * Enter the String value : EARTH
   User Entered String is  : EARTH
   Mirror Imaged String is : EARTH|HTRAE

 * 
 */
