/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Password {
     private int Longitud;
     private String Contraseña;
     
public Password(String Contraseña) {
        this.Longitud = 8;
        this.Contraseña = Contraseña;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public String Fuerte(){
        int d;
        String aux;
        d = this.Contraseña.length();
        if (d < 6) {
            aux=("La contraseña es débil");

        } else {
            aux=("La contraseña es fuerte");
        }

        return (aux);
    }
    }  
    
    

