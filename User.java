package builder;

//import javax.swing.plaf.basic.ButtonActionListener;//

public class User {
    private final String firstName; // Obligatorio
    private final String lastName;  // Obligatorio
    private final int age;          // Opcional
    private final String phone;     // Opcional
    private final String address;   // Opcional

    
    /*NOTA: Profe dejé comantado este código por si en algún momento requieor consultarlo de nuevo, abajo añado el constructor acorde al md*/

    /*  Constructor telescópico problemático
    public User(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }
    public User(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "");
    }
    public User(String firstName, String lastName, int age, String phone) {
        this(firstName, lastName, age, phone, "");
    }
    public User(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
    */ 
   
   private User(Builder builder){
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phone = builder.phone;
    this.address = builder.address;
   }
   
   // ... Getters ... //

@Override
public String toString() {
    return "User{" + firstName + " " + lastName + ", age=" + age + ", phone=" + phone + ", address=" + address + "}";
}

/*CLASE */

public static class Builder {
    private final String firstName;
    private final String lastName; 
    private int age = 0;
    private String phone = ""; 
    private String address = "";
    

    public Builder(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Builder age (int age){
        this.age = age;
        return this;
    }

    public Builder phone (String phone){
        this.phone = phone;
        return this;
    }

    public Builder address (String adress){
        this.address = adress;
        return this;
    }

    public User build(){
        return new User(this);
    }


    }

}
