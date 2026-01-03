package in.nabin.mapper;

import in.nabin.entity.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class ProductRowMapper implements RowMapper<Product>
   {
       @Override
       public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
           Product product= new Product();
           product.setId(Integer.parseInt(rs.getString("id")));
           product.setName(rs.getString("name"));
           product.setPrice(Double.parseDouble(rs.getString("price")));
           product.setPrice(Integer.parseInt(rs.getString("quantity")));
           return product;
       }
   }

