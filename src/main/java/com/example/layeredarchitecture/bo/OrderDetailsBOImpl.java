package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.OrderDetailsDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDetailsDAOImpl;
import com.example.layeredarchitecture.dao.sqlUtil;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsBOImpl implements OrderDetailsBO {
     OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();

    @Override
    public ArrayList<OrderDetailDTO> getAll() throws SQLException, ClassNotFoundException {
      // OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
       return orderDetailsDAO.getAll();
    }

    @Override
    public boolean add(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
       // OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
        return orderDetailsDAO.add(dto);
    }

    @Override
    public boolean update(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
       // OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
        return orderDetailsDAO.update(dto);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException{
       // OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
        return orderDetailsDAO.exist(id);
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
      //  OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
        return orderDetailsDAO.generateNewID();
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
       // OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
        return orderDetailsDAO.delete(id);
    }

    @Override
    public OrderDetailDTO search(String id) throws SQLException, ClassNotFoundException {
      //  OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAOImpl();
        return orderDetailsDAO.search(id);
    }


}

