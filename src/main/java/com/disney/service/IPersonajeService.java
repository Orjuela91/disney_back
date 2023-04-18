/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disney.service;

import com.disney.entity.Personaje;
import java.util.List;

/**
 *
 * @author orjue
 */
public interface IPersonajeService {
    List<Personaje> findPaginated(int pageNo, int pageSize);
    Personaje save(Personaje personaje);
}
