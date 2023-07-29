public class ronak { 
    public static void main (String[] args) { 
        int result = 0;
        int[] values = {4, 11, 17, 43, 91, 0, 54}; 
        for(int i = 0; i < 4; i++) { 
             if(i % 2 == 0) { 
                result += values[i]+values[i*2]; 
             } else { 
                result += values[i]-10-values[5]; 
            } 
        }
        System.out.println(result); 
    }
}