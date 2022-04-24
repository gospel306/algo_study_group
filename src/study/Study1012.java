import java.util.Arrays;
import java.util.Scanner;

public class Study1012 {
    public static int cabbageField(int[][] field, int width, int height, int earthworm) {

//            for (int i = 0; i < width; i++) {
//                for (int j = 0; j < height; j++) {
//                    int a = field[i][j];
//                    if (a==1) {
//                        field[i - 1][j - 1] = 0;
//                        field[i - 1][j] = 0;
//                        field[i - 1][j + 1] = 0;
//
//                        field[i][j - 1] = 0;
//                        field[i][j + 1] = 0;
//
//                        field[i + 1][j - 1] = 0;
//                        field[i + 1][j] = 0;
//                        field[i + 1][j + 1] = 0;
//
//                    }
//                }
//            }

        for (int i = 1; i < width; i++) {
            for (int j = 1; j < height; j++) {
                int a = field[i][j];
                if (a==1) {
                    field[i][j] = 2;
                    field[i][j - 1] = 0;        //상
                    field[i - 1][j] = 0;        //좌
                    field[i + 1][j] = 0;        //우
                    field[i][j + 1] = 0;        //하
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                sum += field[i][j];
            }
        }


        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        for (int j = 0; j < testCase; j++) {
            int width = scan.nextInt();
            int height = scan.nextInt();
            int earthworm = scan.nextInt();
            int[][] field = new int[width+2][height+2];     //index exception 예방
            scan.nextLine();

            for (int i = 0; i < earthworm; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                field[x+1][y+1] = 1;
                scan.nextLine();
            }
            System.out.println(cabbageField(field, width, height, earthworm));
        }


    }
}
