package net.codejava;

public class HelloWorld 
{

	public static void main(String[] args)
	{
		System.out.println("hello");
		Salesman sales[] = new Salesman[10];
		sales[0] = new Salesman("hunter", 10000);
		sales[1] = new Salesman("john", 7100);
		sales[2] = new Salesman("smith", 6300);
		sales[3] = new Salesman("jane", 9200);
		sales[4] = new Salesman("sally", 3100);
		Salesman.getTopFive(sales);
		for(int i = 0; i < 10; i++)
		{
			System.out.println(sales[i]);
		}
		System.out.println("The top five salesmen are: ");
		
		
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
	
	/*protected static int findLeast(int[] array)
	{
		int tempFive[];
		tempFive = new int[] {-1, -1, -1, -1, -1};
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > tempFive[i]) // test with displaying tempFive array
			{
				tempFive[i] = array[i];
				System.out.println(tempFive);
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
	}*/
}