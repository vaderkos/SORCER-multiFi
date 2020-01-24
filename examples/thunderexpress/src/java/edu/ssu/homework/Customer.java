package java.edu.ssu.homework;

import sorcer.service.*;

import java.rmi.RemoteException;

import static sorcer.co.operator.*;
import static sorcer.eo.operator.*;

public class Customer {
    public Mogram createExertionBlock () throws Exception {
        Task order = task("order", sig("makeOrder", OrderService.class), context(
                inVal("gpu/memory", "4gb"),
                inVal("hdd/memory", "1tb"),
                inVal("cpu/amtCores", 4),
                outVal("assembly")
        ));

        Task shipment = task("shipment", sig("deliver", ShipmentService.class), context(
                inVal("address/street", "Wall Street"),
                inVal("address/number", 13)
        ));

        Task payment = task("payment", sig("payment", PaymentService.class), context(
                inVal("method", "cardDebit"),
                inVal("card/number", "0000 0000 0000 0000")
        ));

        Block makeOrder = block(context(
                inVal("card/number", "0000 0000 0000 0000"),
                val("assembly"),
                order,
                shipment,
                payment
        ));

        return makeOrder;
    }
}
