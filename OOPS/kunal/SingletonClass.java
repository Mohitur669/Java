package kunal;

//  In object-oriented programming, a singleton class is a class that can have only one object
//  (an instance of the class) at a time.
public class SingletonClass {
    private SingletonClass() {

    }

    private static SingletonClass instance;

    public static SingletonClass getInstance() {
//        check whether one object only is created or not
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }
}