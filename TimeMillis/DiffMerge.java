package TimeMillis;

public class DiffMerge {
	public static void personalMS(int[] arr, int Left, int Right)
	{
		int midPoint = 0;
		if(Left < Right)
		{
			midPoint = (Left + Right) / 2;
			personalMS(arr, Left, midPoint);
			personalMS(arr, midPoint + 1, Right);
			
			int[] sortedArr = new int[arr.length];
			merge(arr, sortedArr, Left, midPoint, Right);
		}
	}
	
	public static void merge(int[] arr, int[] result, int Left, int midPoint, int Right)
	{
		int moveLeft = Left;
		int moveRight = midPoint + 1;
		int count = 0;
		
		while(moveLeft <= midPoint && moveRight <= Right)
		{
			if(result[moveLeft] <= arr[moveRight])
			{
				result[count] = arr[moveLeft];
				moveRight++;
			}
			else
			{
				result[count] = arr[moveRight];
				moveRight++;
			}
			count++;
		}
		
		for(int i = 0; i < Right - Left + 1; i++)
		{
			arr[Left + i] = result[i];
		}
		
		if(moveLeft <= midPoint && moveRight > Right)
		{
			result[count] = arr[moveLeft];
			moveLeft++;
			count++;
			
		if(moveLeft > midPoint && moveRight <= Right)
		{
			result[count] = arr[moveRight];
			moveRight++;
			count++;
		}
		}
	}
}