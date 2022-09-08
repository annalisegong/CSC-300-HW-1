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
								
		/*tests that sales stores info correctly test proved correct store and display of info
		for(int i = 0; i < 10; i++)
		{
			System.out.println(sales[i]);
		}*/
		
		//calls Salesman class to use the getTopFive method from the sales[]
		Salesman.orderSales(sales);
		
		//displays the 5 salesmen with the top totalSales
		System.out.println("The top five salesmen are: ");
		Salesman.getTopFive(sales);
	}
}