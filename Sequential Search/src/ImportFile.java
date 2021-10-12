import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImportFile
	{

		public static void exploreFile() throws IOException
			{
				Scanner myFile = new Scanner(new File("FindLetterV.txt"));
				
				while (myFile.hasNext())
					{
						String words = myFile.nextLine();
					}

			}

	}
