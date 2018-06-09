package assignment4;

public class Sortarray {
	public static void sort()
	{
	int i;
	int arr[]= {1,1,1,1,0,0,1,0};
	int low = 0;
	int high = arr.length - 1;
	int l=high;
	while(low < high) {
		while(arr[low] == 0 && low < high)
			low ++;
		while(arr[high] == 1 && low < high)
			high--;
		if(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low ++;
			high--;
		}
	}
	for(i=0;i<l;i++)
	{
		System.out.println(arr[i]);
	}

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sort();
	}

}
