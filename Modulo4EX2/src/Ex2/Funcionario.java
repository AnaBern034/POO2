package Ex2;

import java.util.Scanner;

public class Funcionario {
    Scanner ler = new Scanner(System.in);
    int identificador;
    private String nome;
    private double salario,dataEmissao;
    private static double identficador= 0000000001;
  public Funcionario(String nome,double dataEmissao,double salario){
      this.nome=nome;
      this.identificador= (int) identficador++;
      this.dataEmissao=dataEmissao;
      this.salario=salario;
  }

    public void setIdentificador(int identificador) {
        this.identificador = 001;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        System.out.println(" Digite o seu nome: ");
        nome = ler.next();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getDataEmissao() {
        System.out.println(" Digite a data da sua emissão: ");
        return dataEmissao;
    }

    public double getSalario() {
        System.out.println(" ");
        return salario;
    }
}