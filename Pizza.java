package pizzariadaclau;

public class Pizza {

    private String sabor;
    private String borda;
    private String preco;
    private String azeitona;
    private String formato;
    private int id;
    private int[] pizzasid = new int[5];

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
        return this.id;
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
