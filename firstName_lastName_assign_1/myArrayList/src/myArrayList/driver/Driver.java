package myArrayList.driver;
import myArrayList.util.FileProcessor;
public class Driver 
{

	public static void main(String[] args) 
	{
	    // command line validation is missing here. FIXME!
	    if(2!=args.length)
		{
		    System.err.println("incorrect args passed, Expected <input.txt> <output.txt>. \n exiting \n");
		    System.exit(0);		    
		}
	    String INPUTFILE= args[0];
	    String OUTPUTFILE= args[1];

	    FileProcessor F1 = new FileProcessor();
	    F1.openFile(INPUTFILE);
		String line = "";
			while (line != null) {

				line = F1.readLine();
				 System.out.println(line);
			}
	    System.out.println("Hello World: design pattern  " + INPUTFILE + ", " + OUTPUTFILE  );
	}
	
}
