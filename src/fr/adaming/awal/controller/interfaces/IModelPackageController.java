/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.controller.interfaces;

import fr.adaming.awal.entity.Modele;
import fr.adaming.awal.entity.Modelpackage;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IModelPackageController extends IController<Modelpackage>{
    public List<Modelpackage> getPackagesByModel(Modele model);
}
