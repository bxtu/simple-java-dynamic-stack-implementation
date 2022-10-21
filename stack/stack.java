package stack;

public class stack {
    int topOfstack;
    int []stack;
    int stacksize;
    stack(int stacksize){
        this.stacksize=stacksize;
        this.stack=new int[stacksize];//creating array
        this.topOfstack=-1;//giving "-1" to top cuz while doing push method we have to start with stack[0]
    }
    void push(int number ){
        if(topOfstack==stacksize-1){
            System.out.println("overflow");
            increaseStackCapacity();
        }
            System.out.println("Adding: "+number);
            this.stack[++topOfstack] = number;

    }
    int pop(){
        if(stacksize<1){
            System.out.println("stack is empty");
        }
        int number=this.stack[topOfstack--];
        System.out.println("Removed entry: "+number);
        return number;
    }
    private void increaseStackCapacity(){
        int[] newStack = new int[this.stacksize+1];
        for(int i=0;i<stacksize;i++){
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
        this.stacksize = this.stacksize+1;
    }
}
