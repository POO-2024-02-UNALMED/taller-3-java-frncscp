package taller3.televisores;

public class Control {

    private TV tv;

    public TV getTv(){
        return this.tv;
    }

    public void setTv(TV tv){
        this.tv = tv;
    }

    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }

    public void turnOn(){
        tv.estado = true;
    }

    public void turnOff(){
        tv.estado = false;
    }

    public void canalUp(){
        if (tv.canal < 120 && tv.canal > 0){
        tv.canal++;
        }
    }

    public void canalDown(){
        if (tv.canal > 1 && tv.canal <= 120 && tv.estado){
        tv.canal--; 
        }
    }

    public void volumenUp(){
        if (tv.volumen >= 0 && tv.volumen < 7 && tv.estado){
        tv.volumen++;
        }
    }

    public void volumenDown(){
        if (tv.volumen > 0 && tv.volumen <= 7 && tv.estado){
        tv.volumen--;
        }
    }

    public void setVolumen(int volumen){
        tv.volumen = volumen;
    }

    public void setCanal(int canal){
        tv.canal = canal;
    }
}