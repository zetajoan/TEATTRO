package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


                ArrayList<HashMap<String, Object>> peliculas = new ArrayList<>();
                Scanner lea = new Scanner(System.in);
                System.out.println("BIENVENIDO AL PEQUEÑO TEATRO:");

                int opcionElejida = 1;
                do {
                    System.out.println("Menu");
                    System.out.println("1. Agregar una obra.");
                    System.out.println("2. Buscar todas las obras.");
                    System.out.println("3. Buscar por nombre de la obra.");
                    System.out.println("4. Modificar el costo de la obra: ");
                    System.out.println("0. Salir.");
                    opcionElejida = lea.nextInt();
                    lea.nextLine();

                    if (opcionElejida == 1) {
                        HashMap<String, Object> producto = new HashMap<>();

                        System.out.println("Ingrese el nombre de la obra:");
                        String nombreObra = lea.nextLine();
                        producto.put("Nombre", nombreObra);

                        System.out.println("Ingrese el director de la obra:");
                        String directorObra = lea.nextLine();
                        producto.put("Director", directorObra);

                        System.out.println("Ingrese el género de la obra:");
                        String generoObra = lea.nextLine();
                        producto.put("Género", generoObra);

                        System.out.println("Ingrese el costo de la obra:");
                        int costoObra = lea.nextInt();
                        producto.put("Costo", costoObra);

                        System.out.println("Fecha fin de la obra:");
                        System.out.println("Año:");
                        int anio = lea.nextInt();
                        System.out.println("Mes:");
                        int mes = lea.nextInt();
                        System.out.println("Día:");
                        int dia = lea.nextInt();
                        lea.nextLine();

                        LocalDate fecha = LocalDate.of(anio, mes, dia);
                        producto.put("Fecha Fin", fecha);

                        peliculas.add(producto);

                    } else if (opcionElejida == 2) {
                        System.out.println("Listado de todas las obras:");
                        for (HashMap<String, Object> productoAuxiliar : peliculas) {
                            System.out.println(productoAuxiliar);

                        }

                    } else if (opcionElejida==3) {
                        System.out.println("Buscar por nombre");
                        String nombrePeliculaBuscar = lea.nextLine();
                        boolean encontrado = false;


                } else if (opcionElejida == 4) {
                        System.out.println("Ingresa el nombre de la obra que quieres modificar:");
                        String nombrePeliculaBuscar = lea.nextLine();
                        boolean encontrado = false;

                        for (HashMap<String, Object> productoAuxiliar : peliculas) {
                            if (productoAuxiliar.get("Nombre").equals(nombrePeliculaBuscar)) {
                                System.out.println("Obra encontrada: " + productoAuxiliar);
                                System.out.println("Ingrese el nuevo costo de la obra:");
                                int nuevoCosto = lea.nextInt();
                                lea.nextLine(); // Limpiar el buffer
                                productoAuxiliar.put("Costo", nuevoCosto);
                                System.out.println("Modificar costo.");
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Obra no encontrada.");
                        }
                    }

                } while (opcionElejida != 0);

                System.out.println("Gracias, espero que hayas disfrutado de nuestros servicios.");
            }
        }




