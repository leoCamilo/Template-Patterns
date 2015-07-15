package cdp;

import cdp.codecs.Avi;
import cdp.codecs.Mp3;
import cdp.codecs.Mp4;

import java.util.HashMap;

public class MediaPlayer {
    HashMap<String, Codec> myCodec;
    String arqName;

    public void loadArq(String arqName){
        this.arqName = arqName;
        System.out.println("arquivo aberto: " + arqName);
    }

    public void runAs(String codec){
        Codec tempCodec = myCodec.get(codec);
        tempCodec.run(arqName);
    }

    public void endReproduction(){
        System.out.println("Finalizando reproducao");
    }

    public MediaPlayer(){
        myCodec = new HashMap<String, Codec>();
        myCodec.put("mp3", new Mp3());
        myCodec.put("mp4", new Mp4());
        myCodec.put("avi", new Avi());
    }
}
