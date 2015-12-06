import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Created by ilya on 06.12.15.
 */
@Stateless
@Local(UserCounter.class)
public class UserCounterBean implements UserCounter {

    @Override
    public int getOnlineUsers() {
        return 0;
    }
}
