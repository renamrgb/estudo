public class EditorVideo extends Funcionario {

    private final double BONIFICACAO = 100l;


    @Override
    public double getBonificacao() {
        return super.getBonificacao() + BONIFICACAO;
    }

}
