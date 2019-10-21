/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;
/**
 *
 * @author ariela
 */
public class Address {
	//comentario de teste para uso pagliaGod
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String country;
    
    public Address(String address, String zipCode, String city, String state, String country){
        this.address = address;
        this.city    = city;
        this.country  = country;
        this.state   = state;
        this.zipCode = zipCode;
        
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(){
        this.address = address;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(){
        this.city = city;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(){
        this.country = country;
    }
    
    public String getState(){
        return state;
    }
    
    public void setSate(){
        this.state = state;
    }
    
    public String getZipCode(){
        return zipCode;
    }
    
    public void setZipCode(){
        this.zipCode = zipCode;
    }  
    
    @Override
    public String toString(){         
        return "< Address: address = "+ address + 
               " ,zipCode = "+ zipCode + 
               " ,city = "   + city +
               " ,state = "  + state + 
               " ,coutry ="  + country +
               " >";
    }
}