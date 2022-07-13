public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario funcionario) {
        this.soma += funcionario.getBonificacao();
    }

    //teste
    public double getSoma() {
        return soma;
    }
}
