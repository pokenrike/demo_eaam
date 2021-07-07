/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eaam.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author poke
 */
@Data
@Entity
@Table(name = "TB_Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     @Size(min = 3, max = 45, message 
      = "El nombre debe ser de largo minimo 3")
    private String nombre;
     @Size(min = 3, max = 45, message 
      = "El apellido debe ser de largo minimo 3")
    private String apellido;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd" )
    private Date nacimiento;
    @Email
    @NotBlank(message = "El mail es obligatorio")
    private String email;

}
