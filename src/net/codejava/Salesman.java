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
	
	//array of salesmen passed in sales from main
	public static Salesman[] getTopFive(Salesman[] sales)
	{
		//defining new array to hold top 5 salesmen = name & totalSales
		Salesman topFive[] = new Salesman[5];
		//goes through the 10 salesmen from sales array
		int count = 0;
		for(int i = 0; i < sales.length; i++)
		{
			//only assigns topFive a value if topFive is empty
			//or if the totalSales from the sales[] is > the totalSales in topFive
			while(topFive[count] == null || topFive[count].totalSales < sales[i].totalSales)
			{
				if(count == 0)
				{
					topFive[count] = sales[i];
				}
				else
				{
					//new temp array that's empty
					Salesman temp = null;
					//resets topFive[count] to empty
					topFive[count] = temp;
					//updates topFive[count] to sales[i]
					topFive[count] = sales[i];
					//resets previous topFive value to empty
					topFive[count - 1] = temp;
				}
				count++;
			}
		}
		return topFive;
	}
	
	@Override
	public String toString()
	{
		return "Salesman: " + this.name + " has a yearly total sale of $" + this.totalSales;
	}
}
