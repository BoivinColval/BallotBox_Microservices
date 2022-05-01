package com.jeremygagner.williamboivin.forumservice.repository;

import java.util.List;

public interface IDAO <T>{
    public void add(T Object);
    public void delete(int id);
    public List<T> readAll();
    public T findOne(int id);
    public void update(T Object);
}
