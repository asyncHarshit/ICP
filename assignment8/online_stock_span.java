package assignment8;

import java.util.ArrayDeque;
import java.util.Deque;

public class online_stock_span {
    class StockSpanner {
    private Deque<int[]> stack;
    public StockSpanner() {
        stack = new ArrayDeque<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            span += stack.pop()[1];

        }
        stack.push(new int[]{price,span});
        return span;
        
    }
}
    
}
