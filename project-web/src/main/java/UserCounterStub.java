/**
 * Created by ilya on 06.12.15.
 */
public class UserCounterStub implements UserCounter {

    @Override
    public int getOnlineUsers() {
        return 15;
    }

    @Override
    public void incrementUsers() {

    }

    @Override
    public void decrementUsers() {

    }
}
