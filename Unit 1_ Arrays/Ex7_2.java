import java.util.*;

public class Ex7_2 {
        
    public static int[] reverse(int[] a) {
		int[] b = new int[a.length];
		for (int i=0; i < a.length; i++) {
			b[b.length - i - 1] = a[i];
		}
		return b;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter 10 numbers.");
        int[] nums = new int[10];
        for (int i=0;i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        
        input.close();
        System.out.println(Arrays.toString(reverse(nums)));
    }
}
        

