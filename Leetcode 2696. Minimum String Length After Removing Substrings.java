class Solution {
    public int minLength(String s) {
        int top=0;
        int stack[]= new int[s.length()+1];

        for(char c: s.toCharArray()){
            if((c=='B' && stack[top]=='A') || (c=='D' && stack[top]=='C')){
                top--;
            }else{
                top++;
                stack[top]= c;
            }
        }

        return top;
    }
}
