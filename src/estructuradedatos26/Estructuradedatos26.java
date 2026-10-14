/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos26;

/**
 *
 * @author alumnog
 */
public class Estructuradedatos26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
          byte edad = 20;
            System.out.println("edad:" + edad);
        short year = 2026;
            System.out.println("año:" + year);
        int robux = 50000;
            System.out.println("robux:" + robux);
            System.out.println(robux+1000);
            System.out.println(robux-1000);
            System.out.println(robux/2);
            System.out.println(robux*2);
            System.out.println(++robux);
            System.out.println(--robux);
            System.out.println(robux==2);
            System.out.println(robux>2);
            System.out.println(robux<2);
        long estrellas = 20000000;
            System.out.println("estrellas:"+ estrellas);
        //decimal o flotantes 
        double estatura = 1.69;
            System.out.println("estatura:" + estatura);
        float deuda = 999.99f;
            System.out.println("deuda:" + deuda);
        
        /********CARACTER*******/
        char grupo = 'a';
        char grupo2 = 'Z';
            System.out.println(grupo);
            System.out.println(++grupo);
            System.out.println(++grupo);
            System.out.println(++grupo);
            System.out.println(grupo==grupo2);
            System.out.println(grupo<grupo2);
            System.out.println(grupo>grupo2);
        boolean pago = true; //false
            System.out.println("pago?" + pago);
            System.out.println(pago == true);
            System.out.println(pago != false);
            System.out.println(pago == false);
            System.out.println(pago != false);
            System.out.println("----");
            System.out.println(true && true && true );
            System.out.println(5>2 && 'a' == 'a' && 5.5!=2.5);
            System.out.println(5>2 && 'a' == 'b' && 5.5!=2.5);
            System.out.println(5>20 || 'a' == 'a' || 5.5!=2.5);
            System.out.println(false || false == true || true );
            
        String nombre = "Luis Elioth";
        System.out.println(nombre);
            
        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(5));
        System.out.println(nombre.length());
        
        for (int i=0; i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.equals("Luis Elioth"));
        System.out.println(nombre.equals("luiS Elioth"));
        System.out.println(nombre.equalsIgnoreCase("Luis Elioth"));
        
        System.out.println("luis@gmail.com".indexOf("@"));
        System.out.println("luis@gmail.com".indexOf(".com"));
        System.out.println("fasdfas.png".endsWith(".jpg")|| "fasdfas.png".endsWith(".png"));
        System.out.println("  ".isEmpty());//vailida que el string este vacio
        System.out.println("  ".isBlank());// valida que este vacio y espacios en blanco
        System.out.println("conejo".replace("o", "e"));
        System.out.println("conejo bonito".replaceFirst("o", "e"));
        System.out.println("juanito".substring(3));
        System.out.println("juanito".substring(3,5));
           //operaciones aritemeticas 
           // - + 
           
           
        Producto producto1;
        producto1 = new Producto(
                1,
                "playera Maja verde",
                "PM-V-M-01",
                'M',
                (byte)2, 
                100,
                0.25f,
                1500.00f,
                true
        );
        System.out.println("producto: " + producto1.getNombre());
        System.out.println("producto: " + producto1.getPrecioUnitario());
        
        ClaseBoletoAvion ClaseBoletoAvion1;
        ClaseBoletoAvion1 = new ClaseBoletoAvion(
                20,
                2231,
                (short)1313,
                'L',
                4.14,
                8898.9f,
                15.500f,
                3599.99,
                true
        );
        System.out.println("precio boleto de avion:" + ClaseBoletoAvion1.getPrecioBoleto());
        System.out.println("fila de avion:" + ClaseBoletoAvion1.getAsientoFila());
        System.out.println("asineto letra:" + ClaseBoletoAvion1.getAsientoLetra());
        
        
        
    }
    
}
