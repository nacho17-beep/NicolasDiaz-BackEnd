/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ndi.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author nico1
 */
public class LoginUsuario {
   @NotBlank
   private String nombreUsuario;
   @NotBlank
   private String password;
   
   //Getters  and Setter

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
