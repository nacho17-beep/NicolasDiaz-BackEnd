/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ndi.Security.Repository;

import com.portfolio.ndi.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer>{
   Optional<Usuario> findByNombreUsuario(String nombreUsuario);
   
   boolean existsBynombreUsuario(String nombreUsuario);
   boolean existsByEmail(String email);
}
