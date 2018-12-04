/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.projet.biblio.consumer.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.projet.biblio.model.Client;
import org.springframework.jdbc.core.RowMapper;

/* 
Implementation pour définir le mapping entre les lignes de résultats d'une requête Sql et les objets java à créer.
*/

public class ClientMapper implements RowMapper<Client> {

  	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {

		Client client = new Client();
                
                		client.setRefClient(rs.getInt("refclient"));
                                
                                      client.setRefBibliotheque(rs.getInt("refbibliotheque"));
                                
                                	client.setNom(rs.getString("nom"));
                                        
		client.setPrenom(rs.getString("prenom"));
                
                		client.setSexe(rs.getString("sexe"));

		client.setPseudo(rs.getString("pseudo"));
                
                                       client.setMotPasse(rs.getString("motpasse"));
                                       
                                       client.setAdresse(rs.getString("adresse"));

		client.setEmail(rs.getString("email"));
                
                                      client.setCodePostal(rs.getString("codepostal"));



		return client; 
        }
    
}
