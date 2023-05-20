package Ex1;
/*  A) Quais são as variáveis de classe?
Resposta: COR e NOME

B) Quais são os construtores?
Resposta:
public Azul(int tonalidade) { ... }
public int getTonalidade() {return tonalidade;}
public void setTonalidade(int tonalidade) { ... }

C) Quais métodos fazem parte da interface dessa classe?
Resposta: public Azul(int tonalidade) { ... }
public void tornarMaisEscuro() { ... }
void calcularTonalidade() { ... }
private void TornarTonalidadeMaisEscura(int valor) { ... }

F) Não pois o exercicio deixa explicito que sem mudar o código precisamos
apenas implentar oq foi dito, ele não funciona pq os outros metodos não estão
complementados conforme a lógica, e a main ainda não foi executada



 */
public class Main {
    public static void main(String[] args) {
         var color = new Azul(1);
        System.out.println("Exibir a tonalidade da cor Azul: "+ color.getTonalidade());
        System.out.println("Tornar a cor mais escura: "+color.calculoCor());
        System.out.println("Calcular as tonalidades: "+color.calcularTonalidade());


    }
}
