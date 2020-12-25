package com.example.fruit.dao;

import com.example.fruit.bean.Fruit;

import java.util.List;

public interface FruitDao {
    List<Fruit> list();
    int insert(Fruit fruit);
    int remove(int id);
    int update(Fruit fruit);
}
