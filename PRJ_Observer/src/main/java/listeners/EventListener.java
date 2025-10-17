/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listeners;

import java.io.File;

/**
 *
 * @author FATEC ZONA LESTE
 */


public interface EventListener {
    void update(String eventType, File file);
}