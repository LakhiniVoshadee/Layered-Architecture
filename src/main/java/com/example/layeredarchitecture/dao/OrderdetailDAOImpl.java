package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderdetailDAOImpl implements OrderdetailDAO {
    @Override
    public boolean saveOrderDetails(OrderDetailDTO details, String orderId) throws SQLException, ClassNotFoundException {
        Connection connection=DBConnection.getDbConnection().getConnection();
       PreparedStatement stm = connection.prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        stm.setString(1, orderId);
        stm.setString(2, details.getItemCode());
        stm.setBigDecimal(3, details.getUnitPrice());
        stm.setInt(4, details.getQty());
        return false;
    }
   @Override
    public boolean saveOrderDetails(List<OrderDetailDTO> orderDetails, String orderId) throws SQLException, ClassNotFoundException {
        for (OrderDetailDTO detail : orderDetails) {
            if (!saveOrderDetails(detail, orderId)) {
                return false;
            }
        }
        return true;
    }
}
