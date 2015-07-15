package cdp.codecs;

import cdp.Codec;

public class Avi extends Codec{
    @Override
    public void decoder(String arq) {
        System.out.println("Decodificando como avi");
    }
}
