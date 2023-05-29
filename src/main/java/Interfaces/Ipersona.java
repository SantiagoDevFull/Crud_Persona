package Interfaces;

import Modelo.Persona;
import java.util.ArrayList;

public interface Ipersona {

    public ArrayList<Persona> ListarPersona();

    public int AgregarPersona(Persona p);

    public int ActualizarPersona(Persona p);

    public int EliminarPersona(int id);
    
    public int RetornarCodigoPersona();

    public int ExisteDNI(String dni);
    
}
