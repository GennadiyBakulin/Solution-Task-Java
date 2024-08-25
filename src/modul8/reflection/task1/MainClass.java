package modul8.reflection.task1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class MainClass {
    private String name;
    public int age;
    boolean male;

    public MainClass(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "MainClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + male +
                '}';
    }

    protected void infoOfClass() throws NoSuchMethodException {
        Class<MainClass> mainClass = MainClass.class;
        System.out.println("Суперкласс данного класса: " + mainClass.getSuperclass());
        System.out.println(mainClass.getName() + " : " + mainClass.getSimpleName());
        System.out.println(Arrays.toString(mainClass.getConstructors()));
        System.out.println(Arrays.toString(mainClass.getFields()));
        System.out.println(Arrays.toString(mainClass.getDeclaredFields()));
        System.out.println(Arrays.toString(mainClass.getMethods()));
        System.out.println(Arrays.toString(mainClass.getDeclaredMethods()));
        System.out.println("------------------------------------");
        Method info = mainClass.getDeclaredMethod("infoOfClass");
        int modifiers = info.getModifiers();
        System.out.println(modifiers);
    }
}
