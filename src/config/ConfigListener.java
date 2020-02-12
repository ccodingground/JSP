package config;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.BoardDAO;

@WebListener
public class ConfigListener implements ServletContextListener {
	
    public ConfigListener() {
        // TODO Auto-generated constructor stub
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         //서버시작시 실행되는 메서드
    	String resource = "mybatis/mybatis-config.xml";
    	InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = 
					new SqlSessionFactoryBuilder().build(inputStream);
			BoardDAO boardDAO=new BoardDAO(sqlSessionFactory);
			
			ServletContext servletContext=sce.getServletContext();
			servletContext.setAttribute("boardDAO", boardDAO);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    }
	
}
