public interface IRegistrasi {

    boolean registrasiAkun(String username, String name, String phoneNumber, String email, String password);
  
    boolean registrasiGoogle(String email);
  
    boolean registrasiFacebook(String email);
  
    boolean registrasiApple(String email);
  }