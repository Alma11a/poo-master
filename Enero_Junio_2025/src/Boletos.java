import java.util.ArrayList;
import java.util.List;

/*
Crear una aplicacion para comprar boletos de autobus.Considere el autobus como un objeto
Cada asiento es un objeto.El ticket es un objeto.El sistema tiene el siguiente menu de opciones:
1. Ver disponibilidad de asientos
        Muestra todos los asientos ocupados y vacios
2. Reservar asiento
        Reserva el asiento bloqueando para que nadie pueda tomarlo
3. Desbloquear asiento
        Elimina la reserva de un boleto dejandolo disponible
4. Obtener el ticket o boleto
        Genera un ticket del asiento o asientos reservados
5. Cancelar ticket
        Libera el asiento y cancela el ticket colocando status cancelado
 */
import java.util.*;

class Asiento {
    int numero;
    boolean reservado;

    Asiento(int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    void reservar() {
        reservado = true;
    }

    void desbloquear() {
        reservado = false;
    }

    boolean estaReservado() {
        return reservado;
    }

    public String toString() {
        return "Asiento " + numero + ": " + (reservado ? "Ocupado" : "Libre");
    }
}

class Ticket {
    static int contadorID = 1;
    int id;
    List<Asiento> asientos;
    String estado; // Activo o Cancelado

    Ticket(List<Asiento> asientos) {
        this.id = contadorID++;
        this.asientos = new ArrayList<>(asientos);
        this.estado = "Activo";
    }

    void cancelar() {
        for (Asiento a : asientos) {
            a.desbloquear();
        }
        estado = "Cancelado";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(id).append("\nEstado: ").append(estado).append("\nAsientos: ");
        for (Asiento a : asientos) {
            sb.append(a.numero).append(" ");
        }
        return sb.toString();
    }
}

class Autobus {
    List<Asiento> asientos;
    List<Ticket> tickets;

    Autobus(int cantidadAsientos) {
        asientos = new ArrayList<>();
        tickets = new ArrayList<>();
        for (int i = 1; i <= cantidadAsientos; i++) {
            asientos.add(new Asiento(i));
        }
    }

    void verDisponibilidad() {
        for (Asiento a : asientos) {
            System.out.println(a);
        }
    }

    void reservarAsiento(int num) {
        if (esValido(num) && !asientos.get(num - 1).estaReservado()) {
            asientos.get(num - 1).reservar();
            System.out.println("Asiento " + num + " reservado.");
        } else {
            System.out.println("Asiento inválido o ya reservado.");
        }
    }

    void desbloquearAsiento(int num) {
        if (esValido(num) && asientos.get(num - 1).estaReservado()) {
            asientos.get(num - 1).desbloquear();
            System.out.println("Asiento " + num + " desbloqueado.");
        } else {
            System.out.println("Asiento inválido o ya libre.");
        }
    }

    void obtenerTicket(List<Integer> numeros) {
        List<Asiento> seleccionados = new ArrayList<>();
        for (int n : numeros) {
            if (esValido(n) && asientos.get(n - 1).estaReservado()) {
                seleccionados.add(asientos.get(n - 1));
            } else {
                System.out.println("Asiento " + n + " no válido o no reservado.");
                return;
            }
        }
        Ticket ticket = new Ticket(seleccionados);
        tickets.add(ticket);
        System.out.println("Ticket generado:\n" + ticket);
    }

    void cancelarTicket(int ticketID) {
        for (Ticket t : tickets) {
            if (t.id == ticketID && t.estado.equals("Activo")) {
                t.cancelar();
                System.out.println("Ticket cancelado:\n" + t);
                return;
            }
        }
        System.out.println("Ticket no encontrado o ya cancelado.");
    }

    private boolean esValido(int num) {
        return num > 0 && num <= asientos.size();
    }
}

public class Boletos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autobus bus = new Autobus(40);

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ver disponibilidad de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Desbloquear asiento");
            System.out.println("4. Obtener ticket");
            System.out.println("5. Cancelar ticket");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    bus.verDisponibilidad();
                    break;
                case 2:
                    System.out.print("Ingrese número de asiento a reservar: ");
                    int reservar = sc.nextInt();
                    bus.reservarAsiento(reservar);
                    break;
                case 3:
                    System.out.print("Ingrese número de asiento a desbloquear: ");
                    int desbloquear = sc.nextInt();
                    bus.desbloquearAsiento(desbloquear);
                    break;
                case 4:
                    System.out.print("Ingrese números de asiento reservados (separados por espacios): ");
                    sc.nextLine();
                    String[] partes = sc.nextLine().split(" ");
                    List<Integer> numeros = new ArrayList<>();
                    for (String s : partes) {
                        numeros.add(Integer.parseInt(s));
                    }
                    bus.obtenerTicket(numeros);
                    break;
                case 5:
                    System.out.print("Ingrese ID del ticket a cancelar: ");
                    int ticketID = sc.nextInt();
                    bus.cancelarTicket(ticketID);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
