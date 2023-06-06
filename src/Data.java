public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if(this.validaData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean validaData(int dia, int mes, int ano){
        if(dia > 0 && ano >= 0){
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia <= 31){
                    return true;
                }
            } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                if(dia <= 30){
                    return true;
                }  
            } else if((mes == 2) && (ano % 4 == 0)){
                if(dia <= 29){
                    return true;
                }
            } else if(mes == 2){
                if(dia <= 28){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificaAnoBissexto(){
        return this.ano % 4 == 0;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return this.getDia() + "/" + this.getMes() + "/" + this.getAno();
    }
}
