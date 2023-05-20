package Ex1;

public class Azul {
    static  int cor;
    double valor;

    //tirei a String nome
   public double tonalidade;

    public Azul(int tonalidade) { // Resposta (E)
        this.tonalidade=tonalidade;
    }

    public double getTonalidade() {
        return tonalidade;
    }
    public void setTonalidade() { // Resposta (D)
        this.tonalidade=tonalidade;
    }

    public static int setCor() { // tonarMaisEscuro
        Azul.cor = 1;
        return cor;
    }

    public double calculoCor(){
        double calculo;
        calculo = setCor()+ getTonalidade();
        return  calculo;
    }
    public double calcularTonalidade() {
        tonalidade = calculoCor() + TornarTonalidadeMaisEscura();
        return tonalidade;

    }
    private double TornarTonalidadeMaisEscura() {
        valor = 0.1;
        return valor;
    }
}

