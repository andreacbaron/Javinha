import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine(); //e aqui que usuario tem que colocar o valor

        System.out.println("Qual sua iadade?");
        int idade = entrada.nextInt(); //colocar um valor inteira tipo

        System.out.println("Qual sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual sua peso (kg)?");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);


        System.out.println("Hola meu nome e " + nome + " eu tenho " + idade + "anos!");
        System.out.println("Este e o seu IMC = " + imc);
        System.out.printf("Este e o meu IMC = %.2f\n", imc);
        System.out.printf("Ola, meu nome e %s e tenho %d anos!", nome, idade);

        if (imc < 17 && imc <= 18.49) {
            System.out.print("voce estamuito abaixo do peso");
        } else if (imc >= 18.5 && imc <= 18.49) {
            System.out.println("Voce esta abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Seu peso esta normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Acima do peso");
        } else if (imc >= 30 && imc <= 34.99) {
            System.out.println("Obesidade I");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade II");
        } else if (imc >= 35 && imc <= 39.99) {
            System.out.println("Obesidade III");

        }

        System.out.println("Selecione uma opcao");
        System.out.println("1- agua");
        System.out.println("2-fruta");
        System.out.println("3-batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Voce escolheu a dieta de agua");
                break;
            case 2:
                System.out.println("Voce escolheu a dieta da fruta");
                break;
            case 3:
                System.out.println("Voce escolheu a dieta da batata");
                break;
            default:
                System.out.println("Esta dieta nao existe");
        }
        System.out.println("Voce tem quanto alimento preferido?");
        int totalAlimentos = entrada.nextInt();

        for (int i = 0; i < totalAlimentos; i++) {
            System.out.println(i);


        }

    }
}
