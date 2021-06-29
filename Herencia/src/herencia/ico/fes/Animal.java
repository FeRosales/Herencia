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
public class Animal {
     private String Especie;
    private String Categoría;
    private String Sexo;

    public Animal() {
    }

    public Animal(String Especie, String Categoría, String Sexo) {
        this.Especie = Especie;
        this.Categoría = Categoría;
        this.Sexo = Sexo;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getCategoría() {
        return Categoría;
    }

    public void setCategoría(String Categoría) {
        this.Categoría = Categoría;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Animal{" + "Especie=" + Especie + ", Categor\u00eda=" + Categoría + ", Sexo=" + Sexo + '}';
    }

}
