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
	public static Salesman[] getTopFive(Salesman[] sales, Salesman[] temp)
	{
		//defining new array to hold top 5 salesmen = name & totalSales
		Salesman topFive[] = temp;
		
		//goes through the 10 salesmen from sales array
		int count = 0;
		for(int i = 0; i < sales.length; i++)
		{
			while(topFive[count].totalSales == 0 || topFive[count].totalSales < sales[i].totalSales)
			{
				if(count == 0)
				{
					topFive[count] = sales[i];
				}					
				else
				{
					for(int a = 0; a < temp.length; a++)
					{
						if(topFive[count].totalSales > temp[a].totalSales)
						{
							temp[a] = topFive[count];
							topFive[count] = sales[i];
							topFive[count-1] = temp[a];
						}
					}
				}
				count++;
			}
				System.out.println(topFive[0]);
				System.out.println(topFive[1]);
				System.out.println(topFive[2]);
				System.out.println(topFive[3]);
				System.out.println(topFive[4]);
		
			/*only assigns topFive a value if topFive is empty
			or if the totalSales from the sales[] is > the totalSales in topFive
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
			}*/
		}
		return topFive;
	}
	
	@Override
	public String toString()
	{
		return "Salesman: " + this.name + " has a yearly total sale of $" + this.totalSales;
	}
}
