import javax.swing.*;
import java.util.ArrayList;

public class Sacola {
    private int idCliente;
    private ArrayList<Pizza> pizzas;
    private double valorTotal;

    public Sacola(int idCliente) {
        this.idCliente = idCliente;
        this.pizzas = new ArrayList<>();
    }

    public void adicionarNaSacola(Pizza pizza) {
        this.pizzas.add(pizza);
        this.valorTotal = this.valorTotal + pizza.getValor();
        JOptionPane.showMessageDialog(null, "Pizza adicionada na sacola!");
    }

    public void removerDaSacola(int id) {
        for (int i = 0; i < pizzas.size(); i++) {
            if (pizzas.get(i).getId() == id) {
                this.valorTotal = this.valorTotal - pizzas.get(i).getValor();
                JOptionPane.showMessageDialog(null, "A pizza: " + pizzas.get(i).getNome() + " foi removida com sucesso!");
                pizzas.remove(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Não foi possivel encontrar a Pizza na sacola...");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
