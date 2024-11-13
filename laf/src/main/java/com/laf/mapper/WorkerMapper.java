package com.laf.mapper;

import com.laf.pojo.Worker;

import java.util.List;

public interface WorkerMapper {
    List<Worker> selectAll();
    void delete(int id);
}
