package com.bhn.exercise2.dao;

import com.bhn.exercise2.dao.impl.MongoDaoImpl;
import com.bhn.exercise2.dao.impl.MySqlDaoImpl;
import com.bhn.exercise2.dao.impl.OracleDaoImpl;
import com.bhn.exercise2.util.DriverType;

/**
 * Created by djeremias on 3/7/17.
 */
public class DAOFactory {

    public static DAO createDAO(DriverType type) {
        DAO dao;
        switch (type) {
            case MYSQL:
                dao = new MySqlDaoImpl();
                break;
            case ORACLE:
                dao = new OracleDaoImpl();
                break;
            case MONGO:
                dao = new MongoDaoImpl();
                break;
            default:
                throw new IllegalArgumentException("Error: no such driver type defined");
        }

        return dao;
    }
}
