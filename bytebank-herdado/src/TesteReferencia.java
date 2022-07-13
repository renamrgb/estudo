public class TesteReferencia {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Renam");
        g1.setSalario(5000L);
        System.out.println(g1.getNome());

        Funcionario f1 = new Funcionario();
        f1.setSalario(2000L);

        EditorVideo e1 = new EditorVideo();
        e1.setSalario(2500L);

        Designer d1 = new Designer();
        e1.setSalario(2000L);

        ControleBonificacao controleBonificacao = new ControleBonificacao();

        controleBonificacao.registra(g1);
        controleBonificacao.registra(f1);
        controleBonificacao.registra(e1);
        controleBonificacao.registra(d1);

        System.out.println(controleBonificacao.getSoma());


    }
}
