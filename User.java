package Test2.Controller;

public class User {
    private String userName;
    private String passWord;
    private String email;
    
    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    

    public User(String userName, String passWord, String email) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    

    @Override
    public String toString() {
        return "User [userName=" + userName + ", passWord=" + passWord + ", email=" + email + "]";
    }
 


    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    

    
}
