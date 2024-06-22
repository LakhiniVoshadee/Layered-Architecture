package com.example.layeredarchitecture.dao.custom.impl;


import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.sqlUtil;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
       /* Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();*/
        ResultSet rst= sqlUtil.execute("SELECT * FROM Customer");

        while (rst.next()) {
            allCustomers.add(new CustomerDTO(rst.getString("id"), rst.getString("name"), rst.getString("address")));
           // allCustomers.add(customerDTO);
        }
        return allCustomers;
    }


    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return sqlUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
    }

    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
       return sqlUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());
    }

    public boolean exist(String id) throws SQLException, ClassNotFoundException {

        ResultSet resultSet=sqlUtil.execute("SELECT id FROM Customer WHERE id=?",id);
        return resultSet.next();
    }


    public String generateNewID() throws SQLException, ClassNotFoundException {
       // Connection connection = DBConnection.getDbConnection().getConnection();
        ResultSet rst = sqlUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }



    public boolean delete(String id) throws SQLException, ClassNotFoundException {
     return sqlUtil.execute("DELETE FROM Customer WHERE id=?",id);

    }


    public CustomerDTO search(String id) throws SQLException, ClassNotFoundException {
        ResultSet rst = sqlUtil.execute("SELECT * FROM Customer WHERE id=?",id);
       /* pstm.setString(1,id+"");
        ResultSet rst=pstm.executeQuery();*/
        rst.next();
        return new CustomerDTO(id+"",rst.getString("name"),rst.getString("address"));
       // resultSet.next();
       // return null;
    }

    @Override
    public void countOfCustomers() {
        
    }
}
