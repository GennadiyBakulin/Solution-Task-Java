package modul8.reflection.task1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MainClass myObjectClass = new MainClass("Petr", 25, true);
        Class<MainClass> mainClass = MainClass.class;
        Method infoOfClass = mainClass.getDeclaredMethod("infoOfClass");
        infoOfClass.setAccessible(true);
        infoOfClass.invoke(myObjectClass);
    }
}
