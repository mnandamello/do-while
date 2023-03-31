public class Produto {

    //o private serve para as pessoas terem acesso só ao valor (encapsulamento)
    private String nome;
    private double valor;





    //aqui ele só está jogando um produto na memória, pois está vazio, só abrimos quando não sabemos
    //o que vamos ter
    public Produto() {
    }

    //Essa está completa, só abrimos quando a gente sá sabe o que vamos colocar, usado para pré definir
    //um obj.
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }






    //O get é pra pegar o valor
    // o jeito mais conhecido de escrever é o q começa com get+nome da variavel com letra maisucula
    public String getNome() {
        return nome;
    }

    //O set é para mudar o valor e retornar ou n
    public void setNome(String nome) {
        this.nome = nome;
    }

    //VALOR
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //aqui é para tranformar tudo em string, ou seja vai aparecer tudo em texto p/ o USUARIO
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
