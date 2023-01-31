package com.mugen.internet;

public class RealInternet implements Internet{

    @Override
    public void getConnect(String host) {

        System.out.println("Opened connection to " + host
        );
    }
}
