public class WrapperInteger {

    public static void main(String[] args) {

        int primitivo = 32768;
        Integer intObjeto = Integer.valueOf(primitivo); //declaración de forma explícita
        Integer intObjeto2 = 32768; //declaración de forma implícita
        System.out.println("intObjeto = " + intObjeto);

        int n = intObjeto;  // declaración de forma explícita
        int n2 = intObjeto.intValue(); //declaración de forma implícita

        System.out.println("n = " + n);
        System.out.println("n2 = " + n2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor Tv = " + valor);

        Short sh = intObjeto.shortValue();  //No se presenta error en el código pese a que el valor que se va a almacenar, supere el máximo aunque al imprimir el resultado se evidencia perdida de información.
        System.out.println("Objeto Short " + sh);

        Byte bo = intObjeto.byteValue();    //No se presenta error en el código pese a que el valor que se va a almacenar, supere el máximo aunque al imprimir el resultado se evidencia perdida de información.
        System.out.println("Objeto Byte " + bo);

        Long lo = intObjeto.longValue();    // Acá no pasa nada, ya que, Long es mayor en tamaño de memoria de int
        System.out.println("Objeto Long " + lo);

    }

}