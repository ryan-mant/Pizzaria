import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Marcelo");
        Cardapio cardapio = new Cardapio();

        boolean inserirMaisProdutos = true;
        boolean removerPizza = true;

        while (inserirMaisProdutos){
            String resposta = JOptionPane.showInputDialog("Digite o id da Pizza que deseja adicionar à sacola\n\n" + cardapio.getCardapioFormatado() + "\n");
            int indicePizzaEscolhida = Integer.parseInt(resposta) - 1;

            Pizza pizza = cardapio.getCardapio().get(indicePizzaEscolhida);
            cliente.adicionarPizzaNaSacola(pizza);

            String repetirProcesso = JOptionPane.showInputDialog("Deseja inserir mais pizzas na sacola? [s]sim, [n]não");
            if (!repetirProcesso.equals("s")){
                inserirMaisProdutos = false;
            }
        }
        while (removerPizza){
            String removerPizzaDaSacola = JOptionPane.showInputDialog("Deseja remover algum item da sacola?[s]sim, [n]não");
            if (removerPizzaDaSacola.equals("s")){
                String resposta = JOptionPane.showInputDialog("Digite o id da Pizza que deseja remover da sacola\n\n" + cardapio.getCardapioFormatado() + "\n");
                int indicePizzaEscolhida = Integer.parseInt(resposta) - 1;
                Pizza pizza = cardapio.getCardapio().get(indicePizzaEscolhida);
                cliente.removerDaSacola(pizza.getId());
            }
            else {
                removerPizza = false;
            }
        }
        JOptionPane.showMessageDialog(null, "O valor total é de: " + cliente.getValorCompraFormatado() + "R$");
    }
}