package com.github.leandroalcantara1997.api_agenda_salao.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ValidaDados {
    public static Date validaData(String data) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (data.length() != 10){
            throw new Exception("A data deve estar no formato certo");
        }
        Date dataNascimento = sdf.parse(data);
        return dataNascimento;
    }

    public static boolean validaString(String nome) {
        System.out.println(nome);
        String[] name = nome.split("");
        for(String n: name){
            if (Character.isDigit(n.charAt(0))) {
                return true;
            }
        }
        return false;
    }

    public static boolean validaNumber(String doc){
        String[] dados = doc.split("");
        for(String n: dados){
            if (Character.isLetter(n.charAt(0))) {
                return true;
            }
        }
        return false;
    }
}
