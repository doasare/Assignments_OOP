import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class ReadPopulation
{
   private int target;
   public ReadPopulation(int target)
   {
       this.target=target;
   }
   public int getTarget(){
       return this.target;
    }
   public int read ()
   {
       String fileName = "FilmQuizResults.txt";
       int i = 0;
       String[] city = new String[11];//new String[] read and store content in .txt line
       int[] pop = new int[11];//new int[] read and store content in .txt line
       String[] country = new String [11];
       String line =  null;
       ArrayList<Integer> pops = new ArrayList<Integer>();

            try 
            {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            
                 
               while((line = br.readLine()) != null) //read each line and stores data and ends if line empty
                {
                    
                    String [] tokens = line.split("\\s+");
                    
                    city [i] = tokens[0];
                    pops.add(Integer.parseInt(tokens[1]));
                    country[i] = tokens [2];
                    //System.out.println(city[i] + pop [i]+ country[i]);
                    i++;
                
                }
                }
                catch(FileNotFoundException ex) //if file not 
                {
                    System.out.println("Unable to open file '" + fileName + "'");               
                }
                catch(IOException e) 
                {
                    e.printStackTrace();
                    System.out.println("Error reading file '" + fileName + "'");                    
                } 
                
                int counter = 0;
                        
            for(int j=0;j<10;j++)
            {
                if (pops.get(j) >= this.target)
                {
                   counter = counter+1;
                   //System.out.println(country[j]+" "+city[j]+": City Population is creater than"+input+"with a population of"+pop[j]);
                }
            }
        
                
         return counter;
       
    }
    
   
}