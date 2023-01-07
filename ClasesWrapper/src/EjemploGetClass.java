import java.lang.reflect.Method;

public class EjemploGetClass {

    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class strClass = texto.getClass();
        System.out.println("Clase: " +  strClass.getName());
        System.out.println("Clase: " +  strClass.getSimpleName());
        System.out.println("Clase: " +  strClass.getPackage());
        System.out.println("Clase: " +  strClass.getPackageName());
        System.out.println("Clase: " +  strClass);

        for (Method m: strClass.getMethods()){
            System.out.println("m.getName() = " + m.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getSuperclass());
        System.out.println("objClass = " + objClass);

        for (Method m: objClass.getMethods()){
            System.out.println("Metodos: " + m.getName());
        }

    }

}