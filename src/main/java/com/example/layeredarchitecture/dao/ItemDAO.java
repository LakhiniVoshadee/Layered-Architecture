package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;
import javafx.scene.control.TextField;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public interface ItemDAO {


    public ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException ;

    public void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException ;


    public void updateItem(String description, String code, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException ;

    public void deleteItem(String code) throws SQLException, ClassNotFoundException ;


    public ResultSet generateItemId(TextField txtCode) throws SQLException, ClassNotFoundException ;


    public boolean existItemID(String code) throws SQLException, ClassNotFoundException;


    public ResultSet findItem(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean updateItemQTY(List<OrderDetailDTO> orderDetails, ItemDTO item) throws SQLException, ClassNotFoundException ;


    public boolean updateItemQty(OrderDetailDTO orderDetail, ItemDTO item) throws SQLException, ClassNotFoundException ;


}
