package fundamentos;


public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia X";

        s = s.replace("X", "Senhora");
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);

        s = s.concat("!!!!");
        System.out.println(s);

        String x = "Amauri".toUpperCase();
        System.out.println(x);

        // quebra de linha pode ser antes ou depois do ponto.
        // pode-se usar varios metodos em sequencia, desde que o retorno seja uma string.
        String y = "Bom dia X"
                .replace("X", "Blah")
                .toUpperCase();
        System.out.println(y);

        // Tipos primitivos não tem o operador "."
        //int a = 3;
        //a. -> não aparece nenhum método para ser usado.
    }
}
