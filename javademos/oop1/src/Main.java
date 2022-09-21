public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        //Set
        product1.setName("HP Pavililon Gaming Notebook");
        product1.setUnitPrice(13.700);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("efvuh87rorj309.jpg");

        //get
        //System.out.println(product1.name);


        Product product2 = new Product();
        //Set
        product2.setName("Asus ROG Gaming Notebook");
        product2.setUnitPrice(17.800);
        product2.setDiscount(4);
        product2.setUnitsInStock(5);
        product2.setImageUrl("okukumefvuh87rorj309.jpg");

        Product product3 = new Product();
        //Set
        product3.setName("Monster Abra Gaming Notebook");
        product3.setUnitPrice(11.200);
        product3.setDiscount(12);
        product3.setUnitsInStock(9);
        product3.setImageUrl("aavbaefvuh8799rorj309.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05422225555");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Mehmet");
        individualCustomer.setLastName("Aydenk");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setTaxNumber("1234567891011");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }

}
