/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.controller.interfaces;

import fr.adaming.awal.entity.User;

/**
 *
 * @author INTI0217
 */
public interface IUserController extends IController<User, Integer> {

    User getByEmail(final String email);
}
