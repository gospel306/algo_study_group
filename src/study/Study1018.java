import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Study1018 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();             //가로 개수
        int M = scan.nextInt();            //세로 개수

        int fixed = 8;

        int wCount = N - 8;
        int hCount = M - 8;

        /*
        //입력받은 값으로 체스 배열 생성
        char[][] chs = new char[N][M];
        for(int i=0;i<M;i++){
            char[] line = scan.nextLine().toCharArray();
            for(int j=0;j<line.length;j++){
                chs[i][j] = line[j];
            }
        }

        */

        //string으로 처리해보기
        StringBuffer strings = new StringBuffer();
        for (int i = 0; i < M; i++) {
            String line = scan.nextLine();
            strings.append(line);
        }

        int startNo = 0;
        int endNo = startNo + 64;
        int startIdx = 0;
        int endIdx = 0;


        //시작값 추출
        List<Integer> list = new ArrayList<>();
        int defaultNum = 0;
        for (int i = 0; i < wCount; i++) {
            list.add(defaultNum + i);
        }
        for(int i=0;i<hCount;i++){
            list.add(defaultNum + i*M);
        }

        StringBuffer temp = new StringBuffer();
        //8줄 뽑아내기
        for(int j=0;j<list.size();j++){
            for (int i = 0; i < fixed; i++) {
                startIdx = list.get(j)+ (i * N);
                endIdx = startIdx + fixed;
                temp.append(strings.substring(startIdx, endIdx));
            }
        }

        char startSt = temp.charAt(0);
        for(int i=0;i<temp.length();i++){
        }

        


    }
}
