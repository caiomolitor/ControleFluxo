import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        System.out.println("Digite o primeiro parâmetro:");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int segundoParametro = scanner.nextInt();
            contar(primeiroParametro, segundoParametro);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
    } finally {
            scanner.close();
        }
    }
    static void contar ( int primeiroParametro, int segundoParametro ) throws ParametrosInvalidosException {
        if (primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        for(int a = primeiroParametro; a <= segundoParametro; a++){
            System.out.println(a);
        }
    }
}

