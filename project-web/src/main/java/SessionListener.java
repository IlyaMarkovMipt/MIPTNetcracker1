import javax.ejb.EJB;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by ilya on 13.12.15.
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    @EJB
    UserCounter counter;

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        counter.incrementUsers();
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        counter.decrementUsers();
    }
}
