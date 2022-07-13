public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionaro = new Funcionario();
        funcionaro.setNome("Renam");
        funcionaro.setCpf("43979966879");
        funcionaro.setSalario(3000);

        System.out.println(funcionaro.toString());
    }
}
