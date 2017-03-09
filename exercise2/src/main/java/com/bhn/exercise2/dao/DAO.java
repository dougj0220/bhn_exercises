package com.bhn.exercise2.dao;

import com.bhn.exercise2.entity.BaseEntity;

import java.util.List;

/**
 * Created by djeremias on 3/7/17.
 */
public interface DAO {

    BaseEntity createData(BaseEntity baseEntity);
    BaseEntity fetchDataById(Long id);
    List<BaseEntity> searchData(String name, String description);
}
