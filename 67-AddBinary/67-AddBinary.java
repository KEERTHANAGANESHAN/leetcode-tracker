// Last updated: 7/9/2026, 9:27:51 AM
class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        while(i>=0 ||j>=0 ||carry!=0){
            int s=carry;
            if(i>=0){
                s+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                s+=b.charAt(j)-'0';
                j--;
            }
            ans.append(s%2);
            carry=s/2;
        }
        return ans.reverse().toString();
    }
}