package cdp;

public abstract class Codec {
    public abstract void decoder(String arq);

    public final void run(String arq){
        decoder(arq);
        System.out.println("Reproduzindo...");
    }
}
