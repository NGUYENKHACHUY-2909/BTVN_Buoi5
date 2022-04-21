package Bai10;
import java.util.Scanner;
public class Bai10 {
    public static void swapFirstAndLastChar(){
        String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao chuoi: ");
        a = scan.nextLine();
        String d = a.replace(a.charAt(0),a.charAt(a.length()-1));
        String e = d.replace(d.charAt(d.length()-1),a.charAt(0));
        System.out.println("New String = ");
        System.out.println(e);
    }

    public static void main(String[] args) {
        Bai10.swapFirstAndLastChar();
    }
}
