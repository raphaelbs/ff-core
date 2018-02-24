package br.com.ecvtec.corelibrary.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import br.com.ecvtec.corelibrary.dao.QueryDAO.Parametros;
import br.com.ecvtec.corelibrary.dao.QueryDAO.Resultados;
import br.com.ecvtec.corelibrary.model.MENU_ITEM;

public class MenuDAO {

	public List<MENU_ITEM> getMenuPorId(int menuId, int usuarioId) throws SQLException {

		StringBuilder vsQuery = new StringBuilder();
		vsQuery.append("select c1_9802 as 'ID', c3_9802 as 'DESCRICAO', c6_9802 as 'FORM', ");
		vsQuery.append("c7_9802 as 'ORDENACAO', c5_9802_9802 as 'MENU_PAI' from t9801 menu ");
		vsQuery.append("inner join t9802 menuItem on menu.c1_9801 = menuItem.c2_9802_9801 ");
		vsQuery.append("inner join t9803 menuPerfil on menu.c1_9801 = menuPerfil.c2_9803_9801 ");
		vsQuery.append("inner join t9804 menuPerfilItem on menu.c1_9801 = menuPerfilItem.c2_9804_9801 ");
		vsQuery.append("	and menuItem.c1_9802 = menuPerfilItem.c4_9804_9802 ");
		vsQuery.append("    and menuPerfil.c1_9803 = menuPerfilItem.c3_9804_9803 ");
		vsQuery.append("inner join t1099 perfil on menuPerfil.c1_9803 = perfil.c4_1099_9803 ");
		vsQuery.append("where menu.c1_9801 = ? and perfil.c2_1099_1001 = ? ");
		vsQuery.append("and menuItem.c3_9802 is not null ");
		vsQuery.append("order by c7_9802 ");
		
		
		List<MENU_ITEM> menu = new QueryDAO<List<MENU_ITEM>>(vsQuery.toString())
				.setParametros(new Parametros() {
					@Override
					public void setParametros(PreparedStatement pstm) throws SQLException {
						pstm.setInt(1, menuId);
						pstm.setInt(2, usuarioId);
					}
				})
				.setResultados(new Resultados<List<MENU_ITEM>>() {
					@Override
					public List<MENU_ITEM> lerResultSet(ResultSet rs) throws SQLException {
						List<MENU_ITEM> menu = new ArrayList<>();
						while (rs.next()) {
							MENU_ITEM itemMenu = new MENU_ITEM();
							itemMenu.setID__CHAVE_SEQUENCIAL(rs.getInt("ID"));
							itemMenu.setDESCRICAO(rs.getString("DESCRICAO"));
							itemMenu.setFORM(rs.getString("FORM"));
							itemMenu.setORDERNACAO(rs.getInt("ORDENACAO"));

							List<MENU_ITEM> menuFilho = getMenuPorIdPai(rs.getInt("ID"));
							if (menuFilho.size() > 0) {
								itemMenu.setMENU_SUPERIOR_MENU_ITEMs(new HashSet());
								itemMenu.getMENU_SUPERIOR_MENU_ITEMs().addAll(menuFilho);
							}

							menu.add(itemMenu);
						}
						return menu;
					}
				}).executar();

		return menu;
	}

	public List<MENU_ITEM> getMenuPorIdPai(int menuIdPai) throws SQLException {

		StringBuilder vsQuery = new StringBuilder();
		vsQuery.append(
				" select c1_9802 as 'ID',c3_9802 as 'DESCRICAO',c6_9802 as 'FORM',c7_9802 as 'ORDENACAO',c5_9802_9802 as 'MENU_PAI' ");
		vsQuery.append(" from t9802 where C5_9802_9802 = ?  order by c7_9802 ");
		
		
		List<MENU_ITEM> menu = new QueryDAO<List<MENU_ITEM>>(vsQuery.toString())
				.setParametros(new Parametros() {
					@Override
					public void setParametros(PreparedStatement pstm) throws SQLException {
						pstm.setInt(1, menuIdPai);
					}
				})
				.setResultados(new Resultados<List<MENU_ITEM>>() {
					@Override
					public List<MENU_ITEM> lerResultSet(ResultSet rs) throws SQLException {
						List<MENU_ITEM> menu = new ArrayList<>();
						while (rs.next()) {
							MENU_ITEM itemMenu = new MENU_ITEM();
							itemMenu.setID__CHAVE_SEQUENCIAL(rs.getInt("ID"));
							itemMenu.setDESCRICAO(rs.getString("DESCRICAO"));
							itemMenu.setFORM(rs.getString("FORM"));
							itemMenu.setORDERNACAO(rs.getInt("ORDENACAO"));

							menu.add(itemMenu);
						}
						return menu;
					}
				}).executar();

		return menu;
	}

}
