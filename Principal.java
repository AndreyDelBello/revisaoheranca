public class Principal {
    public static void main(String[] args) {
        
        Empregado empregado = new Empregado();
        empregado.setNome("AnaBelle");
        empregado.setEndereco("Pompeia");
        empregado.setTelefone("ZZZ");
        empregado.setSalario(1800);

        Empregado empregado2=new Empregado();
        empregado2.setNome("Andrey");
        empregado2.setEndereco("Pompeia");
        empregado2.setTelefone("14997884295");
        empregado2.setSalario(1500);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereco: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Salario: " + empregado.getSalario());

        System.out.println("Nome: " + empregado2.getNome());
        System.out.println("Endereco: " + empregado2.getEndereco());
        System.out.println("Telefone: " + empregado2.getTelefone());
        System.out.println("Salario: " + empregado2.getSalario());
    }
    
}
