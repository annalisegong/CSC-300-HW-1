package net.codejava;

public class HelloWorld 
{

	public static void main(String[] args)
	{
		/*for(int i = 0; i <= 4; i++)
		{
			System.out.println("Enter name of salesman: ");
			Salesman.defineSalesman(System.in());
		}
		
		//initialize all array elements with a - sales total
		for(int i = 0; i < topSales.length; i++)
		{
			topSales[i].name = "";
			topSales[i].salesTotal = -1;
		}*/
	
		int intArray[];
		intArray = new int[] {2, 3, 8, 10, 5, 7, 1, 6, 9, 4};
		int topFive[];
		topFive = new int[] {-1, -1, -1, -1, -1};
		int least = findLeast(intArray);
		//int max = findMax(intArray);
		//System.out.println("the largest value in the array list is " + max);
	}
	
	protected static int findMax(int[] array)
	{
		int tempMax = -1;
		for(int i = 0; i < array.length; i++)
		{
			if(tempMax < array[i])
			{
				tempMax = array[i];
			}
		return tempMax;
		}
	}
	
	protected static int findLeast(int[] array)
	{
		int tempFive[];
		tempFive = new int[] {-1, -1, -1, -1, -1};
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > tempFive[i])
			{
				tempFive[i] = array[i];
			}
		}
		for(int a = array.length - 1; a >= 0; a--)
		{
			if(tempFive[a] < tempFive[a-1])
			{
				tempFive[a-1] = tempFive[a];
			}
		}
		return tempFive[0];
	}
}