/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoker;

import java.util.HashMap;
import java.util.Map;
import command.ICommand;

/**
 *
 * @author jgale
 */
public class Invoker
{
    private Map<String, ICommand> orders;
    
    public Invoker() {
        this.orders = new HashMap<>();
    }
    
    public void add(ICommand orden) {
        this.orders.put(orden.name(), orden);
    }
    
    public void execute(String key) {
        this.orders.get(key).ejecutar();
    }
    
    public String[] keys() {
        return this.orders.keySet().toArray(new String[0]);
    }
}
