import java.text.DecimalFormat;

public class Cliente {
    private String nome;
    private int id;
    private Sacola sacola;

    public Cliente(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.sacola = new Sacola(id);
    }

    public void adicionarPizzaNaSacola(Pizza pizza){
        sacola.adicionarNaSacola(pizza);
    }
    public void removerDaSacola(int id){
        sacola.removerDaSacola(id);
    }

    public String getValorCompraFormatado(){
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
        return decimalFormat.format(sacola.getValorTotal());
    }
}
