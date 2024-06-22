package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.dao.sqlUtil;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO{

    CustomerDAO customerDAO = new CustomerDAOImpl();

   @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
         return  customerDAO.getAll();
    }

   @Override
    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
     // CustomerDAO customerDAO = new CustomerDAOImpl();

       ////logic
      return customerDAO.add(dto);

    }
    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.update(dto);
    }

    @Override
    public boolean exist(String id) throws SQLException, ClassNotFoundException {
       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.exist(id);

    }

    @Override

    public String generateNewID() throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.generateNewID();
    }


    @Override

    public boolean delete(String id) throws SQLException, ClassNotFoundException {

       // CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.delete(id);

    }

    @Override

    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
      //  CustomerDAO customerDAO = new CustomerDAOImpl();
        return customerDAO.search(id);

}
}