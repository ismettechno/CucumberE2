package _JDBC;

import java.util.ArrayList;

public class _05_DBUtilitySoru {

    // Gönderilen sorgu sonucundaki tüm datayı bir List olarak döndüren metodu yazınız.
    public static void main(String[] args) {

        String sorguSql="select film_id,title,release_year from film";
        ArrayList<ArrayList<String>> donenData= getListData(sorguSql);

        System.out.println("donenData = " + donenData);
    }

    // getListData



}
