package Bai5;

public class Bai5 {
    public static void swapFirstTwoChar(){
        String a = "abc";
        String b = "xyz";
        String c = a.replace(a.charAt(0),b.charAt(0));
        String d = c.replace(a.charAt(1),b.charAt(1));
        String e = b.replace(b.charAt(0),a.charAt(0));
        String f = e.replace(b.charAt(1),a.charAt(1));
        System.out.println(d+" "+f);
    }
    public static void main(String[] args){
        System.out.println("2 chuoi ban dau: abc, xyz");
        System.out.println("chuoi moi");
        Bai5.swapFirstTwoChar();
    }
}
