public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1, "HP Pavilion Gaming", "Gaming Laptop", 13.000, 17);
        /*
        product1.setId(1);
        product1.setName("HP Pavilion Gaming");
        product1.setDescription("Gaming Laptop");
        product1.setPrice(13.000);
        product1.setStockAmount(17);
        */

        ProductManager productManager = new ProductManager();
        productManager.Add(product1);
        System.out.println(product1.getKod());

    }

}
