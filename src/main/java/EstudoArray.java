public class EstudoArray {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length);
        numeros[3] = 1000;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("A posicao " + i + "como valor de " + numeros[i]);
        }
        int[] numeros2 = new int[50];
        numeros2[1];
        numeros2[2];
    }

}
