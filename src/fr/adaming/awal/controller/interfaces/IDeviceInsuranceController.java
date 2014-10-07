/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.adaming.awal.controller.interfaces;

import fr.adaming.awal.entity.Client;
import fr.adaming.awal.entity.Deviceinsurance;
import java.util.List;

/**
 *
 * @author INTI0217
 */
public interface IDeviceInsuranceController extends IController<Deviceinsurance>{
    public List<Deviceinsurance> getDevicesInsuranceByClient(Client client);
}
