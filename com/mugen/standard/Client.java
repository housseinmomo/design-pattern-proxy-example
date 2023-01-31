package com.mugen.standard;

public class Client {

    private Standard standard;

    public Client(Standard implementation) {
        this.standard = implementation;
    }

    public void process() {
        standard.process();
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }
}
