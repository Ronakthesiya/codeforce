public class l { 
    public static void main (string[] args) { 
        int result = 0;int[] values = {4, 11, 17, 43, 91, 0, 54}; 
        for(int i = 0; i < 4; i++) { 
             if(i % 2 == 0) { 
                result += dosomething(values[i], values[i*2]); 
             } else { 
                 result += dosomething(integer.tostring(values[i]),"1" + integer.tostring(values[5])); 
            } 
        }
        system.out.println(result); 
    }
                  public static int dosomething (int value1, int value2) { 
                     return value1 + value2;  }
                      public static int dosomething (string value1, string value2) { 
                        return integer.valueof(value1) - integer.valueof(value2)
                      }
                    }