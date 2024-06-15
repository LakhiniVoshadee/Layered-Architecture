package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;
import javafx.scene.control.TextField;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> loadAllCustomers() throws SQLException, ClassNotFoundException ;

    public void saveCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException ;

    public void updateCustomer(String id, String name, String address) throws SQLException, ClassNotFoundException ;

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException ;

    public ResultSet generateCustomerID(TextField txtCustomerId) throws SQLException, ClassNotFoundException ;

    public boolean existCustomerID(String id) throws SQLException, ClassNotFoundException ;

    public ResultSet searchCustomer(String newValue) throws SQLException, ClassNotFoundException ;
}
