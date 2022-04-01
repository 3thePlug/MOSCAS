enum tipoMosca {
    Corriente, Verde, Negra;
}
public class Mosca {
    int vida;
    tipoMosca tipo;
    
    public Mosca(tipoMosca tipo) {
        this.vida = 3;
        this.tipo = tipo;
    }
    public Mosca(int vida, tipoMosca tipo) {
        this.vida = vida;
        this.tipo = tipo;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public tipoMosca getTipo() {
        return tipo;
    }
    public void setTipo(tipoMosca tipo) {
        this.tipo = tipo;
    }
    public boolean perderVida() {
        this.vida = this.vida-1;
        return this.vida <= 0; 
    }
    @Override
    public String toString() {
        return "Mosca [tipo=" + tipo + ", vida=" + vida + "]";
    }
}
