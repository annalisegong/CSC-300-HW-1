package net.codejava;

public class Salesman 
{
	private String name;
	public float totalSales;
	
	public Salesman(String name, float totalSales) // constructor
	{
		this.name = name;
		this.totalSales = totalSales;
	}
	
	public static Salesman[] getTopFive(Salesman[] sales)
	{
		Salesman topFive[] = new Salesman[5];
		for(int i = 0; i < sales.length; i++)
		{
			int counter = 0;
			while(topFive[counter] == null || topFive[counter].totalSales < sales[i].totalSales)
			{
				if(counter == 0)
				{
					topFive[counter] = sales[i];
				}
				else
				{
					Salesman temp = null;
					topFive[counter] = temp;
					topFive[counter] = sales[i];
					topFive[counter - 1] = temp;
				}
				counter++;
			}
		}
		return topFive;
	}
	
	@override
	public String toString()
	{
		return "Salesman: " + this.name + " has a yearly total sale of $" + this.totalSales;
	}
}
