


import java.util.ArrayList; 

public class Book {
    private String title;
    private String author;
    private  boolean isAvailable;
    public Book(String title , String author  ){
        this.title = title ;
        this.author = author;
        this.isAvailable = true;
        
    }
    public void borrowBook(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("This book is borrowed succefully");
        }
        else{
            System.out.println("This book is already borrowed");
        }
    }
    public void returnbook(){
        isAvailable = true;
    }
    public String getBookInfo(){
        String a = isAvailable?  "available" : "not available";
        return "title :"+title+ ",author"+author+ ",availability:"+a ;
    }
    }

    