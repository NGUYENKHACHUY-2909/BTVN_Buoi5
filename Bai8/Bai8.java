package Bai8;
import java.util.Scanner;
public class Bai8 {
    //Write a java program that take a list of word and return longest word and length of it.
    public static void longestWordAndLength(){
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap mot cau: ");
        a = scan.nextLine();
        timMax(a);
    }
    public static void timMax(String a){
        int [] len;
        String [] ss;
        ss = a.split(" ");
        len = new int[ss.length];
        int max = 0;
        for (int i =0; i< ss.length;i++){
            int L = ss[i].length();
            len[i]=L;
            if(L>max){
                L = max;
            }
        }
        int count = 0;
        for (int i =0; i< ss.length;i++){
            if(len[i]==max){
                System.out.println(ss[i]);
                System.out.println(ss[i].length());
            }
            count+=len[i]+1;
        }
    }

    public static void main(String[] args) {
        Bai8.longestWordAndLength();
    }
}
