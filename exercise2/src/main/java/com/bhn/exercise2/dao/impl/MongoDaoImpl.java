package com.bhn.exercise2.dao.impl;

import com.bhn.exercise2.dao.DAO;
import com.bhn.exercise2.entity.BaseEntity;

import java.sql.Connection;
import java.util.List;

/**
 * Created by djeremias on 3/7/17.
 */
public class MongoDaoImpl implements DAO {

    private Connection connection;

    public MongoDaoImpl() {
        //TODO: instantiate the oracle connection..
    }

    public BaseEntity createData(BaseEntity baseEntity) {

        System.out.println("inside createData() of mongo driver dao");
        return null;
    }

    public BaseEntity fetchDataById(Long id) {
        System.out.println("inside fetchDataById() of mongo driver dao");
        return null;
    }

    public List<BaseEntity> searchData(String name, String description) {
        System.out.println("inside searchData() of mongo driver dao");
        return null;
    }
}
