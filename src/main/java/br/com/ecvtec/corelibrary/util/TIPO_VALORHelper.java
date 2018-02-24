/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ecvtec.corelibrary.util;

import java.util.List;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.PARAMETRO;
import br.com.ecvtec.corelibrary.model.TIPO;
import br.com.ecvtec.corelibrary.model.TIPO_VALOR;

/**
 *
 * @author Renato
 */
public class TIPO_VALORHelper {
    
    public static TIPO_VALOR getTIPO_VALORPorParametro(String nomeParametro) throws Exception{
        
        StringBuilder vsQuery = new StringBuilder();
        vsQuery.append(" FROM PARAMETRO ");
        vsQuery.append(" WHERE DESCRICAO = '");
        vsQuery.append(nomeParametro);
        vsQuery.append("' ");
        
        PARAMETRO parametro = (PARAMETRO) new GenericDAOBdAplicacao<PARAMETRO>().buscarObjetoDeHQL(vsQuery.toString());
        
        if(parametro == null){
            throw new Exception("Parametro nao encontrado para a chave " + nomeParametro);
        }
        
        try {
            Integer idTipoValor = Integer.parseInt(parametro.getVALOR());
            GenericDAOBdAplicacao<TIPO_VALOR> daoTIPO_VALOR = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);
            return daoTIPO_VALOR.encontrar(idTipoValor);
            
        } catch (NumberFormatException e) {
            throw new Exception("Valor nao Numerico encontrado para a chave " + nomeParametro);
        }
    }
    
    public static TIPO_VALOR getTIPO_VALORPorId(Integer idTipoValor) throws Exception{
        GenericDAOBdAplicacao<TIPO_VALOR> daoTIPO_VALOR = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);
        return daoTIPO_VALOR.encontrar(idTipoValor);
    }
    
    public static List<TIPO_VALOR> getTIPO_VALORPorDescricao(String descricao) throws Exception{
        GenericDAOBdAplicacao<TIPO_VALOR> daoTIPO_VALOR = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);
        
        StringBuilder vsQuery = new StringBuilder();
        vsQuery.append(" FROM TIPO_VALOR ");
        vsQuery.append(" WHERE DESCRICAO = '");
        vsQuery.append(descricao);
        vsQuery.append("' ");
        
        return daoTIPO_VALOR.buscarListaDeHQL(vsQuery.toString());
    }
    
    private static TIPO getTIPOPorParametro(String nomeParametro) throws Exception{
                
        StringBuilder vsQuery = new StringBuilder();
        vsQuery.append(" FROM PARAMETRO ");
        vsQuery.append(" WHERE DESCRICAO = '");
        vsQuery.append(nomeParametro);
        vsQuery.append("' ");
        
        PARAMETRO parametro = (PARAMETRO) new GenericDAOBdAplicacao<PARAMETRO>().buscarObjetoDeHQL(vsQuery.toString());
        
        if(parametro == null){
            throw new Exception("Parametro nao encontrado para a chave " + nomeParametro);
        }
        
        try {
            Integer idTipoValor = Integer.parseInt(parametro.getVALOR());
            GenericDAOBdAplicacao<TIPO> daoTIPO = new GenericDAOBdAplicacao<>(TIPO.class);
            return daoTIPO.encontrar(idTipoValor);
            
        } catch (NumberFormatException e) {
            throw new Exception("Valor nao Numerico encontrado para a chave " + nomeParametro);
        }
    }
    
    public static List<TIPO_VALOR> getListaTIPO_VALORPorTipo(String nomeParametroTipo) throws Exception{
        
        GenericDAOBdAplicacao<TIPO_VALOR> daoTIPO_VALOR = new GenericDAOBdAplicacao<>(TIPO_VALOR.class);
        TIPO tipo = getTIPOPorParametro(nomeParametroTipo);
        
        StringBuilder vsQuery = new StringBuilder();
        vsQuery.append(" FROM TIPO_VALOR ");
        vsQuery.append(" WHERE TIPO_DE_TIPO.ID__CHAVE_SEQUENCIAL = ");
        vsQuery.append(tipo.getID__CHAVE_SEQUENCIAL());       
        
        return daoTIPO_VALOR.buscarListaDeHQL(vsQuery.toString());
    }
    
}
