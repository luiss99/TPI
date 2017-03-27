/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Entities.TipoRequisito;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Kira Luis
 */
@Local
public interface TipoRequisitoFacadeLocal {

    void create(TipoRequisito tipoRequisito);

    void edit(TipoRequisito tipoRequisito);

    void remove(TipoRequisito tipoRequisito);

    TipoRequisito find(Object id);

    List<TipoRequisito> findAll();

    List<TipoRequisito> findRange(int[] range);

    int count();
    
}
