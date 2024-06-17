package Structural.Facade;

import java.sql.Connection;

public class ProductFacade {
    DatabaseConnection dbc = new DatabaseConnection();
    ProductUtil util;

    public boolean isItemBelowRL(int ic) {
        Connection con = dbc.createConnection();
        util = new ProductUtil(con);
        int qty = util.getQuantity(ic);
        int rol = util.getMinLevel(ic);
        return qty < rol;
    }
}
