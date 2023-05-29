/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.porfolioAP.security;

import com.example.porfolioAP.modelo.Usuario;
import com.example.porfolioAP.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.porfolioAP.security.UserDetailsImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

/**
 *
 * @author HP
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService{
    @Autowired
    private UsuarioRepo usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario;
        usuario = usuarioRepository
                .findOneByEmail(email);
                //.orElseThrow(() -> new UsernameNotFoundException("El usuario con " + email +" no existe."));
        if(usuario.getEmail() == null) {
            System.out.println("El usuario con " + email +" no existe.");
        }
            
                return new UserDetailsImpl(usuario);
            }
}
