package com.example.rsu.myproject;

public class ListView_DataShow {

    //private String url;
    private int[] ImgItem;
    private String[] title;
    private String[] Snumber;

    public ListView_DataShow(/*String url,*/ int[] ImgItem, String[] title,String[] snumber){
        //this.url = url;
        this.ImgItem = ImgItem;
        this.title = title;
        this.Snumber = snumber;
    }

    /*public String getUrl(){
        return this.url;
    }

    public void setUrl(String url){ this.url = url; }*/

    public int[] getImgItem() {
        return ImgItem;
    }

    public void setImgItem(int[] imgItem) {
        ImgItem = imgItem;
    }

    public String[] getTitle() {
        return title;
    }

    public void setTitle(String[] title) {
        this.title = title;
    }

    public String[] getSnumber() {
        return Snumber;
    }

    public void setSnumber(String[] snumber) {
        Snumber = snumber;
    }
}
