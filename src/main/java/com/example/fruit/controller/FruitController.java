package com.example.fruit.controller;

import com.example.fruit.bean.Fruit;
import com.example.fruit.dao.FruitDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController//注解控制器
public class FruitController {
    @Autowired
    FruitDao fruitDao;
    @RequestMapping("/list")
    public List<Fruit> list(){
        List<Fruit> list=fruitDao.list();
        return list;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public int insert(@RequestBody Fruit fruit){
        return fruitDao.insert(fruit);
    }
    @RequestMapping("/remove")
    public int remove(@RequestParam("fid") int id){
        return fruitDao.remove(id);
    }
    @RequestMapping("/update")
    public int update(@RequestBody Fruit fruit){
        return fruitDao.update(fruit);
    }
}
