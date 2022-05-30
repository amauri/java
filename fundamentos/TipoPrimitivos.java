package fundamentos;

// Tipo primitivos

// byte, short, int e long
//   1     2     4  e  8 bytes.

// double e float
//   8    e   4 bytes.

// char
// representado por aspas simples

// boolean
// false ou true(em caixa baixa)


public class TipoPrimitivos {
    public static void main(String[] args) {

        // Tipos numéricos inteiros
        byte anosEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A'; // só aceita um único caractere


        // Dias de empresa
        System.out.println(anosEmpresa * 365);
        // Número de viagens
        System.out.println(numeroDeVoos / 2);
        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? "+ estaDeFerias);


    }
}

