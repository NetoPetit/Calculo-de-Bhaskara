
public class Main {
    public static void main(String[] args) {
        //INSTANCIANDO COM PARÂMETROS PELO CONSTRUTOR
        CalculoBhaskara calculo = new CalculoBhaskara(0,0,0);

        //CALCULANDO COM OS PARÂMETROS DO CONSTRUTOR
        System.out.println("======CONSTRUTOR======");
        calculo.resultadoConstrutor();
        //CALCULANDO COM A INTERAÇÃO DO USUÁRIO
        System.out.println("======USUÁRIO======");
        calculo.resultadoInteracao();

    }
}