package in.nabin;

import in.nabin.entity.Product;
import in.nabin.manager.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductInventoryApplication implements CommandLineRunner
{

    @Autowired
    private ProductDAO productDAO;

    public static void main(String[] args)
    {
        SpringApplication.run(ProductInventoryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {

//        Product product = new Product();
//        product.setId(1);
//        product.setName("Headphone");
//        product.setPrice(4999.99);
//        product.setQuantity(1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Airpods");
        product2.setPrice(3999.99);
        product2.setQuantity(2);


       boolean status = productDAO.InsertProduct(product2);

       if(status)
       {
           System.out.println("Product Inserted Successfully ");
       }
       else
       {
           System.out.println("Product Insertion Failed ");
       }

    }
}
