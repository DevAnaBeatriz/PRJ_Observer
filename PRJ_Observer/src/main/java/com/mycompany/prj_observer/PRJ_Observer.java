/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj_observer;

import editor.Editor;
import listeners.EmailNotificationListener;
import listeners.LogOpenListener;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class PRJ_Observer {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("anaebiaemail@example.com"));


        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
        }
    }
}
