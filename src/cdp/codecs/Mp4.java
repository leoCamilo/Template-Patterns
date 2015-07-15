package cdp.codecs;

import cdp.Codec;

public class Mp4 extends Codec{
    @Override
    public void decoder(String arq) {
        System.out.println("Decodificando como mp4");
    }
}
