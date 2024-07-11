public class Operadores {
    public static void main(String[] args) {
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(-numero);
        System.out.println(numero);

        int numero_a = 5;
        numero_a++;
        System.out.println(numero_a);

        int numero_b = 5;
        numero_b--;
        System.out.println(numero_b);

        boolean variavel_a = true;
        System.out.println(!variavel_a);
        System.out.println(variavel_a);

        int a, b;
        a = 7;
        b = 3;
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        int numero_1 = 1;
        int numero_2 = 2;
        boolean simNao = numero_1 == numero_2;
        System.out.println("Numero_1 é igual ao Numero_2 " + simNao);
        simNao = numero_1 != numero_2;
        System.out.println("Numero_1 é diferente do Numero_2 " + simNao);
        simNao = numero_1 > numero_2;
        System.out.println("Numero_1 é maior que Numero_2? " + simNao);

        String nomeUm = "Rogerio";
        String nomeDois = new String("Rogerio");
        System.out.println(nomeUm.equals(nomeDois));

    }
}