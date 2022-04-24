

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2178 {
    static int answer;
    static int N, M;
    static int[][] arr, dir = {{1,0},{-1,0},{0,1},{0,-1}};
    static boolean[][] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][M];
        check = new boolean[N][M];
        answer = Integer.MAX_VALUE;
        for(int i = 0;i < N;i++) {
            String str = sc.next();
            for(int j = 0;j < M;j++)
                arr[i][j] = str.charAt(j) - '0';
        }
        check[0][0] = true;
        solution();
        System.out.println(answer);
    }
    public static void solution() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,0,0));
        while(!q.isEmpty()) {
            Point p = q.poll();
            if(p.x == N - 1 && p.y == M - 1) {
                answer = p.count + 1;
                break;
            }
            for(int i = 0;i < 4;i++) {
                int x = p.x + dir[i][0];
                int y = p.y + dir[i][1];
                if(x >= 0 && y >= 0 && x < N && y < M && arr[x][y] == 1 && !check[x][y]) {
                    check[x][y] = true;
                    q.add(new Point(x,y,p.count + 1));
                }
            }
        }
    }
    static class Point{
        int x,y,count;
        public Point(int x,int y,int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
