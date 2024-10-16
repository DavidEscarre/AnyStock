/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dades;

import java.util.List;

/**
 * Interficie amb diferents mètodes per poder implementar en cada clase DAO
 * @author reyes
 * @version 0.2
 */
public interface DAOInterface<T> {
    //Métodes per accedir a la base de dades
    //La T representa un tipus generic per poder ser utilitzat en qualsevol entitat com proveidor, familia o referencia

    public void afegir(T entitat);

    public void modificar(T entitat) throws Exception;

    public void delete(int id);

    public T obtenir(int id);

}
