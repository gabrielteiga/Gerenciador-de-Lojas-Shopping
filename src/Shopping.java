public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        String informacoesLojas = "\n--- Lojas ---";
        for(int i = 0; i < this.getLojas().length; i++){
            if(this.getLojas()[i] != null){
                informacoesLojas = informacoesLojas + "\n** Loja " + (i+1) + " **\n" + this.getLojas()[i].toString() + "\n";
            }
        }
        return "Shopping " + this.getNome().toUpperCase() +
            "\n\n--- Endereço ---\n" + this.getEndereco() +
            "\n" + informacoesLojas;
    }

    public boolean insereLoja(Loja loja){
        if(this.getLojas() != null){
            for(int i=0; i < this.getLojas().length; i++){
                if(this.getLojas()[i] == null){
                    this.getLojas()[i] = loja;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        if(this.getLojas() != null){
            for(int i=0; i<this.getLojas().length; i++){
                if (this.getLojas()[i] != null && this.getLojas()[i].getNome().equalsIgnoreCase(nomeLoja)) {   
                        this.getLojas()[i] = null;
                        return true;
                    }
                }
            }
        return false;
    }


    public int quantidadeLojasPorTipo(String tipoDeLoja){
        Class<?> c;
        if (tipoDeLoja == "Cosmetico") {
            c = Cosmetico.class;
            return this.contadorClasse(c);
        } else if (tipoDeLoja == "Vestuario") {
            c = Vestuario.class;
            return this.contadorClasse(c);
        } else if (tipoDeLoja == "Bijuteria") {
            c = Bijuteria.class;
            return this.contadorClasse(c);
        } else if (tipoDeLoja == "Alimentacao"){
            c = Alimentacao.class;
            return this.contadorClasse(c);
        } else if (tipoDeLoja == "Informatica"){
            c = Informatica.class;
            return this.contadorClasse(c);
        } else{
            return -1;
        }
    }

    private int contadorClasse(Class<?> loja){
        int contador = 0;
        for(Object obj : this.getLojas()){
            if(loja.isInstance(obj)){
                contador++;
            }
        }
        return contador;
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaSeguroMaisCaro = null;
        if(this.getLojas() != null){
            for (Loja loja : lojas) {
                if (loja instanceof Informatica){
                    Informatica lojaInformatica = (Informatica) loja;
                    if (lojaSeguroMaisCaro == null || lojaSeguroMaisCaro.getSeguroEletronicos() < lojaInformatica.getSeguroEletronicos()){
                        lojaSeguroMaisCaro = lojaInformatica;
                    }
                }
            }            
        }
        return lojaSeguroMaisCaro;
    }

}
