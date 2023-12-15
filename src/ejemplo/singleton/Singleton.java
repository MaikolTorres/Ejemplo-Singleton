/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.singleton;

/**
 *
 * @author Maikol
 */
public class Singleton {
    // Paso 1: Crear una instancia estática privada de la clase para almacenar la instancia Singleton.
    private static Singleton instance;
    public String value;

     // Paso 4: Declara el constructor de clase como privado.
    private Singleton(String value) {
       // Inicialización de la instancia
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

     // Paso 2: Declara un método de creación estático público para obtener la instancia Singleton.
    public static Singleton getInstance(String value) {
        // Paso 3: Implementa una inicialización diferida dentro del método estático.
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
