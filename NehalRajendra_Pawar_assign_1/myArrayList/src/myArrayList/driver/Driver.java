package myArrayList.driver;
import myArrayList.util.FileProcessor;
import myArrayList.MyArrayList;
public class Driver
{
	public static void main(String[] args)
	{
		// command line validation is missing here. FIXME!
		if (2 != args.length)
		{
			System.err.println("incorrect args passed, Expected <input.txt> <output.txt>. \n exiting \n");
			System.exit(0);
		}
		String INPUTFILE = args[0];
		String OUTPUTFILE = args[1];
		MyArrayList Obj1 = new MyArrayList();
		FileProcessor F1 = new FileProcessor();
		F1.openFile(INPUTFILE);
		String number = "";
		while (number != null) {
			number = F1.readLine();
			if(number == null)break;
			if(!number.matches("\\d+"))continue;
			
			Obj1.insertSorted(Integer.parseInt(number));
		}
		Obj1.sortArray();
		int A = Obj1.sum();
		System.out.println("\nsum is : " + A);
		System.out.println(Obj1.toString());
	}
}