package Lab3StringsAndParsing;

import java.util.*;
import java.io.*;



class FileReader{
	
	public void displayFileData(String path) throws IOException {
		File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int LineCount = 0;
  
        while ((line = br.readLine()) != null) {
            if (line.equals("")) {
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                String sentence[] = line.split("[!?.:]+");
                LineCount += sentence.length;
            }
        }
        if (LineCount >= 1) {
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of Lines = "+ LineCount);
        System.out.println("Total number of characters = "+ characterCount);
	}
}

public class Excersice_5 {
    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in);   //      "C:\\Users\\DIRALA\\OneDrive - Capgemini\\Desktop\\Excer5.txt"
    	System.out.print("Enter the file path : ");
    	String path = sc.nextLine();
    	FileReader fr = new FileReader();
    	fr.displayFileData(path);
    }
}
/*Output
 * Enter the file path : C:\\Users\\DIRALA\\OneDrive - Capgemini\\Desktop\\Excer5.txt
Total word count = 5
Total number of Lines = 3
Total number of characters = 27
*/
