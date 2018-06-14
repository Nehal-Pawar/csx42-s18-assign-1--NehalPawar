package myArrayList.driver;
import myArrayList.util.FileProcessor;
import myArrayList.util.Results;
import myArrayList.MyArrayList;
import myArrayList.test.MyArrayListTest;
public class Driver
{
	public static void main(String[] args)
	{
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


		int A = Obj1.sum();		
		Results results = new Results();
		results.storeNewResult("The sum of all the values in the array list is:"+A);
		MyArrayListTest myArrayListTest = new MyArrayListTest();
		myArrayListTest.testMe(Obj1 , results);
		
		results.writeToFile(OUTPUTFILE);
	}
}