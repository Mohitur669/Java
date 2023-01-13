import java.util.Scanner;

public class Graph_DFSTraversal {

    // This is DFS Traversal
    public static void main(String[] args) {
        int vertices;
        int edges;
        Scanner s = new Scanner(System.in);
        vertices = s.nextInt();
        edges = s.nextInt();
        // Creating a matrix for saving adjacent is present or not
        int[][] adjacentMatrix = new int[vertices][vertices];
        for (int i = 0; i < edges; i++) {
            int firstVertex = s.nextInt();
            int secondVertex = s.nextInt();
            adjacentMatrix[firstVertex][secondVertex] = 1;
            adjacentMatrix[secondVertex][firstVertex] = 1;
        }
        print(adjacentMatrix);
    }

    public static void printHelper(int[][] adjacentMatrix, int startVertex, boolean[] visited) {
        System.out.println(startVertex);
        visited[startVertex] = true;
        int n = adjacentMatrix.length;
        for (int i = 0; i < n; i++) {
            if (adjacentMatrix[startVertex][i] == 1 && !visited[i]) {
                printHelper(adjacentMatrix, i, visited);
            }
        }
    }

    public static void print(int[][] adjacentMatrix) {
        boolean[] visited = new boolean[adjacentMatrix.length];
        for (int i = 0; i < adjacentMatrix.length; i++) {
            if (!visited[i]) {
                printHelper(adjacentMatrix, i, visited);
            }
        }
    }
}