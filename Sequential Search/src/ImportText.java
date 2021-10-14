import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ImportText
	{

		public static void main(String[] args) throws IOException
			{
				importDis();
				
			}
		
		public static void importDis() throws IOException
		{
			
			Scanner myFile = new Scanner(new File("FindLetterV.txt"));
			
			while(myFile.hasNext())
				{
					String letter = myFile.nextLine();
					System.out.println(letter);
					
					String wantL = "v";
					
			
				
				}
			
			
		}
		
		
	}
