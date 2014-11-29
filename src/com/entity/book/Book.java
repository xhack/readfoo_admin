package com.entity.book;

import java.util.Date;
import java.util.List;

public class Book
{
  private String id;
  private String bookName;
  private String subtitle;
  private List<String> authors;
  private String isbn;
  private double price;
  private double sellPrice;
  private String publishHouse;
  private int format;
  private int totalPage;
  private String language;
  private String directory;
  private String aboutBook;
  private String aboutAuthor;
  private String coverPath;
  private String coverThumbnailPath;
  private Date publishDate;
  private List<BookPath> bookPaths;
  private String remark;
  private Date createDate;
  
  public Book() {}
}

/* Location:           E:\workspace\admin\web\WEB-INF\classes
 * Qualified Name:     com.entity.book.Book
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.7.0.1
 */