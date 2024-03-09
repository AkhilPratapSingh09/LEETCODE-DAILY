public class ntghcharc {
    class Solution{    
        public char nthCharacter(String s, int r, int n){
          int nn=(s.length()+1)/2;
            String finalTemp=s;
             while(r-->0) {
                 String temp="";
                 for(int i=0;i<nn;i++) {
                     char ch=finalTemp.charAt(i);
                     if(ch=='1') temp+="10";
                     else  temp+="01";
                 }
                 finalTemp=temp;
             }
            char ans=finalTemp.charAt(n);
            return ans;
        }
    }
}
