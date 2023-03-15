import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("Subaru", "Impreza");
        //subaru.setFabricante("Subaru");
        //subaru.setModelo("Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setTanque(new Tanque());
        //subaru.setColor("Blanco");
        subaru.setColor(Color.BLANCO);

        //Automovil mazda = new Automovil("Mazda", "BT-50", "Rojo", 3.0);
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DISEL));
        mazda.setTanque(new Tanque(45));
        //mazda.setFabricante("Mazda");
        //mazda.setModelo("BT-50");
        //mazda.setCilindrada(3.0);
        //mazda.setColor("Rojo");

        //Automovil nissan = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DISEL), new Tanque(50));
        //Automovil nissan2 = new Automovil("Nissan", "Navara", "Gris oscuro", 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Tanque(50));

        Automovil auto = new Automovil();
        Date fecha = new Date();
        System.out.println("Sin iguales? " + (nissan == nissan2));
        System.out.println("Sin iguales? con equals " + (nissan.equals(nissan2)));
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());

        System.out.println(auto.equals(nissan));
        System.out.println(auto.equals(fecha));
        System.out.println(nissan);
        System.out.println(nissan.toString());

        System.out.println(mazda.acelerarFrenar(4000));
        System.out.println("Kilometraje por litro " + subaru.calcularConsumo(300, 0.75f));
        System.out.println("Kilometraje por litro " + subaru.calcularConsumo(300, 60));
        System.out.println("Kilometraje por litro " + nissan.calcularConsumo(300, 60));
    }
}