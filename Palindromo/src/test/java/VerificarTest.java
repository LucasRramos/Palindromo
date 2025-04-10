/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author aluno
 */
public class VerificarTest {
   @Test
    void deveRetornarTrueParaPalavrasSimples() {
        assertTrue(VerificarTest.verificar("ana"));
        assertTrue(VerificarTest.verificar("ovo"));
    }

    @Test
    void deveRetornarTrueParaFrasesComEspacosEMaiusculas() {
        assertTrue(VerificarTest.verificar("Ame a ema"));
        assertTrue(VerificarTest.verificar("Socorram-me subi no ônibus em Marrocos"));
        assertTrue(VerificarTest.verificar("A man, a plan, a canal, Panama"));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(VerificarTest.verificar("palavra"));
        assertFalse(VerificarTest.verificar("Isso não é um palíndromo"));
        assertFalse(VerificarTest.verificar("ChatGPT"));
    }

    @Test
    void deveRetornarFalseParaStringVaziaOuNula() {
        assertFalse(VerificarTest.verificar(""));
        assertFalse(VerificarTest.verificar(null));
}}

