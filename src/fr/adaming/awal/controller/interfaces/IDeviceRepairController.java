/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.controller.interfaces;

import fr.adaming.awal.entity.Client;
import fr.adaming.awal.entity.Device;
import fr.adaming.awal.entity.Devicerepair;
import fr.adaming.awal.entity.Modelpackage;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IDeviceRepairController extends IController<Devicerepair, Integer> {

    public List<Devicerepair> getDevicesRepairByClient(final Client client);

    public Devicerepair getByDeviceAndPackage(final Device device, final Modelpackage modelPackage);
}
