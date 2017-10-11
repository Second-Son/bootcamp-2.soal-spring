/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author iyus
 */
@Component
public class UmurSaya {
    private final Integer umur;
    private final String saya;
    
     public UmurSaya(@Qualifier("getUmur") Integer umur, @Value("Saya ber usia ") String saya){
        this.umur = umur;
        this.saya = saya;
    }
     
     public String getUmur(){
        return saya +"" + "(" +umur+ ") tahun";
    }
}
