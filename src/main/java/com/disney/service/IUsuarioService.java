/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.disney.service;

import com.disney.entity.Usuario;

/**
 *
 * @author orjue
 */
public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
