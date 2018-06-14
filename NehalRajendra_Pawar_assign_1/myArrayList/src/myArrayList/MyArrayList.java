package myArrayList;

import java.util.Arrays;

public class MyArrayList {

	private int numberArray[] = new int[50];
	int init = 0;
	int  Size=50;
	public MyArrayList() {//constructor to assign default value 
		int j;
		
		for (j = 0; j<Size; j++) {
			numberArray[j] = -11111;
		}	
		Size=numberArray.length;
	}
	public void insertSorted(int value) {// This method should insert a new value but keep the data structure sorted in ascending order. If(value<0||value>10000)return;
		if(init>=Size){
		Size=Size+Size/2;
		int newArray[] = new int[Size];
		for (int j = 0; j<Size; j++)
			newArray[j] = -11111;
		//System.out.println("\nimplemented 1");
		for (int j = 0; j < numberArray.length; j++) 
			newArray[j] = numberArray[j];
		numberArray=newArray;
		}
		if(value>=0&&value<=10000){
		
		InsSort(value);
		//numberArray[init] = value;
		//sortArray();
		init++;
		}
	}
	public void InsSort(int value){
		for(int index=0;index<Size;index++){
			if(numberArray[index]==-11111){
				numberArray[index]=value;
				break;
			}
			if(value>numberArray[index])
				continue;
			else{		
				for(int i=init-1;i>=index;i--){
				numberArray[i+1]=numberArray[i];
				}
				numberArray[index]=value;
				break;
			}
		}
	}
	public int[] getArray(){
		return numberArray;
	}
	public void sortArray() {
		Arrays.sort(numberArray);
	}
	public String toString() {
		int index;
		String Concatenate="";
		//int count=0;
		//int PrintnumberArray[]=new int[size()];
		for (index = 0; index<Size; index++) {
			if (numberArray[index] != -11111){
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
		for (index = 0; index<Size; index++) {
			if (numberArray[index] != -11111) {
				sum += numberArray[index];
			}
		}
		return sum;
	}
	public void removeValue(int value){//This method should remove all occurences of a value
		int indexof=indexOf(value);
		for (int index = indexof; index<Size-1; index++) {
			numberArray[index]=numberArray[index+1];			
		}
		//System.out.println(toString());
		numberArray[Size-1]=-11111;
		Size--;
	}
	public int indexOf(int value){//This method should return the index of the first occurrence a value
		for (int index = 0; index<numberArray.length; index++) {
			if (numberArray[index] == value)
			return index;		
		}
	return -1;
	}
	public int size(){//This method should return the total number of values that are stored in the array list.
		int index, count=0;
		for(index=0; index<Size; index++) {
			if(numberArray[index] != -11111)
				count =count+ 1;
		}
		return count;
	}
}