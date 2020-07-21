/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import Receptor.Receptor;

/**
 *
 * @author jgale
 */
public class CommandConcrete2 implements ICommand
{
    private Receptor receptor;
    
    public CommandConcrete2(Receptor receptor) {
        this.receptor = receptor;
    }

    @Override
    public String name() {
        return "Preguntar color";
    }

    @Override
    public void ejecutar() {
        this.receptor.action2();
    }
}
