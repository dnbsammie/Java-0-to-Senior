package Modulo3.Clase04;

public class Product {
    private String name;
    private Integer stock;
    private Double price;
    
    public Product(String name, Integer stock, Double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", stock=" + stock + ", price=" + price + '}';
    }
    
}