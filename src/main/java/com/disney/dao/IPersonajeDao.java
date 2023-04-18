/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disney.dao;

import com.disney.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author orjue
 */
public interface IPersonajeDao extends PagingAndSortingRepository<Personaje, Long>, JpaRepository<Personaje, Long>{
    
}
