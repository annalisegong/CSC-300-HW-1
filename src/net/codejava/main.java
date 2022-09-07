package net.codejava;

public class main 
{

	public static void main(String[] args)
	{
		//creates array names sales that holds name of salesman and their total sales
		Salesman sales[] = new Salesman[10]; 
		//assigns array memory locations with info on 10 salesmen
		sales[0] = new Salesman("hunter", 10000);
		sales[1] = new Salesman("john", 7100);
		sales[2] = new Salesman("smith", 6300);
		sales[3] = new Salesman("jane", 9200);
		sales[4] = new Salesman("sally", 3100);
		sales[5] = new Salesman("maya", 2092);
		sales[6] = new Salesman("brian", 8209);
		sales[7] = new Salesman("jill", 6782);
		sales[8] = new Salesman("molly", 9832);
		sales[9] = new Salesman("ryan", 3794);
		
		//tests that sales stores info correctly
		for(int i = 0; i < 10; i++)
		{
			System.out.println(sales[i]);
		}
		
		//calls Salesman class to use the getTopFiveMethod from the sales[]
		Salesman.getTopFive(sales);
		
		//displays the 5 salesmen with the top totalsales
		//System.out.println("The top five salesmen are: ");
	}
	
	/*protected static int findMax(int[] array)
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