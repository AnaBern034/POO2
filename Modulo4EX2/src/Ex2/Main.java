package Ex2;

public class Main {
    public static void main(String[] args) {
      Funcionario funcionario1= new Funcionario("marcia",11.11/11, 12000);
       funcionario1.setNome(funcionario1.getNome());
        System.out.println("ID "+funcionario1.getIdentificador()+" nome: "+funcionario1.getNome());


    }
}


    /*  Funcionario funcionario2=new Funcionario("Juliana",15/11/2002,1.200);
        System.out.print("ID "+funcionario2.getIdentificador());
        System.out.print(" "+"NOME: "+funcionario2.getNome());
        System.out.print(" "+funcionario2.getDataEmissao()+"/");
        System.out.println(" "+funcionario2.getSalario());


      Funcionario funcionario3 = new Funcionario("Gabriela",12/11/2002,1.200);
        System.out.print("ID "+funcionario3.getIdentificador());
        System.out.print(" "+funcionario3.getNome());
        System.out.print(" "+funcionario3.getDataEmissao()+"/");
        System.out.println(" "+funcionario3.getSalario());


    }
} */