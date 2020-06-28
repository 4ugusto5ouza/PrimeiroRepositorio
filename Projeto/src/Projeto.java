public class Projeto {
    private String nome;
    private double custoHora;
    private int horas;
    
    public Projeto(String nomeObj) {
        this.nome = nomeObj;
        this.custoHora = 10.5; 
    }

    public Projeto(String nomeObj, double custoHoraObj) {
        this.nome = nomeObj;
        this.custoHora = custoHoraObj;
    }

    public void registrarHoras(int qntHorasObj) {
        this.horas += qntHorasObj;
    }
    
    public double getCustoAtual() {
        return this.horas * this.custoHora;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCustoHora() {
        return this.custoHora;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setNome(String nomeObj) { 
        if (nomeObj.trim().equals("")) {
            System.out.println("Informe um nome válido!");            
        } else {
            this.nome = nomeObj.trim();
        }
    }    

    public void setCustoHora(double custoHoraObj) {
        if (custoHoraObj > 0) {
            this.custoHora = custoHoraObj;
        } else {
            System.out.println("Informe um valor maior que ZERO!");
        }
    }

}