package com.laf.service.impl;

import com.laf.mapper.WorkerMapper;
import com.laf.pojo.Worker;
import com.laf.service.WorkerService;
import com.laf.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    WorkerMapper workerMapper;

    @Override
    public List<Worker> selectAll() {
        return workerMapper.selectAll();
    }

    @Override
    public void delete(int id) {
        workerMapper.delete(id);
    }
}
