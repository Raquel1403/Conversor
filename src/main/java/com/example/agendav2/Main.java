package com.example.agendav2;

import Modelo.ExcepcionMoneda;
import Modelo.MonedaVO;
import Modelo.repository.impl.MonedaRepositoryImpl;
import com.example.agendav2.controller.ConversorController;
import com.example.agendav2.modelo.ConversorModelo;

import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            MonedaRepositoryImpl monedarepositoryImpl = new MonedaRepositoryImpl();
            MonedaVO monedaPrueba = new MonedaVO("euros", 1.2F);
            monedarepositoryImpl.addMoneda(monedaPrueba);
            //System.out.println(monedarepositoryImpl.ObtenerListaMonedas().size());
            //System.out.println(monedarepositoryImpl.lastId() + " last id");
            /*Iterator<MonedaVO> it = monedarepositoryImpl.ObtenerListaMonedas().iterator();
            while(it.hasNext()) {
                MonedaVO mon = (MonedaVO)it.next();
                System.out.println(mon.getCodigo() + " " + mon.getNombre() + ' ' + mon.getMultiplicador());
            }*/
            ConversorModelo con = new ConversorModelo();
            float  m = monedaPrueba.getMultiplicador();
            ConversorController cc = new ConversorController();
            float c = cc.getCantidad();
            con.recuperarMoneda(m, c);

        } catch (ExcepcionMoneda var5) {
            ExcepcionMoneda e = var5;
            System.out.println(e.imprimirMensaje());
        }

    }
}

