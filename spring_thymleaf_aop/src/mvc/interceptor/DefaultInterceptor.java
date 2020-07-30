package mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class DefaultInterceptor implements HandlerInterceptor {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	// controller�� ������ ���� ó���ϴ� ���ͼ���
		// ��ȯ�� false��� controller�� ��û�� ����
		// �Ű����� Object�� �ڵ鷯 ������ �ǹ��Ѵ�. ( RequestMapping , DefaultServletHandler ) 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("inter>>pre");
		logger.info("inter>>pre");
		//response.sendRedirect("/");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("inter>>post");
		logger.warn("inter>>post");
		
	}
	// view���� ó���� ���� �Ŀ� ó����
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("inter>>after view");
		logger.error("inter>>after view");
		
	}

	
}
