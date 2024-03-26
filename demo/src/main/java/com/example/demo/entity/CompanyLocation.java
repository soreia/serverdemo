package com.example.demo.entity;
public class CompanyLocation {
    private int id;
    private String chineseName;
    private String englishName;
    
    public CompanyLocation() {
        // Default constructor
    }
    
    public CompanyLocation(int id, String chineseName, String englishName) {
        this.id = id;
        this.chineseName = chineseName;
        this.englishName = englishName;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getChineseName() {
        return chineseName;
    }
    
    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }
    
    public String getEnglishName() {
        return englishName;
    }
    
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}