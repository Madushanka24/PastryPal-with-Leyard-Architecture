package lk.ijse.PastryPal.Entity;

import lk.ijse.PastryPal.dto.tm.OrderTm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    private String product_id;
    private String description;
    private int qty;
    private double price;

}
