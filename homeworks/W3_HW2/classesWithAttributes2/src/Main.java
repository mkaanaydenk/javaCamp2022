public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Gaming laptop", 23.000, 9, "Siyah");
        /*
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Gaming laptop");
        product.setRenk("Siyah");
        product.setPrice(23.000);
        product.setStockAmount(9);
        */

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }
}
