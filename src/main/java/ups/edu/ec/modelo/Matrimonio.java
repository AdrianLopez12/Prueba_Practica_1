package ups.edu.ec.modelo;
import java.util.List;
public class Matrimonio {
    private String fecha;
    private String lugar;
    private List<Persona> persona;
    private int idMatrimonio;

    public Matrimonio() {
    }

    public Matrimonio(String fecha, String lugar, List<Persona> persona, int idMatrimonio) {
        this.fecha = fecha;
        this.lugar = lugar;
        this.persona = persona;
        this.idMatrimonio = idMatrimonio;
    }

  

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.idMatrimonio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matrimonio other = (Matrimonio) obj;
        if (this.idMatrimonio != other.idMatrimonio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Matrimonio{" + "fecha=" + fecha + ", lugar=" + lugar + ", persona=" + persona + ", idMatrimonio=" + idMatrimonio + '}';
    }
    
    
    
}
