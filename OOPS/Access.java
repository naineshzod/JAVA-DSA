public class Access {
    public static void main(String [] args)
    {
        BankAccount acc= new BankAccount();
        acc.username = "user123";
     
        acc.setpassword("pass123");
        System.out.println("Username: " + acc.username);
        // System.out.println("Password: " + acc.password); // This line would cause an error since password is private
        // Uncommenting the above line will result in a compilation error due to private access
        System.out.println("Password set successfully.");
        
    }
}
    class BankAccount{
        public String username;
        private String password;
        protected void setpassword(String pwd){
            password = pwd;
        }
    }

    
    

