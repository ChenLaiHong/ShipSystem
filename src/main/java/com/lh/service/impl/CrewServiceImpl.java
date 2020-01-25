package com.lh.service.impl;

import com.lh.dao.CrewMapper;
import com.lh.pojo.Crew;
import com.lh.pojo.CrewExample;
import com.lh.pojo.Person;
import com.lh.pojo.PersonExample;
import com.lh.service.CrewService;
import com.lh.utils.MdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.lh.utils.CommentUtils.StringIds;

/**
 * Created by laiHom on 2020/1/18.
 */
@Service
public class CrewServiceImpl implements CrewService {
    @Autowired
    private CrewMapper crewMapper;

    @Override
    public Crew login(String name, String password) {
        CrewExample crewExample = new CrewExample();
        crewExample.createCriteria().andLoginIdEqualTo(name).andPasswordEqualTo(MdUtil.md5(password));
        List<Crew> crewList = crewMapper.selectByExample(crewExample);
        if(crewList.size()>0){
            return crewList.get(0);
        }
        return null;
    }

    @Override
    public Crew getUserName(String username, int state) {
        CrewExample crewExample = new CrewExample();
        crewExample.createCriteria().andLoginIdEqualTo(username);
        List<Crew> crewList = crewMapper.selectByExample(crewExample);
        if(crewList.size()>0 && crewList.get(0).getRoleId() == state){
            return crewList.get(0);
        }
        return null;
    }

    @Override
    public List<Crew> list(Map<String, Object> map) {
        return crewMapper.list(map);
    }

    @Override
    public Integer getTotal(Map<String, Object> map) {
        return crewMapper.getTotal(map);
    }

    @Override
    public int add(Crew crew) {
        return crewMapper.insertSelective(crew);
    }

    @Override
    public Crew findById(String id) {
        return crewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Crew crew) {
        return crewMapper.updateByPrimaryKeySelective(crew);
    }

    @Override
    public void delete(String idsStr) {

        crewMapper.updateList(StringIds(idsStr));

    }

    @Override
    public int inputAll(Map<String, Object> map) {
        return crewMapper.inputAll(map);
    }

    @Override
    public List<Crew> getTel() {

        Crew crew = new Crew();
        crew.setLoginId("xxx");
        crew.setName("张三");
        crew.setGender(0);

        List<Crew> list = new ArrayList<>();
        list.add(crew);
        return list;
    }

    @Override
    public List<Crew> getAll() {
        return crewMapper.selectByExample(null);
    }
}
