public class WrapperBoolean {

    public static void main(String[] args) {

        Integer n1,n2;
        n1 = 1;
        n2 = 2;

        boolean primBoolean = n1 > n2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean); // Boxing
        Boolean objetoBoolean2 = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparando 2 objetos Boolean: " + (objetoBoolean == objetoBoolean2)); //Acá si compara por valor diferente a los objetos numéricos o clase String
        System.out.println("Comparando 2 objetos Boolean: " + (objetoBoolean.equals(objetoBoolean2)));

        boolean primBoolean2 = objetoBoolean.booleanValue(); //Retorna el valor del objeto Boolean como un boolean primitivo, unboxing
        System.out.println("primBoolean2 = " + primBoolean2);

    }

}