class Solution {
    //T(C(N)==O(N)) and S(C(N))==O(1) as it requires non memory space allocation iteratively 
    public int maxProfit(int[] prices) {//Maximum profit funct declare
        int profit=0,stock=prices[0],ans=0;//Initializing Variables
        int n = prices.length;//Prices's Size Declare
        for(int i=1;i<n;i++){//Iterating through price's Size
            if(prices[i]<stock)stock = prices[i];// Storing Stock's At Most Share
           if(prices[i]>prices[i-1]){//Storing at least Prev Stock's Share
               profit=prices[i]-stock;//Profit Declare
               stock = prices[i];//Share's Selling and Cost Price's declare
               ans+=profit;//Incrementing Share's Price to Maximize Profit 
        }}return ans;}}//Printing Product's maximizable Price
