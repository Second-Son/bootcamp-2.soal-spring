/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tabeldata.soal4.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author iyus
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="travel")//untuk membuat nama Table dan schema
public class Travel {
    @Id
    @Column(name="id_travel", length=10)
    private Integer id;
    
    @Column(name="nama_supir", nullable = false, length = 50)
    private String nama;
    
    @Column(name = "no_telp", nullable = false, length = 13)
    private String no_telp;
    
    @Column(name = "alamat", nullable = false, length = 50)
    private String alamat;
    
    @Column(name = "no_polisi", nullable = false, length = 10)
    private String no_polisi;
}
