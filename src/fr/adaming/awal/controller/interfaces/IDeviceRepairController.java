/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.controller.interfaces;

import fr.adaming.awal.entity.Client;
import fr.adaming.awal.entity.Devicerepair;
import fr.adaming.awal.entity.Repairer;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IDeviceRepairController extends IController<Devicerepair, Integer> {

    public List<Devicerepair> getDevicesRepairByClient(final Client client);

    public List<Devicerepair> getDevicesRepairByRepairer(final Repairer repairer);

    public void createDeviceRepair(final Devicerepair entity) throws PackageAlreadyPresentException;

    public void setRepairingState(final Devicerepair devicerepair);

    public void setRepairedState(final Devicerepair devicerepair);

    public void setClosedState(final Devicerepair devicerepair);

    public class PackageAlreadyPresentException extends Exception {

    }
}
