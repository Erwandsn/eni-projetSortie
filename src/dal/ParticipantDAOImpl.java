package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bo.Participant;

public class ParticipantDAOImpl implements ParticipantDAO{
	
	private final String GETALL ="SELECT * FROM Participants;";
	
	public ArrayList<Participant> getAll() throws SQLException{
		ArrayList<Participant> listeParticipant = new ArrayList<>();
		try(Connection cnx = ConnectionProvider.getConnection())
		{
			PreparedStatement pstmt = cnx.prepareStatement(GETALL, PreparedStatement.RETURN_GENERATED_KEYS);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				listeParticipant.add(mapPartipant(rs));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw new SQLException();
		}
		return listeParticipant;
		
	}
	
	private Participant mapPartipant(ResultSet rs) {
		Participant unParticipant = new Participant();
		try {
			unParticipant.setId(rs.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return unParticipant;
	}
}
