import java.util.Arrays;

public class Bubblesort { 

	public static void main(String[] args)
		{
		int arr[] = {6,0,7,2,8,4};
		for(int round=0; round<arr.length-1; round++)
		{
		for(int index=0; index<arr.length-1-round; index++)
		{
		if(arr[index] > arr[index+1])
		{
		int temp = arr[index];
		arr[index] = arr[index+1];
		arr[index+1] = temp;
		}
		}
		}
		System.out.println(Arrays.toString(arr));

	}

}