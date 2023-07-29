public class io { 
    public static void main (String[] args) { 
        int result = 0;
        int[] values = {4, 11, 17, 43, 91, 0, 54}; 
        for(int i = 0; i < 4; i++) { 
             if(i % 2 == 0) { 
                result += dosomething(values[i], values[i*2]); 
             } else { 
                result += dosomething(Integer.toString(values[i]),"1" + Integer.toString(values[5])); 
            } 
        }
        System.out.println(result); 
    }

    public static int dosomething (int value1, int value2) {
        return value1 + value2;  
    }
    public static int dosomething (String value1, String value2) { 
        return Integer.valueOf(value1) - Integer.valueOf(value2);
    }
}