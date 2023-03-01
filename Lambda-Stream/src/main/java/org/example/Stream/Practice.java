package org.example.Stream;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice {
    int[] dis = {1, -1, 5};
    int[] check = new int[10001];
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int hyeonsu, int calf) {
        check[hyeonsu] = 1;
        Q.offer(hyeonsu);
        int level = 0;

        while (!Q.isEmpty()) {
            int leng = Q.size();

            for (int i = 0; i < leng; i++) {
                int x = Q.poll();

                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];

                    if (nx == calf) {
                        return level + 1;
                    }

                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Practice t = new Practice();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(t.BFS(n, k));
    }
}
