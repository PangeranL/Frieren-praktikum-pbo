public interface IValidasi {

    boolean validasiUsername(String username);
  
    boolean validasiNama(String name);
  
    boolean validasiNomorTelepon(String phoneNumber);
  
    boolean validasiEmail(String email);
  
    boolean validasiPassword(String password);
  }