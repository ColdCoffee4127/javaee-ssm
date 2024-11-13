package com.laf.controller;

import com.laf.pojo.Worker;
import com.laf.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/wkr")
public class WorkerController {
    @Autowired
    WorkerService workerService;

    @RequestMapping("/all")
    public String getall(Model model){
        List<Worker> lis = workerService.selectAll();
        model.addAttribute("workers",lis);
        return "workers";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable int id){
        workerService.delete(id);
        return "redirect:/wkr/all";
    }
}
