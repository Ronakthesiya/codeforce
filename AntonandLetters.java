import java.util.*;

public class AntonandLetters {

    public static ArrayList<Character> removeDuplicates(ArrayList<Character> list)
    {
        ArrayList<Character> newList = new ArrayList<Character>();
        for (Character element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()<3){

            System.out.println(0);

        }else{

            ArrayList<Character> n=new ArrayList<Character>();

            for(int i=1;i<s.length();i+=3){
                n.add(s.charAt(i));
            }
            n=removeDuplicates(n);
            System.out.println(n.size());
        }
    }
}
