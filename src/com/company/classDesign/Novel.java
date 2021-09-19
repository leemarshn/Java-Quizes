package com.company.classDesign;

import java.util.stream.Stream;

/**
 * @author - LeeN
 * PROJECT NAME: Java-Quiz-Yourself
 * CREATED ON: Sunday 19 September 2021 - 7:29 PM
 */
public class Novel extends Prose implements Text {
    private String content;
    private String author;

   @Override
   public void setAuthor(String name){
       this.author = name;
   }

   @Override
   public void setContent(String content){
       this.content = content;
   }

   public String getAuthor(){
       return author;
   }

   @Override
   public String getContent(){
       return content;
   }

    public static void main(String[] args) {
        Novel nv = new Novel();

        nv.setAuthor("Lee");
        nv.setContent("Loves codding");


        System.out.println("Author: " +nv.getAuthor());
        nv.spellCheck();
        System.out.println("Content: " + nv.getContent());
    }
}
