package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDAOImpl;
import com.example.layeredarchitecture.dao.sqlUtil;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {

    ItemDAO itemDAO = new ItemDAOImpl();
    @Override

    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.getAll();
    }
 @Override

    public boolean delete(String code) throws SQLException, ClassNotFoundException {
        //ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.delete(code);

    }

    @Override
    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.add(dto);
    }

    @Override

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.update(dto);
    }

    @Override
    public boolean exist(String code) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.exist(code);
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.generateNewID();
    }

    @Override
    public ItemDTO search(String code) throws SQLException, ClassNotFoundException {
       // ItemDAO itemDAO = new ItemDAOImpl();
        return itemDAO.search(code);

    }
}
