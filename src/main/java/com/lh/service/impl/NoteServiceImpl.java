package com.lh.service.impl;

import com.lh.dao.NotePadMapper;
import com.lh.pojo.NotePad;
import com.lh.pojo.NotePadT;
import com.lh.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by laiHom on 2020/4/20.
 */
@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NotePadMapper notePadMapper;

    @Override
    public List<NotePadT> getNote(String userId) {
        return notePadMapper.getNote(userId);
    }

    @Override
    public int add(NotePad notePad) {
        notePad.setState(1);
        notePad.setUpdateTime(new Date());
        return notePadMapper.insertSelective(notePad);
    }
}
