package assignment4;
import java.util.Scanner;
public class Searchingelement {
	
	public static void search(int arr[], int first, int last, int x){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < x ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == x){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }
		      else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found"+x);  
		   }  
		 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,6,7,8,9,10};
		int l=arr.length-1;
         Scanner s1= new Scanner(System.in);
         int no=s1.nextInt();
         search(arr,0,l,no);
}
	}
