/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal4.repository;

import com.tabeldata.soal4.model.Penumpang;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author iyus
 */
public interface PenumpangRepository extends CrudRepository<Penumpang, String>{
    
}
