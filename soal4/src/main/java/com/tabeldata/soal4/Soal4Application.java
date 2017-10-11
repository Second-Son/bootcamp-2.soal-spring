package com.tabeldata.soal4;

import com.tabeldata.soal4.model.Penumpang;
import com.tabeldata.soal4.model.Tiket;
import com.tabeldata.soal4.model.Travel;
import com.tabeldata.soal4.repository.PenumpangRepository;
import com.tabeldata.soal4.repository.TiketRepository;
import com.tabeldata.soal4.repository.TravelRepository;
import java.sql.Date;
import java.time.Instant;
import javafx.application.Application;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jca.context.SpringContextResourceAdapter;

@SpringBootApplication
public class Soal4Application {

    public static void main(String[] args) {
        ApplicationContext springContext = SpringApplication.run(Soal4Application.class, args);
        
        //********PENUMPANG********//
        PenumpangRepository penumpangRepository = springContext.getBean(PenumpangRepository.class);
        Penumpang penumpang1 = penumpangRepository.save(new Penumpang(1,"Lukman","0812341234213","Jl.cisaranten"));
        Penumpang penumpang2 = penumpangRepository.save(new Penumpang(2,"Akbar","0918234483343","Jl. Melawai"));
        Penumpang penumpang3 = penumpangRepository.save(new Penumpang(3,"Dewa Ngoman","0900934483343","Jl. panglima polim"));
//        Iterable<Penumpang> all = penumpangRepository.findAll();
//        all.forEach(m -> {
//            System.out.println(m.getId());
//            System.out.println(m.getNama());
//            System.out.println(m.getNo_telp());
//            System.out.println(m.getAlamat());
//        });

        //********TRAVEL********//
        TravelRepository travelRepository = springContext.getBean(TravelRepository.class);
        Travel travel1 = travelRepository.save(new Travel(1,"Eko","0813284343433","Jl.cisaranten","D 2524 ZZC"));
        Travel travel2 = travelRepository.save(new Travel(2,"Budi","0918234483343","Jl. Melawai","B 4343 KDF"));
        Travel travel3 = travelRepository.save(new Travel(3,"Adi Putra","0900934483343","Jl. panglima polim","B 2343 DKJ"));
//        Iterable<Travel> all2 = travelRepository.findAll();
//        all2.forEach(m -> {
//            System.out.println(m.getId());
//            System.out.println(m.getNama());
//            System.out.println(m.getNo_telp());
//            System.out.println(m.getAlamat());
//            System.out.println(m.getNo_polisi());
//        });       
        
        //********TIKET********// MASIH ERROR KALAU PAKAI YANG TIKET
        TiketRepository tiketRepository = springContext.getBean(TiketRepository.class);
        tiketRepository.save(new Tiket(1, penumpang1, travel1, Date.valueOf("2017-10-20")));
        tiketRepository.save(new Tiket(2, penumpang2, travel2, Date.valueOf("2017-10-20")));
        tiketRepository.save(new Tiket(3, penumpang3, travel3, Date.valueOf("2017-10-20")));
    }
}
