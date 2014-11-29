 package com.util;
 
 public class StringUtil { public StringUtil() {}
   
  public static String nullValue(String str) { return nullValue(str, ""); }
   
   public static String nullValue(String str, String defaultString)
   {
     if (str == null) {
       str = "";
     }
  if (defaultString == null) {
       defaultString = "";
     }
   if (str.length() == 0) {
       str = defaultString;
     }
    return str;
   }
 }

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.util.StringUtil
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */