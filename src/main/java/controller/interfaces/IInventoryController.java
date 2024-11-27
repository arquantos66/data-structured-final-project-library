/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller.interfaces;

import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 *
 * @author moies
 */
public interface IInventoryController {

    ArrayList articles = new ArrayList();

    public <T> boolean insertArticle(T article) throws IllegalAccessException;

    public <T> boolean updatedArticle(T article) throws IllegalAccessException;

    public <T> T getArticle(String id) throws NoSuchElementException;

    public <T> ArrayList<T> getArticles();
    
    public <T> boolean removedArticle (String id) throws NoSuchElementException;

}
