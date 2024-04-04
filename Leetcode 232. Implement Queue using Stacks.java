class MyQueue {
    Stack<Integer> st;
    Stack<Integer> queue_front;
    public MyQueue() {
        st=new Stack<>();
        queue_front=new Stack<>(); 
    }
    
    public void push(int x) {
        if(queue_front.empty()){
            queue_front.push(x);
        }
        else{
            st.push(x);
        }
    }
    
    public int pop() {
        int pop_val=queue_front.pop();

        if(st.empty()){ return pop_val;}

        while(st.size()!=1){
            queue_front.push(st.pop());
        }
        int new_val=st.pop();

        while(queue_front.size()!=0){
            st.push(queue_front.pop());
        }

        queue_front.push(new_val);

        return(pop_val);
        
    }
    
    public int peek() {
        return(queue_front.peek());
    }
    
    public boolean empty() {
        if(queue_front.size()==0)
        return true;
        else return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
