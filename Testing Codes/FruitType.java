abstract class Fruit {
    String color;

    public String toString() {
        return getClass().getName() + ":" + color;
    }
}

class Apple extends Fruit {
    Apple() {
        color = "Red";
    }
}

class Banana extends Fruit {
    Banana() {
        color = "Yellow";
    }
}

class Orange extends Fruit {
    Orange() {
        color = "Orange";
    }
}

class Strawberry extends Fruit {
    Strawberry() {
        color = "Red";
    }
}

class FruitTypes {
    public static void main(String[] args) {
        Fruit fruit = new Apple();//A superclass variable can
        //System.out.println(fruit);//reference a subclass object
        fruit = new Banana();
//        System.out.println(fruit);
        fruit = new Orange();
        System.out.println(fruit);
    }
}