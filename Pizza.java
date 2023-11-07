package pizzariadaclau;

public class Pizza {

    protected String sabor;
    protected String borda;
    protected String preco;
    protected String azeitona;
    protected String formato;
    protected int id;
    protected int[] pizzasid = new int[5];

    @Override
    public String toString(){
        return "PIZZA DE " + sabor + "\n" + borda + "\n" + azeitona + "\nformato de " + formato + "\nCUSTA " + preco + " reais"
                + "\nID: " + id;
    }
    
    public Pizza(){}
    
    public Pizza(String sabor, String borda, String preco, String azeitona, String formato){
        this.setSabor(sabor);
        this.setBorda(borda);
        this.setPreco(preco);
        this.setAzeitona(azeitona);
        this.setFormato(formato);
    }
    
// setters e getters
    
    public String getSabor() {
        return sabor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public String getBorda() {
        return borda;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getAzeitona() {
        return azeitona;
    }

    public void setAzeitona(String azeitona) {
        this.azeitona = azeitona;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getPizzas() {
        return pizzasid;
    }

    public void setPizzas(int[] pizzasid) {
        this.pizzasid = pizzasid;
    }
}
