import javax.ejb.Local;

/**
 * Created by ilya on 06.12.15.
 */
@Local
public interface UserCounter {

    int getOnlineUsers();
    void incrementUsers();
    void decrementUsers();

}
