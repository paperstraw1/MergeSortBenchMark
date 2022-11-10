package TimeMillis;
import java.util.Random;

public class TimeMillis {
	public static void main(String[] args) 
	{
		long Left;
		long Right;
		
		Random num = new Random();
		int[] arr = new int[10000];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = num.nextInt(10000);
		}
		
		
		Left = System.currentTimeMillis();
		MergeSort.merge(arr, 0, 9999);
		
		Right = System.currentTimeMillis();
		System.out.println("My Merge Sort: " + (Right - Left) + " swaps");
		
		
		Left = System.currentTimeMillis();
		MergeSort.merge(arr, 0, 9999);
		
		Right = System.currentTimeMillis();
		System.out.println("Default Merge Sort: " + (Right - Left) + " swaps");
	}
}