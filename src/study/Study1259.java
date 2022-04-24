import java.util.Scanner;

public class Study1259 {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        while(true){
            Scanner scan = new Scanner(System.in);
            String a;

            a = scan.nextLine();
            if(a.equals("0")){
                break;
            }
            StringBuffer sb = new StringBuffer(a);
            String reverse = sb.reverse().toString();

            if(a.equals(reverse)){
                result.append("yes");
            }else{
                result.append("no");
            }
            result.append("\n");
        }
        System.out.println(result);



    }
}
