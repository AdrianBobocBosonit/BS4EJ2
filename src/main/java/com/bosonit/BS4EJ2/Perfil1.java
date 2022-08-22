package com.bosonit.BS4EJ2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("Perfil1")
public class Perfil1 implements Perfiles{
    @Override
    @Bean
    public void miFuncion() {
        System.out.println("ESTE ES EL SOUT DEL PERFIL 1");
    }
}
