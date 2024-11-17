package taller3.televisores;

public class TV {

    private static int numTV;
    private Marca marca;
    public int canal = 1;
    private int precio = 500;
    public boolean estado;
    public int volumen = 1;
    private Control control;

    public TV(Marca marca, boolean estado){

        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca(){
        return this.marca;
    }

    public void setMarca(Marca marca){
        this.marca = marca;
    }

    public int getCanal(){
        return this.canal;
    }

    public void setCanal(int canal){
        if (this.estado && canal > 0 && canal <= 120){
        this.canal = canal;
        }
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio){
        this.precio = precio;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void setVolumen(int volumen){
        if (this.estado && volumen >= 0 && volumen <= 7){
        this.volumen = volumen;
        }
    }

    public Control getControl(){
        return this.control;
    }

    public void setControl(Control control){
        this.control = control;
    }

    public static int getNumTV(){
        return numTV;
    }

    public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public boolean getEstado(){
        return this.estado;
    }

    public void canalUp(){
        if (this.canal < 120 && this.canal > 0){
        this.canal++;
        }
    }

    public void canalDown(){
        if (this.canal > 1 && this.canal <= 120 && this.estado){
        this.canal--; 
        }
    }

    public void volumenUp(){
        if (this.volumen >= 0 && this.volumen < 7 && this.estado){
        this.volumen++;
        }
    }

    public void volumenDown(){
        if (this.volumen > 0 && this.volumen <= 7 && this.estado){
        this.volumen--;
        }
    }
}