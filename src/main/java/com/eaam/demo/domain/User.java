/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eaam.demo.domain;

import lombok.Data;

/**
 *
 * @author poke
 */
@Data
public class User {
    private String user;
    private String password;
    private String token;
}
