package dynamicprogramming;

/*
 *You are climbing a stair case and it takes A steps to reach to the top.
 *Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

public class Stairs {
	public int climbStairs(int A) {
        return fib(A);
    }
    
    private int fib(int n){
        int f[]=new int[n+2];
        f[0]=1;
        f[1]=1;
        for(int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
}
