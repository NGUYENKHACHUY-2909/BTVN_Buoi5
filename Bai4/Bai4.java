package Bai4;

public class Bai4 {
    public static void changeChar(){
        String str = "restart";
        String str2 = "";
        char a = str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(a==str.charAt(i)){
                str2+='$';
            }
            else str2+=str.charAt(i);
        }
        System.out.println(a+str2);
    }
    public static void main(String[] args){
        System.out.println("chuoi ban dau: "+"restart");
        System.out.println("chuoi moi: ");
        Bai4.changeChar();
    }
}
