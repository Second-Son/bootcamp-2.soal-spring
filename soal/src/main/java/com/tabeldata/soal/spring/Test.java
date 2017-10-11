/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author iyus
 */
@Component
public class Test {
    @Autowired
    UmurSaya umurSaya;
    
    public void start(){
            System.out.println(umurSaya.getUmur());
}
}
