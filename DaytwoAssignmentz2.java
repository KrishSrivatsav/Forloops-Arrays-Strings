package week1.day2;

import java.util.Iterator;

public class DaytwoAssignmentz2 {

	public static void main(String[] args) {
		// 1.) missing element in an array..
			int[] arr = {1,2,3,4,7,6,8};
			int arr1 =	Arrays.sort(arr);
			
			for (int i = 0; i<=arr.length;i++)
			{
//				System.out.println(i);
				if (i!=arr[i])
				{
					System.out.println(i);
					break;
				}
			}
			
			// 2) PrintDuplicatesInArray..

			int[] dupArr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			
			int length = dupArr.length;
			System.out.println(length);
			int count = 0;
			for(int j =0; j<length-1; j++)
			{
				
				for(int z=0; z<length+1; z++ )
				{
					if(dupArr[j] == dupArr[z])
					{
						count = count+1;
						if(count>=1) {
							
							System.out.println(dupArr[z]);
							}
					}
				}
			}
		
	}
	

}
