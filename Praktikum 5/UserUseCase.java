public class UserUseCase extends UserRepository {
    public void loginUser(String username, String password){
        if(username == "Ucup" && password =="PBO"){
            System.out.print("HALO SELAMAT DATANG");
        } else {
            System.out.print("SALAH BANG");
        }
    }

    public void logoutUser(){
        System.out.print("DADAH");
    }
}