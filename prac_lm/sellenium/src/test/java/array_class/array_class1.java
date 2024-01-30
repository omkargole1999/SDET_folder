package array_class;

import java.util.Arrays;

public class array_class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[];
    arr = new int[5];
    arr[0] = 4;
    arr[1] = 5;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr.length);
    int arr1[] = {6,8,2,4,5};
    int twodim[][]= new int[6][10];
    System.out.println("2d array length = "+twodim.length);
    String arr2[][] = new String[2][2];
    arr2[0][0] = "apple1";
    arr2[0][1] = "apple2";
   
    arr2[1][0] = "apple4";
   arr2[1][1] = "apple5";
   System.out.println(arr2[0][1]);
   Arrays.sort(arr1);
   for(int val : arr1)
   {
	   System.out.println("val = "+val);
   }
    for(int i = 0;i < arr1.length;i++)
    {
    	System.out.println("for loop : "+arr1[i]);
    }
    
    
	}
}