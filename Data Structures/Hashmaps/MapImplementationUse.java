public class MapImplementationUse {
    public static void main(String[] args) {
        MapImplementation<String, Integer> mapImplementation = new MapImplementation<>();
        for (int i = 0; i < 20; i++) {
            mapImplementation.insert("abc" + i, i + 1);
            System.out.println("i = " + i + ", load factor = " + mapImplementation.loadFactor());
        }
        mapImplementation.removeKey("abc3");
        mapImplementation.removeKey("abc7");
        for (int i = 0; i < 20; i++) {
            System.out.println("abc" + i + ":" + mapImplementation.getValue("abc" + i));
        }
    }
}