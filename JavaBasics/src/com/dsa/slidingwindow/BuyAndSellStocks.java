package com.dsa.slidingwindow;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		int [] prices = {10,5,6,12,4,9,8};
		System.out.println(maxProfix(prices));
	}
	//O(n^2) Brute force
	static int maxProfix1(int[] prices)
	{
		int maxprofit = 0;
		for(int i=0;i<prices.length-1;i++)
		{
			for(int j=i+1;j<prices.length;j++)
			{
				int profit = prices[j]-prices[i];
				if (profit>maxprofit)
				{
					maxprofit = profit;
				}
			}
			
		}
		
		return maxprofit;
	}	
	//O(n) solution - optimum solution
	static int maxProfix(int[] prices)
	{ 
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		
		for (int i=0;i<prices.length;i++)
		{
			if (prices[i]<minprice)
			{
				minprice = prices[i];
			}
			else if(prices[i]-minprice>maxprofit)
			{
				maxprofit = prices[i]-minprice;
			}
		}
		
		return maxprofit;
		
	}
}
