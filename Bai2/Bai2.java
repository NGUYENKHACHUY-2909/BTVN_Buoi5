package Bai2;

public class Bai2 {
    public static void demSoLanKyTu(){
        String str = "Hello world";
        for(int i =0; i<str.length();i++){
            int count =0;
            boolean isRuned = false;
            for (int j=0;j<i;j++){
                if(str.charAt(i)==str.charAt(j)){
                    isRuned = true;
                    break;
                }
            }
            if(isRuned){
                continue;
            }
            else{
                for (int k = i; k<str.length();k++){
                    if(str.charAt(i)==str.charAt(k)){
                        count++;
                    }
                }
            }
            System.out.println(str.charAt(i)+" xuat hien: "+ count+ " lan");
        }
    }
    public static void main(String[] args){
        Bai2.demSoLanKyTu();
    }
}
