package com.mugen.internet;

public class Client {

    public static void main(String[] args) {
        System.out.println("Design pattern proxy");

        Internet internet = new ProxyInternet();
        internet.getConnect("google.com");
        internet.getConnect("facebook.com");
        internet.getConnect("youtube.com");
    }
}
