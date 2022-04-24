import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0;t < T;t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] map = new int[M][N];
            for(int i = 0;i < K;i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[x][y] = -1;
            }
            int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
            int cnt = 0;
            for(int i = 0;i < map.length;i++) {
                for(int j = 0;j < map[i].length;j++) {
                    if(map[i][j] == -1) {
                        cnt++;
                        Queue<Point> q = new LinkedList<>();
                        q.add(new Point(i, j));
                        map[i][j] = cnt;
                        while(!q.isEmpty()) {
                            Point p = q.poll();
                            for(int k = 0;k < 4;k++) {
                                int dx = p.x + dir[k][0];
                                int dy = p.y + dir[k][1];
                                if(dx >= 0 && dx < map.length && dy >= 0 && dy < map[i].length && map[dx][dy] == -1) {
                                    q.add(new Point(dx,dy));
                                    map[dx][dy] = cnt;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    static class Point{
        int x;
        int y;
        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }
    }
}