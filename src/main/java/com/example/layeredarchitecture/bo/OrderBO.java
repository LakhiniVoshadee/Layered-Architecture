package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBO {
    public String generateNewID() throws SQLException, ClassNotFoundException ;

    public boolean delete(String id) throws SQLException, ClassNotFoundException;


    public OrderDTO search(String id) throws SQLException, ClassNotFoundException ;


    public boolean exist(String orderId) throws SQLException, ClassNotFoundException ;


    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException ;

    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException ;


    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException ;


}


