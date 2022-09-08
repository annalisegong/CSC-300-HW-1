package net.codejava;

public class Salesman 
{
	private String name;
	public float totalSales;
	
	//constructor
	public Salesman(String name, float totalSales)
	{
		this.name = name;
		this.totalSales = totalSales;
	}
	
	public static Salesman[] orderSales(Salesman[] sales)
	{
		Salesman temp = new Salesman("empty", -1);
		for(int a = 0; a < sales.length; a++)
		{
			for(int b = 0; b < sales.length - a -1; b++)
			{
				if(sales[b].totalSales < sales[b+1].totalSales) 
				{
					temp = sales[b];
					sales[b] = sales[b+1];
					sales[b+1] = temp;
				}
			}
		}
		return sales;
	}
	
	public static void getTopFive(Salesman[] sales)
	{
		Salesman topFive[] = new Salesman[5];
		for(int i = 0; i < 5; i++)
		{
			topFive[i] = sales[i];
			System.out.println(topFive[i]);
		}
	}
	
	@Override
	public String toString()
	{
		return this.name + " - total sales: $" + this.totalSales;
	}
}
