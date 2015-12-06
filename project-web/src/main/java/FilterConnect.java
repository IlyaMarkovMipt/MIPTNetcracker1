import org.apache.log4j.Logger;

import javax.ejb.EJB;
import javax.servlet.*;
import java.io.IOException;

/**
 * Created by ilya on 06.12.15.
 */
public class FilterConnect implements Filter {

    private static final Logger log = Logger.getLogger(FilterConnect.class);

    @EJB
    UserCounter userCounter;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setAttribute("userNumber", userCounter.getOnlineUsers());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
