package com.tabeldata.soal;

import com.tabeldata.soal.spring.Test;
import com.tabeldata.soal.spring.UmurSaya;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
public class SoalApplication {
    
	public static void main(String[] args) {
		ApplicationContext springContext = new AnnotationConfigApplicationContext(Konfigurasi.class);
                Test test = springContext.getBean(Test.class);
                test.start();
	}
}
