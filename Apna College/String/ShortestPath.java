public class ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getPath(path));
    }

    public static double getPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            }
            if (dir == 'N') {
                y++;
            }
            if (dir == 'W') {
                x++;
            }
            if (dir == 'E') {
                x--;
            }
        }
        return Math.sqrt(x * x + y * y);
    }
}