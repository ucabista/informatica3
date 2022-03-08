package Paquete1;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre, apellido, genero, cedula;
        int dia, mes, anio;
        int nClientes;

        int opc;

        Scanner entrada = new Scanner(System.in);
        final int cant_p = 3; // cantidad de mis productos

        int cantProductos[] = new int[cant_p]; // contamos la cantidad de productos para cada articulo
        int cantidadP;
        Producto misProductos[] = new Producto[cant_p]; // cantidad de articulos en mi tienda, constantes
        Producto carrito[] = new Producto[cant_p]; // cantidad de articulos en mi tienda, constantes
        boolean existe[] = new boolean[cant_p];
        int codigo;
        double totalCompra = 0;

        MetodoPago miPago[] = new MetodoPago[3];
        String tipo_t = " ";

        JOptionPane.showMessageDialog(null, "Bienvenido al SuperMercado Trinity");
        nClientes = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad de clientes en la tienda: "));

        Cliente clientes[] = new Cliente[nClientes];

        // Creamos los objetos para Cliente
        for (int i = 0; i < clientes.length; i++) {

            cedula = JOptionPane.showInputDialog("Introduzca la Cedula del Cliente: " + (i + 1) + ":");
            nombre = JOptionPane.showInputDialog("Introduzca Nombre del Cliente: " + (i + 1) + ":");
            apellido = JOptionPane.showInputDialog("Introduzca Apellido del Cliente: " + (i + 1) + ":");
            dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca Dia de nacimiento del Cliente: " + (i + 1) + ":"));
            mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca Mes de nacimiento del Cliente: " + (i + 1) + ":"));
            anio = Integer.parseInt(JOptionPane.showInputDialog("Introduzca Anio de nacimiento del Cliente: " + (i + 1) + ":"));
            genero = JOptionPane.showInputDialog("Introduzca genero del Cliente: " + (i + 1) + ":");

            // Introducimos los datos en Clase Clientes
            clientes[i] = new Cliente(cedula, nombre, apellido, dia, mes, anio, genero);

            for (int j = 0; j < cant_p; j++) { // inicializar valores
                cantProductos[j] = 0;
                existe[j] = false;
            }
            int p_agg = 0; // productos agregados, para nuestro carrito

            do {

                opc = Integer.parseInt(JOptionPane.showInputDialog("Escoge el producto a comprar: "
                        + "\n Bate de Beisbol 120$   ---> [0]"
                        + "\n Camisa Deportiva 240$  ---> [1] "
                        + "\n Guante De Beisbol 320$ ---> [2]"));

                switch (opc) // Establecemos nombre del producto para mostrar luego aumento de cantidad
                {
                    case 0:
                        misProductos[opc] = new BateBeisbol("Bate de Beisbol");

                        break;
                    case 1:
                        misProductos[opc] = new CamisaDeportiva("Camisa Deportiva");
                        break;
                    case 2:
                        misProductos[opc] = new GuanteBeisbol("Guante Beisbol");
                        break;
                }

                cantidadP = Integer.parseInt(JOptionPane.showInputDialog("Cuantos articulos de " + misProductos[opc].getNombre() + " desea llevar?"));

                cantProductos[opc] += cantidadP; // agregamos articulos al producto

                // Ingresamos datos a nuestro Producto
                switch (opc) // cantidad de productos,precio,codigo,descripcion,iva
                {
                    case 0:
                        if (existe[opc] == true) { // si ya fue escogido, solo aumentar cantidad de productos
                            misProductos[opc].setCantProducto(cantProductos[opc]);
                            misProductos[opc].setCodProducto("a111");

                        } else {
                            misProductos[opc] = new BateBeisbol(misProductos[opc].getNombre(), cantProductos[opc], 120, "a111", "de madera", 0.10);
                        }
                        break;
                    case 1:
                        if (existe[opc] == true) {
                            misProductos[opc].setCantProducto(cantProductos[opc]);
                            misProductos[opc].setCodProducto("a222");
                        } else {
                            misProductos[opc] = new CamisaDeportiva(misProductos[opc].getNombre(), cantProductos[opc], 240, "a222", "de tela", 0.20);
                        }
                        break;
                    case 2:
                        if (existe[opc] == true) {
                            misProductos[opc].setCantProducto(cantProductos[opc]);
                            misProductos[opc].setCodProducto("a333");
                        } else {
                            misProductos[opc] = new GuanteBeisbol(misProductos[opc].getNombre(), cantProductos[opc], 320, "a333", "de cuero", 0.30);
                        }

                        break;
                }

                if (existe[opc] == false) {
                    carrito[p_agg] = (misProductos[opc]); // Productos en el carrito, en orden
                    p_agg++; // variable de control que me controla cuantos productos escogidos voy a mostrar

                } else { // si existe producto, entonces
                    for (int j = 0; j < p_agg; j++) {
                        // Buscamos donde se encuentra el producto y aumentamos su cantidad
                        if (carrito[j].getCodProducto() == misProductos[opc].getCodProducto()) {
                            carrito[p_agg - 1].setCantProducto(misProductos[opc].getCantProducto());
                        }
                    }
                }

                existe[opc] = true;

                JOptionPane.showMessageDialog(null, "Usted tiene los siguientes productos en su carrito:");

                for (int j = 0; j < p_agg; j++) { // ver si el cliente ya lleva productos en su carrito
                    if (existe[opc] == true) {
                        JOptionPane.showMessageDialog(null, "Nombre: " + carrito[j].getNombre() + "\nCantidad: " + carrito[j].getCantProducto() + "\n");
                    }

                }

                opc = Integer.parseInt(JOptionPane.showInputDialog("Desea Seguir Comprando? \n[1]--> Si \n[0] --> No"));

            } while (opc != 0);

            JOptionPane.showMessageDialog(null, "Pedido del Cliente: ");
            /* // Pruebas
            misProductos[2] = new GuanteBeisbol("guante", 2, 320, "a333", "de cuero", 0.30);
            existe[2] = true;
            
             */
            double totalBs[] = new double[cant_p]; // Calculo del costo de cada producto escogido en la bolsa

            for (int j = 0; j < cant_p; j++) { // inicializar valores
                totalBs[j] = 0;
            }
            totalCompra = 0; // inicializar valores

            for (int j = 0; j < p_agg; j++) {

                totalBs[j] = ((carrito[j].getCantProducto() * carrito[j].getPrecio()) * carrito[j].getIva()) + carrito[j].getCantProducto() * carrito[j].getPrecio();
                // en cada posicion colocar calculos de precios de productos comprados, con Impuestos asociados
                carrito[j].setTotalBs(totalBs[j]); // calcular precio para cada producto

                JOptionPane.showMessageDialog(null, carrito[j]); // mostrar pedido de producto comprado
                totalCompra += carrito[j].getTotalBs(); // vamos calculando la suma de todo el total de compras de productos

            }

            boolean metodosPagos[];
            metodosPagos = new boolean[3];

            do {

                opc = Integer.parseInt(JOptionPane.showInputDialog("Escoge El Metodo de Pago: \nTarjeta De Credito ----> [0]\nEfectivo ----> [1]\nCheque ----> [2]"));
                metodosPagos[opc] = true; // agregamos valido un metodo de pago

                JOptionPane.showMessageDialog(null, "Metodo de pago agregado!");
                opc = Integer.parseInt(JOptionPane.showInputDialog("Desea pagar o agregar otro metodo de pago? \n Pagar ---> [0] \n Agregar Otro Metodo de pago ---> [1]"));

            } while (opc == 1);

            if (metodosPagos[0] == true) { // tarjeta de credito
                dia = Integer.parseInt(JOptionPane.showInputDialog("Escribe dia de fecha de vencimiento de Tarjeta de Credito:"));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Escribe mes de fecha de vencimiento de Tarjeta de Credito:"));
                anio = Integer.parseInt(JOptionPane.showInputDialog("Escribe anio de fecha de vencimiento de Tarjeta de Credito:"));
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Escribe numero de Tarjeta de Credito:"));

                opc = Integer.parseInt(JOptionPane.showInputDialog("VISA ---> 1 /n MASTERCARD ---> 2"));
                if (opc == 1) {
                    tipo_t = "VISA";
                } else if (opc == 2) {
                    tipo_t = "MASTERCARD";
                }

                miPago[0] = new TarjetaCredito("Tarjeta de Credito", dia, mes, anio, codigo, tipo_t);

            }
            if (metodosPagos[1] == true) { // efectivo
                miPago[1] = new Efectivo("Efectivo");
            }
            if (metodosPagos[2] == true) { // Cheque

                codigo = Integer.parseInt(JOptionPane.showInputDialog("Escribe el Numero de Cheque"));
                tipo_t = JOptionPane.showInputDialog("Escribe la entidad bancaria");

                miPago[2] = new Cheque("Cheque", codigo, tipo_t);
            }

            Calendar calendario = Calendar.getInstance(); // establecemos el dia,mes,anio de esta compra
            dia = (calendario.get(Calendar.DAY_OF_MONTH));
            mes = (calendario.get(Calendar.MONTH)) + 1;
            anio = calendario.get(Calendar.YEAR);

            JOptionPane.showMessageDialog(null, "PROCESANDO PAGO... ");
            JOptionPane.showMessageDialog(null, "PAGO EXITOSO!");

            System.out.println("FACTURA DEL CLIENTE: " + (i + 1) + "\n");
            System.out.println(clientes[i].getCliente());
            System.out.println("Productos Comprados: \n");
            for (int j = 0; j < p_agg; j++) {
                System.out.println(carrito[j]);
            }
            System.out.println("FORMAS DE PAGO DEL CLIENTE:\n");
            for (int j = 0; j < 3; j++) { // mostrar formas de pago del cliente
                if (metodosPagos[j] == true) {
                    System.out.println(miPago[j].toString() + "\n");
                }

            }
            System.out.println("Fecha de Emision: " + dia + "/" + mes + "/" + anio);
            System.out.println("Monto Total Pagado: " + totalCompra);

            JOptionPane.showMessageDialog(null, "Gracias por su compra XD");
            JOptionPane.showMessageDialog(null, "FACTURA EMITIDA POR CONSOLA");

        } // fin del bucle Clientes, pasamos al siguiente Cliente de la fila a comprar

    }

}
