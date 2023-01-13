/*
Given an undirected graph G(V,E), check if the graph G is connected graph or not.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.

Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
Output Format :
The first and only line of output contains "true" if the given graph is connected or "false", otherwise.

Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second

Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
true

Sample Input 2:
4 3
0 1
1 3
0 3
Sample Output 2:
false

Sample Output 2 Explanation
The graph is not connected, even though vertices 0,1 and 3 are connected to each other
but there isn’t any path from vertices 0,1,3 to vertex 2.
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsConnected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        if (v == 0) {
            System.out.println("true");
            return;
        }

        int[][] edges = new int[v][v];
        for (int i = 0; i < e; i++) {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            edges[sv][ev] = 1;
            edges[ev][sv] = 1;
        }
        System.out.println(isConnected(edges, 0));
    }

    public static boolean isConnected(int[][] edges, int sv) {
        boolean[] visited = new boolean[edges.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sv);
        visited[sv] = true;
        while (!queue.isEmpty()) {
            int front = queue.poll();
            for (int i = 0; i < edges.length; i++) {
                if (!visited[i] && edges[front][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}