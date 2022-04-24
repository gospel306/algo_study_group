import java.util.Scanner;

public class Study4153 {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        while (true) {
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            if (input.replace(" ", "").equals("000")) {
                break;
            }

            String[] nums = input.split(" ");
            boolean resultBoolean = false;
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            int c = Integer.parseInt(nums[2]);
            if((a*a) + (b*b)  == (c*c)){
                resultBoolean = true;
            }

            if (resultBoolean) {
                result.append("right");
            } else {
                result.append("wrong");
            }
            result.append("\n");
        }
        System.out.println(result);


    }
}
