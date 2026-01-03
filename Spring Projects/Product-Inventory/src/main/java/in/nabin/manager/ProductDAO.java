package in.nabin.manager;


import in.nabin.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean InsertProduct(Product product)
    {
        boolean status = false;

        try
        {
            String INSERT_SQL_QUERY = "INSERT INTO PRODUCT (id,name,price,quantity) VALUES (?,?,?,?)";
            int count = jdbcTemplate.update(INSERT_SQL_QUERY, product.getId(), product.getName(), product.getPrice(), product.getQuantity());

            if (count > 0)
            {
                status = true;
            }
            else
            {
                status = false;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return status;
    }

}
