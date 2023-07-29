import java.util.*;
public class LoveStory {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String s=sc.nextLine();
            int c=0;
            
            if(s.charAt(0)!='c'){
                c++;
            }
            if(s.charAt(1)!='o'){
                c++;
            }
            if(s.charAt(2)!='d'){
                c++;
            }
            if(s.charAt(3)!='e'){
                c++;
            }
            if(s.charAt(4)!='f'){
                c++;
            }
            if(s.charAt(5)!='o'){
                c++;
            }
            if(s.charAt(6)!='r'){
                c++;
            }
            if(s.charAt(7)!='c'){
                c++;
            }
            if(s.charAt(8)!='e'){
                c++;
            }
            if(s.charAt(9)!='s'){
                c++;
            }

            System.out.println(c);
        }
    }    
}
