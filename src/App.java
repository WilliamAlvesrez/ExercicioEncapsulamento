public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00);

        Cliente cliente1 = new ClienteFisico("João");
        Cliente cliente2 = new ClienteJuridico("Empresa X");

        double precoFinalPessoaFisica = produto.calcularPrecoFinal(cliente1);
        double precoFinalPessoaJuridica = produto.calcularPrecoFinal(cliente2);

        System.out.printf("Preço final para %s: %.2f%n", cliente1.getNome(), precoFinalPessoaFisica);
        System.out.printf("Preço final para %s: %.2f%n", cliente2.getNome(), precoFinalPessoaJuridica);
    }
}
