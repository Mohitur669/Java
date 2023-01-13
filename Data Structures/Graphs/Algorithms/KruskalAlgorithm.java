/*
Given an undirected, connected and weighted graph G(V, E) with V number of vertices
(which are numbered from 0 to V-1) and E number of edges.
Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
For printing MST follow the steps -
1. In one line, print an edge which is part of MST in the format - v1 v2 w
where, v1 and v2 are the vertices of the edge which is included in MST and whose weight is w.
And v1  <= v2 i.e. print the smaller vertex first while printing an edge.
2. Print V-1 edges in above format in different lines.
Note : Order of different edges doesn't matter.

Input Format :
Line 1: Two Integers V and E (separated by space)
Next E lines : Three integers ei, ej and wi, denoting that there exists
an edge between vertex ei and vertex ej with weight wi (separated by space)
Output Format :
Print the MST, as described in the task.

Constraints :
2 <= V, E <= 10^5
Time Limit: 1 sec

Sample Input 1 :
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Sample Output 1 :
1 2 1
0 1 3
0 3 5 */
package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    int source;
    int dest;
    int weight;

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight; //increasing order
    }
}

public class KruskalAlgorithm {
    private static void kruskal(Edge[] input, int n) {
        Arrays.sort(input);
        Edge[] output = new Edge[n - 1];
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int count = 0;
        int i = 0;
        while (count != n - 1) {
            Edge currEdge = input[i];

            int sourceParent = findParent(currEdge.source, parent);
            int destParent = findParent(currEdge.dest, parent);

            if (sourceParent != destParent) {
                output[count] = currEdge;
                count++;
                parent[sourceParent] = destParent;
            }
            i++;
        }

        for (int j = 0; j < n - 1; j++) {
            if (output[j].source < output[j].dest)
                System.out.println(output[j].source + " " + output[j].dest + " " + output[j].weight);
            else System.out.println(output[j].dest + " " + output[j].source + " " + output[j].weight);
        }
    }

    private static int findParent(int v, int[] parent) {
        if (parent[v] == v) {
            return v;
        }
        return findParent(parent[v], parent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        Edge[] input = new Edge[E];
        for (int i = 0; i < E; i++) {
            input[i] = new Edge();
            input[i].source = sc.nextInt();
            input[i].dest = sc.nextInt();
            input[i].weight = sc.nextInt();
        }
        kruskal(input, V);
    }
}