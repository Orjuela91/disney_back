/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disney.dao;

import com.disney.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author orjue
 */
public interface IUsuarioDao extends JpaRepository<Usuario, Long>{
    
    public Usuario findByUsername(String username);
    
}
