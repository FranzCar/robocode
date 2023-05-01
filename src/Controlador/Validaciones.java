/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Konnycita
 */
public class Validaciones {
    public static void validacionCaracteres(KeyEvent evento) {
        //metodo solo peermite letras, no permite numeros ni caracteres espeeciales
        if ((evento.getKeyChar() < 97 || evento.getKeyChar() > 122) &&
            (evento.getKeyChar() < 65 || evento.getKeyChar() > 90) &&
            evento.getKeyChar() != 209 && evento.getKeyChar() != 241 &&
            evento.getKeyChar() != 8 && evento.getKeyChar() != 32 &&
            evento.getKeyChar() != 225 && evento.getKeyChar() != 233 &&
            evento.getKeyChar() != 237 && evento.getKeyChar() != 243 &&
            evento.getKeyChar() != 250 && evento.getKeyChar() != 193 &&
            evento.getKeyChar() != 201 && evento.getKeyChar() != 205 &&
            evento.getKeyChar() != 211 && evento.getKeyChar() != 218) {
            evento.consume();
            JOptionPane.showMessageDialog(null, "No se permite Caracteres Especiales");
        }
    }
   public static void validacionalfanumerico(KeyEvent evento) {
    if (evento.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
        return;
    }
    if ((evento.getKeyChar() < 48 || evento.getKeyChar() > 57) &&  // 0-9
        (evento.getKeyChar() < 65 || evento.getKeyChar() > 90) &&  // A-Z
        (evento.getKeyChar() < 97 || evento.getKeyChar() > 122) && // a-z
        evento.getKeyChar() != KeyEvent.VK_SPACE) {
        evento.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten números, letras y espacio");
    }
}

}


