package com.programming.algo.arrays;

public class MergeTwoSortedArrays {

	public int [] merge( int [] n1, int [] n2)
	{
		int length1 = n1.length;
		int length2=n2.length;
		
		int [] newArr = new int[length1+length2];
		int i =0,j=0,k=0;
		
		while(i<length1 && j<length2) {
			
			if(n1[i] <= n2[j])
			{
				
				newArr[k++]=n1[i++];
			}else {
				
				newArr[k++]=n2[j++];
			}
		}
		
		while(i<length1) {
			
			newArr[k++]=n1[i++];
		}
		
      while(j<length1) {
			
			newArr[k++]=n2[j++];
		}
		
		
      return newArr;
	}
	
public void printArr(int [] arr) {
		
		for(int i : arr)
			System.out.print(i+" ");
	}

public static void main (String [] args) {
	
	
	int arr1 [] = { 6,11,12,19,23};
	
	int arr2 [] = { 5,8,14,16,21};
	
	MergeTwoSortedArrays ma = new MergeTwoSortedArrays();
	int [] finalArr = ma.merge(arr1, arr2);
	
	ma.printArr(finalArr);
	
}
}
