public class Automovil implements Comparable<Automovil> {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.AZUL;
    //private String color = COLOR_AZUL;
    private Motor motor;
    private Tanque tanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;
    private TipoAutomovil tipo;
    private static Color colorPatente = Color.NARANJA;
    //private static String colorPatente = "Naranja";
    private static int capacidadTanqueEstatico = 30;
    private static int ultimoId;
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;
    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }


    public Automovil(String fabricante, String modelo, Color color) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        this(fabricante, modelo);
        this.color = color;
    }

    /*public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }*/
    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    /*public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadTanque) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        //this.cilindrada = cilindrada;
        this(fabricante, modelo, color, cilindrada);
        this.capacidadTanque = capacidadTanque;
    }*/
    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque) {
        //this.fabricante = fabricante;
        //this.modelo = modelo;
        //this.color = color;
        //this.cilindrada = cilindrada;
        this(fabricante, modelo, color, motor);
        this.tanque = tanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Tanque tanque, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, tanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /*public String getColor() {
        return color;
    }*/
    public Color getColor() {
        return color;
    }

    /*public void setColor(String color) {
        this.color = color;
    }*/
    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Tanque getTanque() {
        if (tanque == null) {
            this.tanque = new Tanque();
        }
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) {
        if (indiceRuedas < this.ruedas.length) {
            this.ruedas[indiceRuedas++] = rueda;
        }
        return this;
    }

    /*public static String getColorPatente() {
                return colorPatente;
            }*/
    public static Color getColorPatente() {
        return colorPatente;
    }

    /*  public static void setColorPatente(String colorPatente) {
          Automovil.colorPatente = colorPatente;
      }*/
    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public String verDetalle() {
        /*StringBuilder sb = new StringBuilder();
        sb.append("automovil.fabricante = " + this.fabricante);
        sb.append("\nautomovil.modelo = " + this.modelo);
        sb.append("\nautomovil.color = " + this.color);
        sb.append("\nautomovil.cilindrada = " + this.cilindrada);
        return sb.toString();*/

        /*String sb = "automovil.fabricante = " + this.fabricante +
                "\nautomovil.modelo = " + this.modelo +
                "\nautomovil.color = " + this.color +
                "\nautomovil.cilindrada = " + this.cilindrada;
        return sb;*/

        String detalle = "automovil.id = " + this.id +
                "\nautomovil.fabricante = " + this.getFabricante() +
                "\nautomovil.modelo = " + this.getModelo();
        if (this.getTipo() != null) {
            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();
        }
                /*"\nautomovil.color = " + this.color +
                "\nautomovil.patenteColor = " + colorPatente +*/
        detalle += "\nautomovil.color = " + this.color.getColor() +
                "\nautomovil.patenteColor = " + colorPatente.getColor();
        if (this.motor != null) {
            detalle += "\nautomovil.cilindrada = " + this.motor.getCilindrada();
        }
        if (getConductor() != null) {
            detalle += "\nConductor subaru: " + this.getConductor();
        }
        if (getRuedas() != null) {
            detalle += "\nRuedas del automovil: ";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + fabricante + " acelerando a " + rpm + " rpm";
    }

    public String frenar() {
        return fabricante + " " + modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km / (this.getTanque().getCapacidad() * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km / (this.getTanque().getCapacidad() * (porcentajeGasolina / 100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina) {
        return km / (capacidadTanqueEstatico * (porcentajeGasolina / 100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null && this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " + fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil o) {
        //Automovil a = (Automovil) o;
        return this.fabricante.compareTo(o.fabricante);
    }
}
