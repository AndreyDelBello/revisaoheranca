public class Principal {
    public static void main(String[] args) {
        
        Empregado empregado = new Empregado();
        empregado.setNome("AnaBelle");
        empregado.setEndereco("Pompeia");
        empregado.setTelefone("14998989898");
        empregado.setSalario(1800);

        Empregado empregado2=new Empregado();
        empregado2.setNome("Andrey");
        empregado2.setEndereco("Pompeia");
        empregado2.setTelefone("14997884295");
        empregado2.setSalario(1500);

        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());

        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario());
    }
    
}
