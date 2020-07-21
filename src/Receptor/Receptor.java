/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptor;

import upm.jbb.IO;

/**
 *
 * @author jgale
 */
public class Receptor
{
    public Receptor() {
    }
    // -----------------------
     public void action1()
    {
        IO.getIO().println(IO.getIO().read("pruebas.Dias","Prueba de enum"));
    }
     public void action2()
    {
        IO.getIO().println(IO.getIO().read("java.awt.Color", "Color"));
    }
}
