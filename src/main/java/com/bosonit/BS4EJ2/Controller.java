package com.bosonit.BS4EJ2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:miconfiguracion.properties")
})
public class Controller {

    @Value("${url}")
    private String url;

    @Value("${password}")
    private String password;

    @GetMapping("/parametros")
    public String getParametros() {
        return "LA URL ES: " + url + " Y LA PASSWORD ES: " + password;
    }

    @Value("${valor1}")
    private String valor1;

    @Value("${valor2}")
    private String valor2;

    @GetMapping("/miconfiguracion")
    public String getMiconfiguracion() {
        return "EL VALOR1 ES: " + valor1 + " Y EL VALOR2 ES: " + valor2;
    }

    @PostConstruct
    private void post() {
        System.out.println("EL VALOR1 ES: " + valor1 + " Y EL VALOR2 ES: " + valor2);
    }

    @GetMapping("/perfil1")
    public void getPerfil1() {
        Perfil1 perfil1 = new Perfil1();
        perfil1.miFuncion();
    }

    @GetMapping("/perfil2")
    public void getPerfil2() {
        Perfil2 perfil2 = new Perfil2();
        perfil2.miFuncion();
    }

    @Value("${spring.profiles.active")
    String perfil;

    @GetMapping("/perfiles")
    public void getPerfil() {
        if (perfil.equals("Perfil1")) {
            Perfil1 perfil11 = new Perfil1();
            perfil11.miFuncion();
        } else if (perfil.equals("Perfil2")) {
            Perfil2 perfil22 = new Perfil2();
            perfil22.miFuncion();
        } else {
            System.out.println("NO HA PASAO NA, HAS PASADO " + perfil);
        }
        System.out.println("ESTO ES LO QUE SE LE HA PASADO: " + perfil);
    }
}
