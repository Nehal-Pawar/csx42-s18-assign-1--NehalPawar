package myArrayList;

import java.util.Arrays;

public class MyArrayList {

	private int numberArray[] = new int[50];
	int i = 0;
	int  arraySize;
	public MyArrayList() {//constructor to assign default value 
		int j;
		for (j = 0; j<numberArray.length; j++) {
			numberArray[j] = 11111;
		}
	}
	public void insertSorted(int value) {//insert new values one by one
		if(value<0||value>10000)return;
		numberArray[i] = value;
		i++;
	}
	public void sortArray() {
		Arrays.sort(numberArray);
	}
	public String toString() {
		int index;
		String Concatenate="";
		//int count=0;
		//int PrintnumberArray[]=new int[size()];
		for (index = 0; index<numberArray.length; index++) {
			if (numberArray[index] != 11111){
			Concatenate=Concatenate+numberArray[index] + " ";
			//System.out.print(numberArray[index] + " ");
			//PrintnumberArray[count]=numberArray[index];
			//count++;
			}
		}
		return Concatenate;
	}
	public int sum() {
		int index, sum = 0;
		for (index = 0; index<numberArray.length; index++) {
			if (numberArray[index] != 11111) {
				sum += numberArray[index];
			}
		}
		return sum;
	}
	public void removeValue(int value){
	
	}
	int indexOf(int value){
	return 0;
	}
	int size(){
		int index, count=0;
		for(index=0; index<numberArray.length; index++) {
			if(numberArray[index] != 11111)
				count += 1;
		}
		return count;
	}
}
