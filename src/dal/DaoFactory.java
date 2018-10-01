package dal;

public class DaoFactory {
	
	public static ParticipantDAOImpl getParticipantDao() {
		return new ParticipantDAOImpl();
	}
	
}
