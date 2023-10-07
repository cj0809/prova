package aberturaConta;
public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setId(1);
        conta1.setDataAbertura("01/01/2023");
        conta1.setSenha("senha123");
        conta1.setSaldo(1000.0);

        Conta conta2 = new Conta();
        conta2.setId(2);
        conta2.setDataAbertura("02/01/2023");
        conta2.setSenha("senha456");
        conta2.setSaldo(2000.0);

        Pessoa pessoa1 = new Pessoa("João");
        pessoa1.setId(101);
        pessoa1.setCpf("123.456.789-00");
        pessoa1.setTelefone("(11) 99999-8888");

        Pessoa pessoa2 = new Pessoa("Maria");
        pessoa2.setId(102);
        pessoa2.setCpf("987.654.321-00");
        pessoa2.setTelefone("(11) 77777-6666");


        pessoa1.getContaList().add(conta1);
        pessoa2.getContaList().add(conta2);


        System.out.println("Informações de Pessoa 1:");
        System.out.println(pessoa1);

        System.out.println("\nContas de Pessoa 1:");
        for (Conta conta : pessoa1.getContaList()) {
            System.out.println(conta);
        }

        System.out.println("\nInformações de Pessoa 2:");
        System.out.println(pessoa2);

        System.out.println("\nContas de Pessoa 2:");
        for (Conta conta : pessoa2.getContaList()) {
            System.out.println(conta);
        }
    }
}


