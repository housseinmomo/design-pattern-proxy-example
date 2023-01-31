package com.mugen.internet;
import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private  Internet internet;
    private static  List<String> bannedSites = new ArrayList<>();

    public ProxyInternet() {
        bannedSites.add("facebook.com");
        bannedSites.add("tiktok.com");
        bannedSites.add("youtube.com");
        bannedSites.add("instagram.com");
        bannedSites.add("twitter.com");
    }

    @Override
    public void getConnect(String host) {
        if(bannedSites.contains(host)){
            System.out.println("Access Denied to " + host + " by Provider");
            return;
        }
        this.internet = new RealInternet();
        this.internet.getConnect(host);
    }
}
