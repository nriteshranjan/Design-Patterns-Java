package Structural.Facade;

import java.sql.Connection;

public class ProductUtil {
    Connection con;

    public ProductUtil(Connection con) {
        super();
        this.con = con;
    }

    public int getQuantity(int itemCode) {
        // gets value from database
//        return 345;
        return 195;
    }

    public int getMinLevel(int itemCode) { // threshold to refill the inventory
        // gets value from database
        return 200;
    }

}
