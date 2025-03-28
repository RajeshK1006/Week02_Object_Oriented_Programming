import java.util.*;

class Q1{

  public static void main(String[] args){
    
    Book obj1 = new Book("Game of thrones","jane doe",10000);

    
    
    obj1.display();
    
    
    
  }  
}

class Book{
  
  static private String libraryName = "Anna Library";
  
  private String title;
  private String author;
  private final int isbn;
  
  public Book(String title , String author, int isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }
  
  static void displayLibraryName(){
    System.out.println("The name of this libray is: "+libraryName);
  }
  
  
  void display(){
    if(this instanceof Book){
      System.out.println("The Book title is : "+this.title);
      System.out.println("The Book AUTHOR is : "+this.author);
      System.out.println("The BOOK isbn number is : "+this.isbn);
    }
    else{
      System.out.println("Invalid object or instance");
    }
  }
  
}