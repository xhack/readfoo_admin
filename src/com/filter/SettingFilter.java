 package com.filter;
 
 import java.io.IOException;
 import javax.servlet.Filter;
 import javax.servlet.FilterChain;
 import javax.servlet.FilterConfig;
 import javax.servlet.ServletException;
 import javax.servlet.ServletRequest;
 import javax.servlet.ServletResponse;
 import org.apache.log4j.lf5.LogRecord;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 public class SettingFilter
   implements Filter
 {
   public SettingFilter() {}
   
   public void destroy() {}
   
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
     throws IOException, ServletException
   {
     chain.doFilter(request, response);
   }
   
 
 
 
   public void init(FilterConfig fConfig)
     throws ServletException
   {}
   
 
 
   public boolean isLoggable(LogRecord record)
   {
     return false;
   }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.filter.SettingFilter
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */