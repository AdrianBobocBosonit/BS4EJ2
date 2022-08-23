package com.bosonit.BS4EJ2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class Perfil1 implements Perfiles{
    @Override
    @Bean
    @Profile("Perfil1")
    public void miFuncion() {
        System.out.println("ESTE ES EL SOUT DEL PERFIL 1");
    }
}
