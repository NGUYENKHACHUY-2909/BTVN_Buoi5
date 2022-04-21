package Bai6;

import java.util.Scanner;

public class Bai6 {
    public static void addIngOrLy(){
        Scanner scan = new Scanner(System.in);
        String a;
        System.out.println("Nhap mot chuoi: ");
        a = scan.nextLine();
        while (a.length()<3){
            System.out.println("ban can nhap lai chuoi");
            a = scan.nextLine();
        }
        String b = "ing";
        String c = "ly";
        String d = a.substring(a.length()-3,a.length());
        if(d.equals("ing")){
            a=a.concat(c);
        }
        else {
            a = a.concat(b);
        }
        System.out.println("new String = "+a);
    }
    public static void main(String[] args){
        Bai6.addIngOrLy();
    }
}
