/*Class Students containing all functions for operations on student data*/
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import org.json.*;
/*Creation of the class Students*/
public class Studenti {
    private String name;
    private String surname;
    private String email;
    private String CF;
    /*Creation of the procedure for the acquisition of the student’s name*/
    public void setName(String name){
        this.name = name;
    }
    /*Creation of function for visualization of the student’s name*/
    public String getName(){
        return this.name;
    }
    /*Creation of the procedure for the acquisition of the student’s username*/
    public void setUsername(String surname){
        this.surname = surname;
    }
    /*Creation of function for visualization of the student’s name*/
    public String getUsername(){
        return this.surname;
    }
    /*Creation of the procedure for the acquisition of the student’s email*/
    public void setEmail(String email){
        /*Checking for the @ in the email address. If it is present, its existence is verified*/
        Pattern pattern = Pattern.compile("@", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if(matchFound) {
            //if()
            this.email = email;
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }
    /*Creation of function for visualization of the student’s email*/
    public String getEmail(){
        return this.email;
    }
    /*Creation of the procedure for the acquisition of the student’s CF*/
    public void setCF(String CF){
        this.CF = CF;
    }
    /*Creation of function for visualization of the student’s CF*/
    public String getCF(){
        return this.CF;
    }
}