package com.lh.service;

import com.lh.pojo.NotePad;
import com.lh.pojo.NotePadT;

import java.util.List;

/**
 * Created by laiHom on 2020/4/20.
 */
public interface NoteService {
    List<NotePadT> getNote(String userId);

    int add(NotePad notePad);
}
