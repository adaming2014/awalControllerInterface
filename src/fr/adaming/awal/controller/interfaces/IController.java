/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.controller.interfaces;

import fr.adaming.awal.entity.interfaces.IEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author INTI0217
 * @param <T>
 * @param <I>
 */
public interface IController<T extends IEntity<I>, I extends Serializable> {

    List<T> getAll();

    boolean create(final T entity);

    boolean update(final T entity);

    boolean delete(final T entity);

    boolean delete(final I id);

    T getById(final I id);
}
