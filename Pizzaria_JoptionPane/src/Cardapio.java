import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Pizza> cardapio;
    public Cardapio(){
        preencherCardapio();
    }
    public ArrayList<Pizza> getCardapio() {
        return cardapio;
    }

    public void setCardapio(ArrayList<Pizza> cardapio) {
        this.cardapio = cardapio;
    }
    private void preencherCardapio(){
        this.cardapio = new ArrayList<>();
        cardapio.add(new Pizza(1, 23.99, "Pizza de Peperone"));
        cardapio.add(new Pizza(2, 23.99, "Pizza de Quatro Queijos"));
        cardapio.add(new Pizza(3, 23.99, "Pizza de Frango com Catupiry"));
        cardapio.add(new Pizza(4, 23.99, "Pizza de Queijo com Bacon"));
        cardapio.add(new Pizza(5, 23.99, "Pizza de Portuguesa"));
        cardapio.add(new Pizza(6, 23.99, "Pizza A Moda da Casa"));
        cardapio.add(new Pizza(7, 23.99, "Pizza de Queijo com Palmito"));
        cardapio.add(new Pizza(8, 23.99, "Pizza de Dois Queijos"));
        cardapio.add(new Pizza(9, 23.99, "Pizza de Escarola"));
        cardapio.add(new Pizza(10, 29.99, "Pizza Especial"));
    }
    public String getCardapioFormatado(){
        StringBuilder cardapioFormatado = new StringBuilder();
        for (int i = 0; i < cardapio.size(); i++) {
            cardapioFormatado
                    .append(cardapio.get(i).getId())
                    .append(".")
                    .append(cardapio.get(i).getNome())
                    .append("-")
                    .append(cardapio.get(i).getValor())
                    .append("R$\n");
        }
        return cardapioFormatado.toString();
    }


}
