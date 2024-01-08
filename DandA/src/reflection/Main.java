package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        DatabaseConnection instanceOne = DatabaseConnection.getInstance();
        DatabaseConnection instanceTwo = null;

        Constructor[] declaredConstructors = DatabaseConnection.class.getDeclaredConstructors();
        for (Constructor con : declaredConstructors) {
            con.setAccessible(true);
            instanceTwo = (DatabaseConnection) con.newInstance();
            break;
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
