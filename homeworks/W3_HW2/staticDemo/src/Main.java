public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name = "Fiat";
        product.id = 1;
        product.price = 310.000;

        manager.add(product);

        DatabaseHelper.Connection.createConnection();

    }
}
