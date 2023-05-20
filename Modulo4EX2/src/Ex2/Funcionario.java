package Ex2;

import java.time.LocalDate;
import java.util.Scanner;

public class Funcionario {
    Scanner ler = new Scanner(System.in);
    int identificador;
    private String nome;
    private double salario;
    private LocalDate dataEmissao;
    private static double identficador= 01;
  public Funcionario(String nome,double salario){
      this.nome=nome;
      this.identificador= (int) identficador++;
      this.dataEmissao=dataEmissao;
      this.salario=salario;
  }

    public int getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        if (salario >= 700.00){
            this.salario=salario;
        } else {
            System.out.println("O salário tem que ser acima de R$700,00");
        }
    }

    public double getSalario() {
        return salario;
    }
}