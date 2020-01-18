package com.lh.service;

import com.lh.pojo.Crew;

import java.util.List;
import java.util.Map;


/**
 * Created by laiHom on 2020/1/18.
 */

public interface CrewService {
    Crew login(String name, String password);

    Crew getUserName(String username,int state);

    List<Crew> list(Map<String, Object> map);

    Integer getTotal(Map<String, Object> map);

    int add(Crew crew);

    Crew findById(String id);

    int update(Crew crew);

    void delete(String[] idsStr);

    int inputAll(Map<String, Object> map);

    List<Crew> getTel();

    List<Crew> getAll();
}
