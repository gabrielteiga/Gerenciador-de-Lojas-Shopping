public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data fundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = fundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data fundacao){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = fundacao;
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
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
        return "Loja: " + this.getNome() +
        "\nQuant. Funcionarios: " + this.getQuantidadeFuncionarios() +
        "\nSal. Base: " + this.getSalarioBaseFuncionario() +
        "\nEndereço: " + this.getEndereco() +
        "\nData fundação: " + this.getEndereco();
    }

    public double gastosComSalario(){
        if(this.getSalarioBaseFuncionario() == -1){
            return -1;
        } else{
        double gastosComSalario = this.salarioBaseFuncionario * this.quantidadeFuncionarios;
        return gastosComSalario;
        }
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
