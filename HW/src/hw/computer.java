
package hw;

import java.util.Date;


public class computer {
    private long ID;
    private String core;
    private String ram;
    private int Mdate;
    private String company;
    
   
    public void setID(long ID){
    this.ID=ID;
    }
    
     public long getID(){
         return ID;
    }
     
      public void setcore(String Core){
    this.core=Core;
    }
    
     public String getcore(){
         return core;
    }
     
      public void setRam(String ram){
    this.ram=ram;
    }
    
     public String getRam(){
         
         return ram;
    }
     
      public void setDate(int date){
    this.Mdate=date;
    }
    
     public int getDate(){
         return Mdate;
    }
     
       public void setCompany(String Company){
    this.company=Company;
    }
    
     public String getCompany(){
         return company;
    }
     
    
    
}
