// Last updated: 7/9/2026, 9:11:42 AM
class Solution {
    public String capitalizeTitle(String title) {
       String b[]=title.split(" ");
       String r="";
       for(String w:b){
        if(w.length()<=2){
               r+=w.toLowerCase();
        }
        else{    
            r+=w.substring(0,1).toUpperCase()+w.substring(1).toLowerCase();
        }
        r+=" ";
       } 
       return r.trim();
    }
}