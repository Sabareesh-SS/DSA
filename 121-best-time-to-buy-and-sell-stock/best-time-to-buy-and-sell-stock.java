class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int[] smax= new int[len];
        int temp=0;
        for(int i=len-1;i>=0;i--){
            smax[i]=Math.max(temp,prices[i]);
            if(prices[i]>temp) temp=prices[i];
        }
        int ans=0;
        for(int i=0;i<len-1;i++){
            int x=smax[i]-prices[i];
            if(ans<x) ans=x;
        }
        return ans;
    }
}