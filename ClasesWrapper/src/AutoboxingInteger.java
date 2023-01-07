public class AutoboxingInteger {

    public static void main(String[] args) {

        Integer[] enteros = {Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //Integer.valueOf(1) es la forma explícita, la forma implícita es cuando se escribe solo el número
        int suma = 0;

        //For each de manera explícita
        for (Integer i: enteros){
            if (i.intValue() % 2 == 0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        //For each de manera implícita
        suma = 0;
        for (Integer i: enteros){
            if (i % 2 == 0){
                suma += i;
            }
        }

        System.out.println("suma = " + suma);

    }

}