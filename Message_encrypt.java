import java.util.Scanner;

public class Message_encrypt {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.next();

        int l=a.length();
        int r=0;
        for(int i=1;i<=l;i++){
            if(i*i >=l){
                r=i;
                break;
            }
        }
        System.out.println(r);
        StringBuilder b=new StringBuilder();
        for(int i=0;i<r;i++){
            for(int j=i;j<l;j+=r){
               char c=a.charAt(j);
                b.append(c);

            }
        }
        System.out.println(b);
    }
}

