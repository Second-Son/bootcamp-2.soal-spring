/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author iyus
 */
@Configuration
@ComponentScan(basePackages = "com.tabeldata.soal")
public class Konfigurasi {
    
    @Bean
    public Integer getUmur(){
        return 20;
    }
    
}
