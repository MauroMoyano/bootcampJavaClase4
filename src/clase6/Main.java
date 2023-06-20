package clase6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Juguemos a piedra, papel o tijeras. \n Ingrese su elección:");
        String usuario = sc.nextLine().toLowerCase(Locale.ROOT);

        while (!usuario.equals("piedra") && !usuario.equals("papel") && !usuario.equals("tijera")) {
//            System.out.println(usuario);
            System.out.println("Por favor ingrese un elemento: piedra, papel o tijera");
            usuario = sc.nextLine().toLowerCase(Locale.ROOT);

        }

//        System.out.println(usuario);
        int computadora = (int) Math.floor(Math.random() * 10);
        String pc;
        if (computadora >= 0 && computadora <= 3) {
            pc = "piedra";
        }else{
            if (computadora >= 4 && computadora <= 6) {
                pc = "papel";
            } else {
                pc = "tijera";
            }
        }
//        System.out.println(pc);

        resultado(usuario, pc);
    }

    private static void resultado(String usuario, String pc) {
        System.out.println("Elección de Pc: " + pc);
        if (pc.equals("piedra")) {
            if (usuario.equals("papel")) {
                System.out.println("Usuario Winner");
            } else {
                if (usuario.equals("tijera")) {
                    System.out.println("Pc Winner");
                } else {
                    System.out.println("Tie");
                }
            }
        } else {
            if (pc.equals("papel")) {
                if (usuario.equals("papel")) {
                    System.out.println("Tie");
                } else {
                    if (usuario.equals("tijera")) {
                        System.out.println("Usuario Winner");
                    } else {
                        System.out.println("Pc Winner");
                    }
                }
            } else {
                if (usuario.equals("papel")) {
                    System.out.println("Pc Winner");
                } else {
                    if (usuario.equals("tijera")) {
                        System.out.println("Tie");
                    } else {
                        System.out.println("Usuario Winner");
                    }
                }
            }
        }
    }
}