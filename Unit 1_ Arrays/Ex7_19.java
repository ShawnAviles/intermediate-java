import java.util.Arrays;

public class Ex7_19 {
  public static void main(String[] args) {
    
    System.out.println("#1");
    isSorted(new int[]{4,7, 19, 21, 44, 98, 101});

    System.out.println("\n#2");
    isSorted(new int[]{4,7, 54, 15, 19, 21, 44, 98, 101});

    System.out.println("\n#3");
    isSorted(new int[]{-2, 0, 3});
  }

public static boolean sorted(int[] list) {
  System.out.println("The list has " + list.length + " integers." + Arrays.toString(list));
  boolean x = true;
  for (int i=0; i < list.length - 1; i++) {
    if (list[i] > list[i + 1]) {
      x = false;
      break;
    }
  }
  return x;
}

public static void isSorted(int[] list) {
  if (sorted(list)) {
    System.out.println("The list is already sorted");
  } 
  else {
   System.out.println("The list is not sorted");
  }
}
}