package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;



    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    //Métodos Sobreescritos
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String cadena = "";
        for(int i = 0; i < letras.length-1 ;i++) {
            cadena += letras[i]+", ";
        }
        cadena+= letras[letras.length-1];
        return cadena;
    }
    //Métodos de la clase
    public int cantidadLetras(){
        return letras.length;
    }
    //Getters and setters
    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
