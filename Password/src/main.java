import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
		
public class main {

//Must Contain atleast vowel
	
	public static boolean condition1(String str)
	 {
	 for (char c : str.toCharArray()) {
	 if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
	 return true;
	 }
	 return false;
	 }
//Three Consecutive consonents or three consecutive vowels
	
	public static boolean condition2(String str) {
		 int vowels = 0;// consec vowels
		 int consonents = 0;// consec consonants
		 boolean prevcharisvowel = true;
		 for (char c : str.toCharArray()) {
		 
			 if ((c)=='a'||(c)=='e'||(c)=='i'||(c)=='o'||(c)=='u') 
			 	{
				 	if (prevcharisvowel) // and the prev char was a vowel too
				 		vowels = vowels+1; // then increment
				 	else // else this was the first vowel
				 	{
				 		vowels = 1;
				 		prevcharisvowel = true;
				 	}
			 	} 
			else// if consonant
				{
				if (prevcharisvowel)// and prev char was vowel
					{
					    consonents = 1; // this is the first consonant
						prevcharisvowel = false;
					} 
				else
					// else increment consecutive consonant count
					consonents++;
				}
		 
		 if (vowels == 3 || consonents == 3)
		 return true;
		 }
		 return false;
		 }
	
//Consecutive occurrences of same letter except "ee" or "oo"
	public static boolean condition3(String str) {
		 char prev;
		 char next;
		 if (str.length() < 2)
		 return false;
		 for (int i = 0; i < str.length() - 1; i++) {
		 prev = str.charAt(i);
		 next = str.charAt(i + 1);
		
		 if (prev == next && !exceptionRule(prev, next))
		 return true;
		 }
		 return false;
		 }
		 
		 private static boolean exceptionRule(char prev, char next) {
		 StringBuffer s = new StringBuffer();
		 s.append(prev);
		 s.append(next);
		 
		 if (s.toString().equals("ee") || s.toString().equals("oo"))
		 return true;
		 return false;
		 }
		 
	public static void main(String[] args) throws FileNotFoundException , IOException {
		// TODO Auto-generated method stub

	 			File dir = new File(".");
	 			try{	 	
	 				//Open file to read and write
		
				File fin = new File("/Users/RishabhSanghvi/Documents/workspace/Password/say.in.txt");
				FileInputStream fis = new FileInputStream(fin);
				BufferedReader in = new BufferedReader(new InputStreamReader(fis));
				
				FileWriter fstream = new FileWriter("/Users/RishabhSanghvi/Documents/workspace/Password/say.out.txt", false); //Always clear the content of the file
				BufferedWriter out = new BufferedWriter(fstream);
				
				String readline = null;
				
				while ((readline = in.readLine()) != null){
						
					//demark end of file
					if(readline.equals("end"))
						break;
					else{
						
						if(condition1(readline) && !condition2(readline) && !condition3(readline) )
							 readline= "<" + readline + ">" + "is acceptable\n";
							else
							 readline= "<" + readline + ">" + "is not acceptable\n";
						
						
						
						
										
						//Process each line and add output to Dest.txt file
						out.write(readline);
						out.newLine();
						
					}
					}
				// do not forget to close the buffer reader
				in.close();
		 
				// close buffer writer
				out.close();
	
	 			} catch (FileNotFoundException e){
	 				System.out.println("No Such File Exists!!!");
	 				}	 
	 	} 
}