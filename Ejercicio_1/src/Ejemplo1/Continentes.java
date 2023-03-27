package Ejemplo1;

public enum Continentes {
    AMERICA, EUROPA, ASIA, AFRICA, OCEANIA
}

class main {
    public static void main(String[] args) {
        Continentes continentes = Continentes.AMERICA;
        System.out.println("Usted se encuentra en el continente de : " + continentes);
    }
}
