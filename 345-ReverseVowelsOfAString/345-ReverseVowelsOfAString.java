// Last updated: 7/9/2026, 9:13:02 AM
class Solution {
    public String reverseVowels(String s) {
        // your code here
        char[]c=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!isVowel(c[i])){
                i++;
                continue;
            }
            if(!isVowel(c[j])){
                j--;
                continue;
            }
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
                i++;
                j--;
        }
        
        return new String(c);
        }
     boolean isVowel(char ch) {
     return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||
            ch=='I'||ch=='O'||ch=='U');
            
     }           
}