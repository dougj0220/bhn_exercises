package com.bhn.exercise2.dao;

/**
 * Created by djeremias on 3/7/17.
 */
public abstract class AbstractDAOFactory {

    abstract DAO createDAO(String type);
}
