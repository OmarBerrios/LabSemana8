package LabSemana8;


import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omarr
 */
public class Jugador {
    private String username;
    private String password;
    private int puntos;

    public Jugador(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getPuntos() {
        return puntos;
    }

    public void aumentarPuntos() {
        this.puntos++;
    }

    public static boolean UsernameValido(String username, Map<String, Jugador> usuarios) {
        return !usuarios.containsKey(username);
    }

    public static boolean PasswordValido(String password) {
        return password.length() == 5;
    }
}

