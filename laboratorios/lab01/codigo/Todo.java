import java.util.Random;
public class Todo {
    public int arrayMax(int[] a, int n){
        int max;
        int temp;
        try        
        {
            Thread.sleep(5);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        max = a[n];
        if (n != 0){
            temp = arrayMax(a, n-1);
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }

    public boolean groupSum(int start, int[] nums, int target) {
        try        
        {
            Thread.sleep(3/100000);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
        
        if (start >= nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start])
        || groupSum(start + 1, nums, target);
    }
    
    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void Main(String[] args){
        Todo max = new Todo();
        
        for(int i = 5; i <= 50; i = i+5){
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            max.arrayMax(rand, n-1);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("ArrayMax de "+i+" :"+estimatedTime);
        }
        
        System.out.println();
        for(int i = 15; i <= 25; i++){
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            max.groupSum(0,rand,n);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Groupsum de "+i+" :"+estimatedTime);
        }
        
        System.out.println();
        for(int i = 20; i <= 38; i = i + 2){
            int n = i;
            int[] rand = new int[n];
            for(int j = n - 1; j >= 0; j--){
                rand[j] = (int)(Math.random() * 100 + 1);
            }
            
            long startTime = System.currentTimeMillis();
            fibonacci(40);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Fibonacci de "+i+" : "+estimatedTime);
        }
    }
}