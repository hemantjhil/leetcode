class Solution {
    public boolean isHappy(int n) {
       int count=0;
        boolean b=true;
        while(n!=1){
           int sum=0;
           while(n>0){
               int n1=n%10;
               sum+=(int)Math.pow(n1,2);
               n/=10;
           }
           count++;
            if(count>100){
                b=false;
                break;
            }
           n=sum;
       }
        //System.out.println(n);
        return b;
    }
}
