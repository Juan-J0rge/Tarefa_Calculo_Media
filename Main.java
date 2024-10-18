//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculoMedia calculo = new CalculoMedia();
        calculo.setNota1(7);
        calculo.setNota2(1);
        calculo.setNota3(5);
        calculo.setNota4(9);

        System.out.println("Sua primeira nota é: " + calculo.getNota1());
        System.out.println("Sua segunda nota é: " + calculo.getNota2());
        System.out.println("Sua terceira nota é: " + calculo.getNota3());
        System.out.println("Sua quarta nota é: " + calculo.getNota4());

        double mediaFinal = calculo.calcularMedia();
        System.out.println("A media das suas notas é " + mediaFinal);
    }
}