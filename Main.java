package builder;

public class Main {
    public static void main(String[] args) {
        // Difícil de leer, ¿qué es cada parámetro?
        User user1 = new User.Builder("Juan", "Pérez")
            .age(30)
            .phone("+123456789")
            .address("Calle Falsa 123")
            .build();
        System.out.println(user1);


        User user2 = new User.Builder("Alexandra", "Flores")
            .phone("+987654321")
            .build();
        System.out.println(user2);


        User user3 = new User.Builder("Carlos", "Jiménez")
            .age(25)
            .address("Avenida Siempre Viva 200")
            .build();
        System.out.println(user3);
    }
}
