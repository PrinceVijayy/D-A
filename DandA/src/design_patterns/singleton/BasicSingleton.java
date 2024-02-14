package design_patterns.singleton;

public final class BasicSingleton {
    private static BasicSingleton instance;

    private BasicSingleton(){}

    public static synchronized BasicSingleton getInstance(){
        if(instance == null){
            instance = new BasicSingleton();
        }
        return instance;
    }
}
