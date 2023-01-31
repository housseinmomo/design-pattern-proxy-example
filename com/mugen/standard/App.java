package com.mugen.standard;

public class App {

    public static void main(String[] args) {
        Client client = new Client(new Proxy());
        client.process();

    }
}

