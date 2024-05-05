import modelo.Titulo;

public class Pelicula extends Titulo {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void muestraFichaTecnicaPelicula(){
        System.out.println("Director: "+director);
    }
}