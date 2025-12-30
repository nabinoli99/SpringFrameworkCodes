package in.nabin.beans;


public class User
{
    private int userid;
    private String username;
    private String password;
    private Address address;

//    public User(int userid, String username, String password, Address address) {
//        this.userid = userid;
//        this.username = username;
//        this.password = password;
//        this.address = address;
//    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void display()
    {
        System.out.println("User Details:- ");
        System.out.println("Id: "+userid);
        System.out.println("Username: "+username);
        System.out.println("Pasword: "+password);
        System.out.println("Address: "+address);
    }
}
