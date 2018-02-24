package br.com.ecvtec.corelibrary.util;

import java.util.List;

import br.com.ecvtec.corelibrary.dao.GenericDAOBdAplicacao;
import br.com.ecvtec.corelibrary.model.CIDADE;
import br.com.ecvtec.corelibrary.model.CIDADE_BAIRRO;
import br.com.ecvtec.corelibrary.model.ENDERECO;
import br.com.ecvtec.corelibrary.model.TIPO_VALOR;
import br.com.ecvtec.corelibrary.model.UNIDADE_DA_FEDERACAO;

/**
 *
 * @author Renato
 */
public class GEOGRAFIAHelper {
    
    public static List<TIPO_VALOR> listarRegioes() throws Exception{
        return TIPO_VALORHelper.getListaTIPO_VALORPorTipo("TP_REGIOES");
    }
    
    public static List<UNIDADE_DA_FEDERACAO> listarEstados() throws Exception{
        return new GenericDAOBdAplicacao<UNIDADE_DA_FEDERACAO>(UNIDADE_DA_FEDERACAO.class).getList();
    }
    
    public static List<UNIDADE_DA_FEDERACAO> listarEstadosPorRegiao(Integer idRegiao) throws Exception{
        GenericDAOBdAplicacao<UNIDADE_DA_FEDERACAO> ufDAO = new GenericDAOBdAplicacao<>();
        
        StringBuilder vsQuery = new StringBuilder();
        vsQuery.append(" FROM UNIDADE_DA_FEDERACAO as UF ");
        vsQuery.append(" WHERE UF.REGIAO.ID__CHAVE_SEQUENCIAL = ");
        vsQuery.append(idRegiao);
        
        return ufDAO.buscarListaDeHQL(vsQuery.toString());
    }
    
    public static List<CIDADE> listarCidades() throws Exception{
        return new GenericDAOBdAplicacao<CIDADE>(CIDADE.class).getList();
    }
    
    public static CIDADE recuperarCidadePorId(Integer id) throws Exception{
        return new GenericDAOBdAplicacao<CIDADE>(CIDADE.class).encontrar(id);
    }
    
    public static List<CIDADE> listarCidadesPorEstado(Integer idEstado) throws Exception{
        GenericDAOBdAplicacao<CIDADE> cidadeDAO = new GenericDAOBdAplicacao<>();
        
        StringBuilder vsQuery = new StringBuilder();
        vsQuery.append(" FROM CIDADE C ");
        vsQuery.append(" WHERE C.UF.ID__CHAVE_SEQUENCIAL = ");
        vsQuery.append(idEstado);
        
        return cidadeDAO.buscarListaDeHQL(vsQuery.toString());
    }
    
    public static List<CIDADE_BAIRRO> listarBairrosPorCidade(Integer idCidade) throws Exception{
        StringBuilder queryHQL = new StringBuilder();
        queryHQL.append("FROM CIDADE_BAIRRO CB ");
        queryHQL.append("WHERE CB.CIDADE.ID__CHAVE_SEQUENCIAL = ");
        queryHQL.append(idCidade);

        GenericDAOBdAplicacao<CIDADE_BAIRRO> dao = new GenericDAOBdAplicacao<>(CIDADE_BAIRRO.class);
        return dao.buscarListaDeHQL(queryHQL.toString());
    }
    
    public static CIDADE_BAIRRO recuperarBairroPorId(Integer idCidade, Integer idBairro) throws Exception{
        StringBuilder queryHQL = new StringBuilder();
        queryHQL.append("FROM CIDADE_BAIRRO CB ");
        queryHQL.append("WHERE CB.CIDADE.ID__CHAVE_SEQUENCIAL = ");
        queryHQL.append(idCidade);
        queryHQL.append("AND CB.ID__CHAVE_SEQUENCIAL = ");
        queryHQL.append(idBairro);

        GenericDAOBdAplicacao<CIDADE_BAIRRO> dao = new GenericDAOBdAplicacao<>(CIDADE_BAIRRO.class);
        
        return (CIDADE_BAIRRO) dao.buscarObjetoDeHQL(queryHQL.toString());
    }
    
    public static List<ENDERECO> listarEnderecosPorCidadeId(Integer idCidade) throws Exception{
        StringBuilder queryHQL = new StringBuilder();
        queryHQL.append("FROM ENDERECO E ");
        queryHQL.append("WHERE E.CIDADE.ID__CHAVE_SEQUENCIAL = ");
        queryHQL.append(idCidade);

        GenericDAOBdAplicacao<ENDERECO> dao = new GenericDAOBdAplicacao<>(ENDERECO.class);
        return dao.buscarListaDeHQL(queryHQL.toString());
    }
    
    public static ENDERECO recuperarEnderecoPorId(Integer idCidade, Integer idEndereco) throws Exception{
        StringBuilder queryHQL = new StringBuilder();
        queryHQL.append("FROM ENDERECO E ");
        queryHQL.append("WHERE E.CIDADE.ID__CHAVE_SEQUENCIAL = ");
        queryHQL.append(idCidade);
        queryHQL.append("AND E.ID__CHAVE_SEQUENCIAL = ");
        queryHQL.append(idEndereco);

        GenericDAOBdAplicacao<ENDERECO> dao = new GenericDAOBdAplicacao<>(ENDERECO.class);
        return (ENDERECO) dao.buscarObjetoDeHQL(queryHQL.toString());
    }
    
    
    
}
