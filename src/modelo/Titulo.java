package modelo;

public class Titulo {
    private String nombre;
    private String sinopsis;
    private int fechaDeLanzamiento;
    private int tiempoDeDuración;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getTiempoDeDuración() {
        return tiempoDeDuración;
    }

    public void setTiempoDeDuración(int tiempoDeDuración) {
        this.tiempoDeDuración = tiempoDeDuración;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public void muestraFichaTecnica(){
        System.out.println("-----Ficha Técnica-----");
        System.out.println("Pelicula: "+nombre);
        System.out.println("Sinopsis: "+sinopsis);
        System.out.println("Lanzamiento: "+fechaDeLanzamiento);
        System.out.println("Duración: "+tiempoDeDuración+" minutos");
        System.out.println("Calificación: "+evaluacion+"/5");
        System.out.println("Incluido en plan estándar: "+incluidoEnElPlanBasico);
    }
}


