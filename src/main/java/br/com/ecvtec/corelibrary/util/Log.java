package br.com.ecvtec.corelibrary.util;

import java.util.Calendar;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.LOG;

public class Log {
    public static void writeToLog(LOG log, String jsonSessionInf){
        try {

                log.setHORA_INICIO(Calendar.getInstance());
                //log.setMAQUINA(req.getSession().getId());

                GenericDAOBdAplicacao<LOG> daoLOG = new GenericDAOBdAplicacao<LOG>(LOG.class);
                daoLOG.salvar(log);

        } catch (Exception e) {
                e.printStackTrace(System.out);
        }
    }
}
