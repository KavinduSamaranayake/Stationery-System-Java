/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getterSetter;

import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import projectoop.AddUser;

/**
 *
 * @author ksama
 */
public class AddUsersGetSet {
    
    
    private String userRole;
    private String name;
    private String mobileNumber;
    private String email;
    private String username;
    private String password;
    private String address;
    
    // Getter and setter methods for each field
    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to populate the User object from a HashMap
    public void retriveFromHashMap(HashMap<String, String> userAdd) {
        setUserRole(userAdd.get("userRole"));
        setName(userAdd.get("name"));
        setMobileNumber(userAdd.get("mobileNumber"));
        setEmail(userAdd.get("email"));
        setUsername(userAdd.get("username"));
        setPassword(userAdd.get("password"));
        setAddress(userAdd.get("address"));
    }
    
    
    
    
    
    
//    public void getUserInfo(HashMap<String, String> userInfo) {
//        
//        
//        // Retrieve values from the HashMap
//        String userRole = userInfo.get("userRole");
//        String name = userInfo.get("name");
//        String mobileNumber = userInfo.get("mobileNumber");
//        String email = userInfo.get("email");
//        String username = userInfo.get("username");
//        String password = userInfo.get("password");
//        String address = userInfo.get("address");
//        
//        // Do whatever you need with the retrieved values
//        System.out.println("User Role: " + userRole);
//        System.out.println("Name: " + name);
//        System.out.println("Mobile Number: " + mobileNumber);
//        System.out.println("Email: " + email);
//        System.out.println("Username: " + username);
//        System.out.println("Password: " + password);
//        System.out.println("Address: " + address);
//    }
    
    
    
    
    
//    public class AddUser_get_set {
//    private JComboBox<String> userCombo;
//    private JTextField nameTxt;
//    private JTextField mobileNumberTxt;
//    private JTextField emailTxt;
//    private JTextField userNameTxt;
//    private JTextField passwordTxt;
//    private JTextField addressTxt;
//    
//    public AddUser_get_set(){
//        
//        userCombo = new JComboBox<>();
//        nameTxt = new JTextField();
//        mobileNumberTxt = new JTextField();
//        emailTxt = new JTextField();
//        userNameTxt = new JTextField();
//        passwordTxt = new JTextField();
//        addressTxt = new JTextField();
//    
//    }  
//    
//    
//    // Getter and setter methods
//    public String getName() {
//
//        return nameTxt.getText();
//    }
//
//    public void setName(String name) {
//
//        this.nameTxt.setText(name);
//    }
//
//    public String getRole() {
//
//        return (String) userCombo.getSelectedItem();
//    }
//
//    public void setRole(String userRole) {
//        if (userCombo != null) {
//            userCombo.setSelectedItem(userRole);
//        } else {
//            System.err.println("userCombo is null");
//        }
//    }
//    
//
//    public String getMobileNumber() {
//        return mobileNumberTxt.getText();
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//
//        mobileNumberTxt.setText(mobileNumber);
//    }
//
//    public String getEmail() {
//
//        return emailTxt.getText();
//    }
//
//    public void setEmail(String email) {
//
//        emailTxt.setText(email);
//    }
//
//    public String getUserName() {
//
//        return userNameTxt.getText();
//    }
//
//    public void setUserName(String username) {
//
//        userNameTxt.setText(username);
//    }
//
//    public String getPassword() {
//
//        return passwordTxt.getText();
//    }
//
//    public void setPassword(String password) {
//
//        passwordTxt.setText(password);
//    }
//
//    public String getAddress() {
//
//        return addressTxt.getText();
//    }
//
//    public void setAddress(String name) {
//
//        addressTxt.setText(name);
//    }
// 
//    
//    }
}
