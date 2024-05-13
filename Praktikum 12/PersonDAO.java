

// PersonDAO.java
class Person {

    public Person(String string) {
        //TODO Auto-generated constructor stub
    }
    // Atribut dan method class Person

    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
  }
  
  public interface PersonDAO {
    public void savePerson(Person p) throws Exception;
  }
  