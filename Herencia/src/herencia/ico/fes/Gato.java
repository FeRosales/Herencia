/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ico.fes;

/**
 *
 * @author windos8.1
 */
public class Gato extends Animal {
    
    private String Sexo;
  private String Raza;
  private float Peso;

    public Gato() {
    }

    public Gato(String Sexo, String Raza, float Peso) {
        this.Sexo = Sexo;
        this.Raza = Raza;
        this.Peso = Peso;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Gato{" + "Sexo=" + Sexo + ", Raza=" + Raza + ", Peso=" + Peso + '}';
    }

    
    
}
