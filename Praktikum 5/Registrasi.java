public class Registrasi implements IRegistrasi {

  private final IValidasi validator;

  public Registrasi(IValidasi validator) {
    this.validator = validator;
  }

  @Override
  public boolean registrasiAkun(String username, String name, String phoneNumber, String email, String password) {
    if (!validator.validasiUsername(username)) {
      return false;
    }
    if (!validator.validasiNama(name)) {
      return false;
    }
    if (!validator.validasiNomorTelepon(phoneNumber)) {
      return false;
    }
    if (!validator.validasiEmail(email)) {
      return false;
    }
    if (!validator.validasiPassword(password)) {
      return false;
    }
    return true;
  }

  @Override
  public boolean registrasiGoogle(String email) {
    return email.equals("pboa1@gmail.com");
  }

  @Override
  public boolean registrasiFacebook(String email) {
    return email.equals("pboa1@gmail.com");
  }

  @Override
  public boolean registrasiApple(String email) {
    return email.equals("pboa1@gmail.com");
  }
}