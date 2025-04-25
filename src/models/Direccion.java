package models;

public class Direccion {
    int Codigo;
    String calle;
    int numeroCalle;
    
    public Direccion( String calle, int numeroCalle,int codigo) {
        Codigo = codigo;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public void setNumeroCalle(int numeroCalle) {
        this.numeroCalle = numeroCalle;
    }

    @Override
    public String toString() {
        return "Direccion [Codigo=" + Codigo + ", calle=" + calle + ", numeroCalle=" + numeroCalle + "]";
    }

    
}
