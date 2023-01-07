public class WrapperOperRela {

    public static void main(String[] args) {

        Integer n = Integer.valueOf(127); // Hasta 127 Java compara por valor de forma automática, 128 en adelante compara por referencia en los objetos
        Integer n2 = n;

        System.out.println("n = " + n);
        System.out.println("n2 = " + n2);

        System.out.println("Son el mismo objeto? " + (n==n2));

        n2 = 127;
        System.out.println("Son el mismo objeto? " + (n==n2));
        System.out.println("Tienen el mismo valor? " + n.equals(n2));

        boolean con = n > n2;                       //Forma implícita, autoboxing
        System.out.println("con = " + con);
        
        boolean con2 = n.intValue() > n2.intValue(); //Forma explícita
        System.out.println("con2 = " + con2);

    }

}