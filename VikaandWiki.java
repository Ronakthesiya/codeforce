import java.util.*;

public class VikaandWiki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int[] initialArray = array.clone();
        int actions = 0;
        ArrayList<String> al = new ArrayList<>();
        
        while (true) {
            boolean allZero = true;
            for (int i = 0; i < n; i++) {
                if (array[i] != 0) {
                    allZero = false;
                    break;
                }
            }
            
            if (allZero) {
                System.out.println(actions);
                return;
            }
            
            String currentState = Arrays.toString(array);
            if (al.contains(currentState)) {
                System.out.println(-1);
                return;
            }
            
            al.add(currentState);
            actions++;
            
            int[] newArray = new int[n];
            boolean sameAsInitial = true;
            for (int i = 0; i < n; i++) {
                int nextIndex = (i + 1) % n;
                int k=array[i];
                newArray[i] = array[i] ^ array[nextIndex];
                if (k != newArray[i]) {
                    sameAsInitial = false;
                }
            }
            
            array = newArray;

            if (sameAsInitial) {
                System.out.println(-1);
                return;
            }
        }
    }
}
