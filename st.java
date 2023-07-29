

public class st{
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("My Name Is Ronak Thesiya.");

        int k=sb.length();

        for(int i=0; i<k/2; i++){
            int front=i;
            int back=k-i-1;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }

        System.out.println(sb);
    }
}