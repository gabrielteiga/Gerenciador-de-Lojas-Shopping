public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(float salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    @Override
    public String toString() {
        return "Loja: " + this.getNome() +
        "\nQuant. Funcionarios: " + this.getQuantidadeFuncionarios() +
        "\nSal. Base: " + this.getSalarioBaseFuncionario();
    }

    public double gastosComSalario(){
        if(this.getSalarioBaseFuncionario() == -1){
            return -1;
        }
        double gastosComSalario = this.gastosComSalario() * this.quantidadeFuncionarios;
        return gastosComSalario;
    }

    public char tamanhoDaLoja(){
        if(this.getQuantidadeFuncionarios() < 10){
            return 'P';
        } else if(this.getQuantidadeFuncionarios() >= 10 && this.getQuantidadeFuncionarios() <= 30){
            return 'M';
        } else{
            return 'G';
        }
    }
}
