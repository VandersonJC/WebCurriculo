package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.*;

public class UsuarioDAO {

	ConectBD conectBD = new ConectBD();
	Connection con = conectBD.connect();
	PreparedStatement stmt;
	
	public ArrayList<usuario> list() throws SQLException
	{
		
		ArrayList<usuario> list = new ArrayList<usuario>();
		String sql = "SELECT * FROM usuario";
		
		try {
		stmt = con.prepareStatement(sql);
		ResultSet response = stmt.executeQuery();
		while(response.next()) 
		{
			usuario usuario = new usuario();
			usuario.setId(response.getInt("id"));
			usuario.setNome(response.getString("nome"));
			usuario.setSenha(response.getString("senha"));
			list.add(usuario);
		}
		
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	return list;
	
	}
	
	
	public boolean valid(String login, String password) throws SQLException
	{
		boolean valid = false;
		
		ArrayList<usuario> listValid = list();
		for (usuario usuario : listValid) {
			if(login.equals(usuario.getNome()) && password.equals(usuario.getNome())) {
				valid = true;
			}
		}
		return valid;
	}	
	
}
