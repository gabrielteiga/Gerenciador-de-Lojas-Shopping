public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Produto: " + this.getNome() +
        "\nPreço: " + this.getPreco() +
        "\nData de Validade: " + this.getDataValidade() + "\n";
    }

    public boolean estaVencido(Data d1){
        if(d1.getAno() <= this.getDataValidade().getAno()){
            if (d1.getMes() <= this.getDataValidade().getMes()) {
                if (d1.getDia() <= this.getDataValidade().getDia()) {
                    return false;
                }
            }
        }
        return true;
    }
}
