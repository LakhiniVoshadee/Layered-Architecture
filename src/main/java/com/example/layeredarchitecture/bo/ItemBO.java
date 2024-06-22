package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBO {
    public ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException ;


    public boolean delete(String code) throws SQLException, ClassNotFoundException ;

    public boolean add(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean update(ItemDTO dto) throws SQLException, ClassNotFoundException ;

    public boolean exist(String code) throws SQLException, ClassNotFoundException ;

    public String generateNewID() throws SQLException, ClassNotFoundException ;

    public ItemDTO search(String code) throws SQLException, ClassNotFoundException ;
}

