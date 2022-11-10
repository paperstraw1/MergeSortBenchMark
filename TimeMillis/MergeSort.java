package TimeMillis;

public class MergeSort {
	public static void process(int[] arr, int start, int midPoint, int end)
	{	
		int[] result = new int[arr.length];
		int moveLeft = start;
		int moveRight = midPoint + 1;
		int count = 0;
		
		if(moveLeft > midPoint && moveRight <= end)
		{
			result[count] = arr[moveRight];
			moveRight++;
			count++;
		}
		
		if(moveLeft <= midPoint && moveRight > end)
		{
			result[count] = arr[moveLeft];
			moveLeft++;
			count++;
		}
		
		while(moveLeft <= midPoint && moveRight <= end)
		{
			if(result[moveLeft] <= arr[moveRight])
			{
				result[count] = arr[moveLeft];
				moveLeft++;
			}
			else
			{
				result[count] = arr[moveRight];
				moveRight++;
			}
			
			count++;
		
		}
		
		for(int i = 0; i < end - start + 1; i++)
		{
			arr[start + i] = result[i];
		}
	}
	
	public static void merge(int[] arr, int Left, int Right)
	{
		int midPoint = 0;
		if(Left < Right)
		{
			//partitions the array
			midPoint = (Left + Right) / 2;
			
			merge(arr, Left, midPoint);
			merge(arr, midPoint + 1, Right);
			
			//puts the split array back together
			process(arr, Left, midPoint, Right);
		}
	}
}