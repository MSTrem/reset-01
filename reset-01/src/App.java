public class App {
    public static void main(String[] args) {
        Calculadora maria = new Calculadora();

        int resultado = maria.somar(33,54);
        System.out.println(resultado);

        int resultadoSubtracao = maria.subtrai (33,54);
        System.out.println(resultadoSubtracao);

        int resultadoMultiplicacao = maria.multiplique (33,54);
        System.out.println(resultadoMultiplicacao);

       double resultadoDivisao = maria.divide(33,54);
        System.out.println(resultadoDivisao);

        Comparador comparadorDeNumero = new Comparador();
        boolean resultadodacomparação = comparadorDeNumero.maiorQue(55,45);
        System.out.println(resultadodacomparação);
    }
}
