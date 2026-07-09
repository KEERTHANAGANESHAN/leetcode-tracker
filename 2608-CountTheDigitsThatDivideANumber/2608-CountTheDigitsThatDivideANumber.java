// Last updated: 7/9/2026, 9:11:39 AM

import java.util.*;
class Solution {
    public static int countDigits(int num) {
        int count=0;
        int ori=num;
       while(num>0){
        int digit=num%10;
        if(digit!=0 && ori%digit==0){
       count++;
       } 
       num/=10;
    }
       return count;
    }

public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(countDigits(num));
    }
}
