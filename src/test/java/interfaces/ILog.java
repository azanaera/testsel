package interfaces;

public interface ILog {
	void login(String user, String pass, boolean canLog);
	void logout();
}
