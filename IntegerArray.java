package Task;

import java.util.Scanner;

public class IntegerArray {

	public static void main(String[] args) {
		int child=0;
		int adult=0;
		int senior=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("age element :");
		int a = sc.nextInt();
		int arr[]=new int[a];
		System.out.println("age of a person");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<=18)
			{
				child++;
			}
			else if(arr[j]>18 && arr[j]<=54)
			{
				adult++;
			}
			else
			{
				senior++;
			}
		}
		System.out.println("children:"+child);
		System.out.println("adults:"+adult);
		System.out.println("senior:"+senior);

	}

}
