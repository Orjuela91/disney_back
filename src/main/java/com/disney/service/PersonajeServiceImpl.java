/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.disney.service;

import com.disney.dao.IPersonajeDao;
import com.disney.entity.Personaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author orjue
 */
@Service
public class PersonajeServiceImpl implements IPersonajeService{
    
    @Autowired
    private IPersonajeDao personajeDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Personaje> findPaginated(int pageNo, int pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Personaje> pagedResult = personajeDao.findAll(paging);
        
        return pagedResult.toList();
    }

    @Override
    @Transactional()
    public Personaje save(Personaje personaje) {
        return personajeDao.save(personaje);
    }
    
}
