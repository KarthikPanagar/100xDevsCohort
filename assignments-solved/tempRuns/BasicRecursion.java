package tempRuns;


public class BasicRecursion{

    public static void main(String[] args) {
        
        System.out.println(factorial(5));
        System.out.println(isPalindrome("racecar"));
        int[] ans = reverseArray(0, new int[] {1,2,3,4,5,6}, 5 );
        for(int i:ans){
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.println(fibonacci(12));

    }

    public static int factorial(int n){

        if(n==1) return 1;

        return n*factorial(n-1);
    }

    public static boolean isPalindrome(String str){
        int n = str.length();

        if(n<=1) return true;

        if(str.charAt(0)!=str.charAt(n-1)) return false;

        return isPalindrome(str.substring(1, n-1));

    }

    public static int[] reverseArray(int l, int[] arr, int r){

        if(l>=r) return arr;

        swap(l, arr, r);

        return reverseArray(l+1, arr, r-1);
    }
    static void swap(int l, int[] arr, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static int fibonacci(int n) {
	//recursive
        // if(n ==0) return 0;
        // if(n==1) return 1;
        // //if(n==0 || 1) return n;
        // return fibonacci(n-1) + fib(n-2);
    //iterative
	    if(n<=1) return n;
	    int prev1 = 0; 
	    int prev2 = 1; 
	    int result = 0;
	    for (int i = 2; i <= n; i++) {
	        result = prev1 + prev2; 
	        prev1 = prev2;          
	        prev2 = result;     
	    }
	    return result;
    }

}