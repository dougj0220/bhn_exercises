package com.bhn.exercise2.dao.impl;

import com.bhn.exercise2.dao.DAO;
import com.bhn.exercise2.entity.BaseEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

/**
 * Created by djeremias on 3/7/17.
 */
public class OracleDaoImpl implements DAO {

    private Connection connection;

    public OracleDaoImpl() {
        //TODO: instantiate the oracle connection..
        // getConnection();
    }


    /**
     * This is an example of something that could live
     * in a base class (parent) as a utility for creating
     * the specific connections....
     *
     * So this could be done using an abstract base class...
     */
    protected void getConnection(Properties props) {
        try {
            Class.forName(props.getProperty("driver")); //oracle.jdbc.driver.OracleDriver

            //"jdbc:oracle:thin:@localhost:1521:test" "dba" "password"
            connection = DriverManager.getConnection(
                    props.getProperty("url"), props.getProperty("user"),  props.getProperty("password"));
        } catch (Exception err) {
            System.out.println("Oracle Connection Failed!");
        }
    }

    public BaseEntity createData(BaseEntity baseEntity) {
        System.out.println("inside createData() of oracle driver dao");
        return null;
    }

    public BaseEntity fetchDataById(Long id) {
        System.out.println("inside fetchDataById() of oracle driver dao");
        return null;
    }

    public List<BaseEntity> searchData(String name, String description) {
        System.out.println("inside searchData() of oracle driver dao");
        return null;
    }
}
