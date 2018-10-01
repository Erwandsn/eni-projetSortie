package bll;

import java.sql.SQLException;
import java.util.ArrayList;

import bo.Participant;
import dal.DaoFactory;
import dal.ParticipantDAO;

public class ParticipantManager {
	
	private ParticipantDAO participantDao;
	
	public ParticipantManager() {
		this.participantDao = DaoFactory.getParticipantDao();
	}
	
	private ParticipantDAO getDao() {
		return this.participantDao;
	}
	
	public ArrayList<Participant> getAll() {
		ArrayList<Participant> listeParticipant = new ArrayList<>();
		ParticipantDAO dao = getDao();
		try {
			listeParticipant = dao.getAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listeParticipant;
	}
	
	public void insertOne() {
		
	}
}
