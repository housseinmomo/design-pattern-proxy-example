package com.mugen.standard;

public class StandardImpl1 implements Standard{

    public StandardImpl1() {
        System.out.println("Objet de type StandardImpl1 est creer");
    }
    @Override
    public void process() {
        System.out.println("***************");
        System.out.println("Process....StandardImpl1");
        System.out.println("***************");
    }
}
