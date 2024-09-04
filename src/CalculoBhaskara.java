import java.util.Scanner;

public class CalculoBhaskara {
    //ATRIBUTOS
    private int valorA;
    private int valorB;
    private int valorC;

    //MÉTODO CONSTRUTOR
    public CalculoBhaskara (int valorA, int valorB, int valorC) {
        this.setValorA(valorA);
        this.setValorB(valorB);
        this.setValorC(valorC);
    }

    //MÉTODO PARA FAZER O CÁLCULO COM OS PARÂMETROS DO CONSTRUTOR
    public void resultadoConstrutor(){
        double calculoDelta = (Math.pow(this.getValorB(),2)) - 4 * this.getValorA() * this.getValorC();
        double bhaskaraX1 = (-this.getValorB() + Math.sqrt(calculoDelta)) / (2 * this.getValorA());
        double bhaskaraX2 = (-this.getValorB() - Math.sqrt(calculoDelta)) / (2 * this.getValorA());

        if (calculoDelta < 0){
            System.out.println("Não é possível calcular o Bhaskara! Equação não possuí" +
                    " raízes reais.");
        }else if (calculoDelta == 0){
            System.out.println("O Delta é 0, equação tem duas raízes reais e iguais.");
        }else {
            System.out.println("Valor de Bhaskara X1 = " + bhaskaraX1);
            System.out.println("Valor de Bhaskara X2 = " + bhaskaraX2);
        }
    }

    //MÉTODO PARA FAZER O CÁLCULO COM INTERAÇÃO REUTILIZANDO O MÉTODO resultadoConstrutor();
    public void resultadoInteracao(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para A:");
        this.setValorA(entrada.nextInt());
        System.out.println("Digite um valor inteiro para B:");
        this.setValorB(entrada.nextInt());
        System.out.println("Digite um valor inteiro para C:");
        this.setValorC(entrada.nextInt());

        resultadoConstrutor();
    }

    //MÉTODOS GETTER E SETTER
    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    public int getValorC() {
        return valorC;
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
    }
}
