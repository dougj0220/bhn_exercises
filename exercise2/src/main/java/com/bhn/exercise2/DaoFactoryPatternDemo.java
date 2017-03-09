package com.bhn.exercise2;

import com.bhn.exercise2.dao.DAO;
import com.bhn.exercise2.dao.DAOFactory;
import com.bhn.exercise2.entity.BaseEntity;
import com.bhn.exercise2.util.DriverType;

import java.util.List;

/**
 * Created by djeremias on 3/7/17.
 */
public class DaoFactoryPatternDemo {

    public static void main(String[] args) {

        try {
            // get a mysql connection instance
            DAO mysql = DAOFactory.createDAO(DriverType.MYSQL);
            BaseEntity mysqlEntity = new BaseEntity("mysql", " test mysql entity persist");
            mysql.createData(mysqlEntity);

            // get a oracle connection instance
            DAO oracle = DAOFactory.createDAO(DriverType.ORACLE);
            BaseEntity oracleEntity = new BaseEntity();
            oracleEntity.setId(1L);
            BaseEntity retVal = oracle.fetchDataById(oracleEntity.getId());

            // get a mongo connection instance
            DAO mongo = DAOFactory.createDAO(DriverType.MONGO);
            List<BaseEntity> entities = mongo.searchData("mongo", null);

            // catch exception with invalid type
            DAO db2 = DAOFactory.createDAO(DriverType.DB2);
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }

}

