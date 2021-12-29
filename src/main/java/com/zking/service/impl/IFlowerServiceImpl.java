package com.zking.service.impl;

import com.zking.mapper.FlowerMapper;
import com.zking.model.Flower;
import com.zking.service.IFlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IFlowerServiceImpl implements IFlowerService {

    @Autowired
    private FlowerMapper flowerMapper;
    @Override
    public int deleteByPrimaryKey(Integer fid) {
        return flowerMapper.deleteByPrimaryKey(fid);
    }

    @Override
    public int insert(Flower record) {

        return flowerMapper.insert(record);
    }

    @Override
    public int insertSelective(Flower record) {

        return flowerMapper.insertSelective(record);
    }

    @Override
    public Flower selectByPrimaryKey(Integer fid) {

        return flowerMapper.selectByPrimaryKey(fid);
    }

    @Override
    public int updateByPrimaryKeySelective(Flower record) {

        return flowerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Flower record) {

        return flowerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Flower> list(Flower flower) {
        return flowerMapper.list(flower);
    }
}
