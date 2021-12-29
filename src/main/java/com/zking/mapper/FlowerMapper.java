package com.zking.mapper;

import com.zking.model.Flower;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowerMapper {
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