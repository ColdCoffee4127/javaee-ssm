package com.laf.service;

import com.laf.pojo.Worker;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkerService {
    List<Worker> selectAll();
    void delete(int id);
}
