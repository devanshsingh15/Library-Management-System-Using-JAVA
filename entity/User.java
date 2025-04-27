package project.LibraryManagementSystem.entity;

public class User{
    public String name;
    public String userID;
    public String password;

    public User(String name, String userID, String password){
        this.name = name;
        this.password = password;
        this.userID = userID;
    }
    
    public String toString() {
    	return ("Name: " + name + ", userID: " + userID); 
    }

}
