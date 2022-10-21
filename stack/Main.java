package stack;

public class Main {
    public static void main(String[] args) {
        stack stack=new stack(3);
        for (int i=0;i<10;i++){
            stack.push(i);
        }
        for(int i=1;i<4;i++){
            stack.pop();
        }
    }
}