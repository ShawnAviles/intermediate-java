import java.util.*;

public class Ex7_14 {
  
  public static int min(int[] list) {
    int pos = 0;
		for (int i = 1; i<list.length; i++) {
			if (list[i] < list[pos]) {
				pos = i;
			}
		} 
		return list[pos];
	}
    
  public static int gcf(int... list) {
    int gcd = min(list);
   
    for (int i = 0; i < list.length; i++) {
      if (list[i] % gcd == 0) {
      list[i] = gcd;
      } 
      else {
        list[i] = list[i] % gcd;
      }
      }
      if (gcd == min(list)) {
        return gcd;
      }
      return gcf(list);
  }
  
  public static void main(String[] args) {
    System.out.println("#1");
    int[] q1 = new int[]{144,48,36};    
    System.out.println(Arrays.toString(q1) + "; Min=" + min(q1) + "; GCF="+ gcf(q1));

    System.out.println("#2");
    int[] q2 = new int[]{15,20,9};
    System.out.println(Arrays.toString(q2) + "; Min=" + min(q2) + "; GCF="+ gcf(q2));

    System.out.println("#3");
    int[] q3 = new int[]{92,20};
    System.out.println(Arrays.toString(q3) + "; Min=" + min(q3) + "; GCF="+ gcf(q3));

    System.out.println("#4");
    int[] q4 = new int[]{2496,16704,4800,3264};
    System.out.println(Arrays.toString(q4) + "; Min=" + min(q4) + "; GCF="+ gcf(q4));

  }
}