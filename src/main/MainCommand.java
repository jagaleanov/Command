/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Invoker.Invoker;
import Receptor.Receptor;
import command.CommandConcrete1;
import command.CommandConcrete2;
import upm.jbb.IO;


/**
 *
 * @author jgale
 */
public final class MainCommand {

    private Invoker invocador;
    
    /**
     * @param args the command line arguments
     */
    private MainCommand() {
        Receptor receptor = new Receptor();
        this.invocador = new Invoker();
        this.invocador.add(new CommandConcrete1(receptor));
        this.invocador.add(new CommandConcrete2(receptor));
    }
    
    public void invocador() {
        String llave = (String) IO.getIO().select(this.invocador.keys());
        this.invocador.execute(llave);
    }
    
    public static void main(String[] args)
    {
        IO.getIO().addView(new MainCommand(), true);
    }
    
}
