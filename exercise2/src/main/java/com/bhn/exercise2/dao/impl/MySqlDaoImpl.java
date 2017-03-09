package com.bhn.exercise2.dao.impl;

import com.bhn.exercise2.dao.DAO;
import com.bhn.exercise2.entity.BaseEntity;

import java.sql.Connection;
import java.util.List;

/**
 * Created by djeremias on 3/7/17.
 */
public class MySqlDaoImpl implements DAO {

    private Connection connection;

    public MySqlDaoImpl() {
        //TODO: instantiate the mysql connection..
    }

    public BaseEntity createData(BaseEntity baseEntity) {
        System.out.println("inside createData() of mysql driver dao");
        return null;
    }


    public BaseEntity fetchDataById(Long id) {
        System.out.println("inside fetchDataById() of mysql driver dao");
        return null;
    }

    public List<BaseEntity> searchData(String name, String description) {
        System.out.println("inside searchData() of mysql driver dao");
        return null;
    }
}
