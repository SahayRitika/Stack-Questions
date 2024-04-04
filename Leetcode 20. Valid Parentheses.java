class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<>();
        int l=s.length(),i;
        for(i=0;i<l;i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            st.push(s.charAt(i));
            else if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='(')
            st.pop();
            else if(!st.isEmpty() && s.charAt(i)=='}' && st.peek()=='{' )
            st.pop();
            else if(!st.isEmpty() && s.charAt(i)==']' && st.peek()=='[' )
            st.pop();
            else
            st.push(s.charAt(i));
        }
        if(st.isEmpty())
        return (true);
        else
        return(false);
    }
}
