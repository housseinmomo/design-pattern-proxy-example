package com.mugen.standard;

import java.util.Random;

public class Proxy implements Standard{

//    Nous devons faire une composition de notre implementation (l'objet a proteger/controller)
//    Il est preferable d'instancier l'implementation si les conditions & controller sont bon
//    Car sinon on pourrait charger un objet inutilement qui peux parfois etre tres couteux

    StandardImpl1 target ;

    @Override
    public void process() {
        // On creer de maniere aleatoire une boolean (true ou false)
        boolean b = new Random().nextBoolean();
        System.out.println("Verification du contexte de securite");
        if(b) {
            // Une fois les conditions valider, on peut alors instancier notre objet (implementation)
            this.target = new StandardImpl1();
            this.target.process();
        } else{
            System.out.println("Forbidden 403");
        }
    }
}
