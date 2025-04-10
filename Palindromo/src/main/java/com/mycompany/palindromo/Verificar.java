/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindromo;

import java.text.Normalizer;

/**
 *
 * @author aluno
 */
public class Verificar {
        public static boolean verificar(String input){
            if (input == null || input.isBlank()){
                return false;
            }
         String normalizado = Normalizer.normalize(input, Normalizer.Form.NFD);
         String semAcentos = normalizado.replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
         
         String limpo = semAcentos.replaceAll("[^a-zA-Z0-9]", "");
         String reverso = new StringBuilder(limpo).reverse().toString();
         return limpo.equals(reverso);
        }
    }

