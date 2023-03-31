import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){



        //obj - criamos assim quando os valores forem pré definidos
        //Produto produto1 = new Produto("ervilha" , 5.50);

        //obj oficial, que a pessoa add.
        Produto produto;


        boolean encerrar = false;
        String nome = "";
        double valor = 0;
        double total = 0; //aqui seria a variavel que vai guardar os valores

        //Faça (DO) / enquato(while)
        do {


            nome = JOptionPane.showInputDialog("Nome Produto");

            System.out.println("Digite o valou do produto [apenas números]");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
            //esse Double.parseDouble serve para transformar a sring em double, por causa do valor.

            produto = new Produto(nome, valor);
            System.out.println(produto);
            total = total + produto.getValor();//aqui está pegando o valor do 1 produto e add na variavel valor.

                int opcao = Integer.parseInt(JOptionPane.showInputDialog("Deseja mais alguma coisa? " +
                                                                            "[1] = SIM" +
                                                                            " [0] = NÃO "));
                encerrar = opcao == 1 ? false : true;



        }while (encerrar == false);

        System.out.println("TOTAL DA COMPRA: " + total);




    }
}
