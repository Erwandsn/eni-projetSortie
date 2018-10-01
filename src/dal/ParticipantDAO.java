package dal;

import java.sql.SQLException;
import java.util.ArrayList;

import bo.Participant;

public interface ParticipantDAO {
	
	public ArrayList<Participant> getAll() throws SQLException;
	
}
