import javax.ejb.*;

/**
 * Created by ilya on 06.12.15.
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Local(UserCounter.class)
public class UserCounterBean implements UserCounter {
    int usersCount;


    @Override
    public void incrementUsers() {
        usersCount++;
    }

    @Override
    public void decrementUsers() {
        usersCount--;
    }



    @Override
    public int getOnlineUsers() {
        return usersCount;
    }
}
