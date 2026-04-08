package Problema_1;

public class Estudiante
{
    String codigo;
    String nombre;
    String carrera;
    float promedio;
    public boolean aprobar()
    {
        if (promedio >= 70)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
