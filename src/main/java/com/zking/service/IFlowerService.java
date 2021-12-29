package com.zking.service;

import com.zking.model.Flower;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IFlowerService {
    int deleteByPrimaryKey(Integer fid);

    int insert(Flower record);

    int insertSelective(Flower record);

    Flower selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Flower record);

    int updateByPrimaryKey(Flower record);

    /**
     * 查询所以
     * @param flower
     * @return
     */
    List<Flower> list(Flower flower);
}