/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entities.TipoPaso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kira Luis
 */
@Local
public interface TipoPasoFacadeLocal {

    void create(TipoPaso tipoPaso);

    void edit(TipoPaso tipoPaso);

    void remove(TipoPaso tipoPaso);

    TipoPaso find(Object id);

    List<TipoPaso> findAll();

    List<TipoPaso> findRange(int[] range);

    int count();
    
}
