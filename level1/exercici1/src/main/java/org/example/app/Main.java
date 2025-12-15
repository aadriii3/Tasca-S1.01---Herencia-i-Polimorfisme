package org.example.app;

import org.example.model.Instrument;
import org.example.model.PercussionInstrument;
import org.example.model.StringInstrument;
import org.example.model.WindInstrument;

public class Main {
    public static void main(String[] args) {
        WindInstrument windInstrument = new WindInstrument("Flauta", 14.99);
        StringInstrument stringInstrument = new StringInstrument("Guitarra", 20.99);
        PercussionInstrument percussionInstrument = new PercussionInstrument("Batería", 25.99);

        Instrument.infoClase();
        windInstrument.play();
        stringInstrument.play();
        percussionInstrument.play();
    }
}