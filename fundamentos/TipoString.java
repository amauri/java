package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá povo".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!!!"));
        System.out.println(s + "!!!!!");

        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde"));

        System.out.println(s.equals("boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));


        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 22;
        var salario = 12345.987;

        System.out.println("");
        System.out.println("Nome: " + nome + "\nSobrenome: "
                        + sobrenome + "\nidade: " + idade +
                        "\nSalario: " + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);

        System.out.println("");
        String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("");
        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 8));
    }
}
