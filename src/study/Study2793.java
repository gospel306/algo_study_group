import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Study2793 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int maxSum = scan.nextInt();

        List<Integer> integers = new ArrayList<>();
        for(int i=0;i<count;i++){
            int input = scan.nextInt();

            if(input<=maxSum){
                integers.add(input);
            }
        }

        int result = 0;
        int sum = 0;
        for(int i=0;i<integers.size()-2;i++){             //첫번째 카드 선택
            for(int j=i+1;j<integers.size()-1;j++){         //두번째 카드 선택
                for(int k=j+1; k<integers.size();k++){      //세번째 카드 선택
                    sum = integers.get(i) + integers.get(j) + integers.get(k);  //세 카드의 합

                    if(sum== maxSum){
                       result = sum;
                        break;
                    }else if (result<sum && sum<maxSum){
                        result = sum;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
