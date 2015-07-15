package cdp.codecs;

import cdp.Codec;

public class Mp3 extends Codec{
    @Override
    public void decoder(String arq) {
        System.out.println("Decodificando como mp3");
    }
}
