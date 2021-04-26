package factory;
import model.Carta;

public abstract class NaipeFactory {
    protected abstract Carta naipe();
    public Carta getCarta(){ return this.naipe();}
}