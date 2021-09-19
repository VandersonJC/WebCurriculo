package dao;

import java.sql.*;
import java.util.ArrayList;

import entities.*;

public class PessoaDAO {

	Connection con = new ConectBD().connect();
	PreparedStatement stmt;
	
	public void save (pessoa pessoa) throws SQLException
	{
		String sql = "";
		
		if(pessoa.getId() > 0) {
			
			sql = "UPDATE pessoa SET nome = ?, email = ?, telefone = ?, data_nascimento = ? WHERE id = ? ";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getTelefone());
			stmt.setDate(4, new java.sql.Date(pessoa.getData_nascimento().getTime()) );
			stmt.setInt(5, pessoa.getId());
			stmt.execute();
		}else{
			
			sql = "INSERT INTO pessoa(nome, email, telefone, data_nascimento) VALUES(?,?,?,?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getEmail());
			stmt.setString(3, pessoa.getTelefone());
			stmt.setDate(4, new java.sql.Date(pessoa.getData_nascimento().getTime()) );
			stmt.execute();		
				
		}

	}
	
	public void delete(pessoa pessoa) throws SQLException 
	{
		
		String sql = "DELETE FROM pessoa WHERE id = ?";
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, pessoa.getId());
		stmt.execute();	
		
	}
	
	public ArrayList<pessoa> list() throws SQLException
	{
		
		ArrayList<pessoa> list = new ArrayList<pessoa>();
		String sql = "SELECT * FROM pessoa";
		stmt = con.prepareStatement(sql);
		ResultSet response = stmt.executeQuery();
		while(response.next()) 
		{
			pessoa pessoa = new pessoa();
			pessoa.setId(response.getInt("id"));
			pessoa.setNome(response.getString("nome"));
			pessoa.setEmail(response.getString("email"));
			pessoa.setTelefone(response.getString("telefone"));
			pessoa.setData_nascimento(response.getDate("data_nascimento"));
			list.add(pessoa);
		}
		
		return list;
	}
	
	public ArrayList<pessoa> listFilter(int id) throws SQLException
	{
		
		ArrayList<pessoa> list = new ArrayList<pessoa>();
		String sql = "SELECT * FROM pessoa WHERE id=?";
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet response = stmt.executeQuery();
		while(response.next()) 
		{
			pessoa pessoa = new pessoa();
			pessoa.setId(response.getInt("id"));
			pessoa.setNome(response.getString("nome"));
			pessoa.setEmail(response.getString("email"));
			pessoa.setTelefone(response.getString("telefone"));
			pessoa.setData_nascimento(response.getDate("data_nascimento"));
			list.add(pessoa);
		}
		
		return list;
	}
	
	
}
