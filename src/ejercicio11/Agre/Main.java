package ejercicio11.Agre;

public class Main {

    public static void main(String[] args)
    {
    Tienda tiendajose= new Tienda("Tienda Jose");

    Finanzas oli= new Finanzas("Lic. Oliver ZAPATA BERAUN", tiendajose);
    
    Contabilidad juan= new Contabilidad("Juan RAMOS OLIVERA", tiendajose);

    Asistente julio = new Asistente("Julio MALPARTIDA VENTURA");

    
    System.out.println("Finanzas: "+oli);
    System.out.println("Contabilidad: "+juan);
    System.out.println("Asistente: "+julio);

    }
}
