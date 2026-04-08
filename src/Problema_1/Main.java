package Problema_1;

import java.util.Scanner;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[100];
        int contador = 0;
        int opcion;
        do
        {
            System.out.println("Menú");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion)
            {
                case 1:
                    Estudiante e = new Estudiante();
                    System.out.print("Codigo: ");
                    e.codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    e.nombre = sc.nextLine();
                    System.out.print("Carrera: ");
                    e.carrera = sc.nextLine();
                    System.out.print("Promedio: ");
                    e.promedio = sc.nextFloat();
                    sc.nextLine();
                    estudiantes[contador] = e;
                    contador++;
                    System.out.println("Estudiante registrado\n");
                    break;
                case 2:
                    int aprobados = 0;
                    int reprobados = 0;
                    for (int i = 0; i < contador; i++)
                    {
                        System.out.println("Codigo: " + estudiantes[i].codigo);
                        System.out.println("Nombre: " + estudiantes[i].nombre);
                        System.out.println("Carrera: " + estudiantes[i].carrera);
                        System.out.println("Promedio: " + estudiantes[i].promedio);
                        if (estudiantes[i].aprobar()) {
                            System.out.println("Estado: Aprobado");
                            aprobados++;
                        }
                        else
                        {
                            System.out.println("Estado: Reprobado");
                            reprobados++;
                        }
                        System.out.println("---------------------");
                    }
                    System.out.println("Total Aprobados: " + aprobados);
                    System.out.println("Total Reprobados: " + reprobados);
                    break;
            }
        } while (opcion != 3);
    }
}