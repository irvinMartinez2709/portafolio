import javax.swing.JOptionPane;

public class precioProductoTryCatch {
    public static void main(String [] args) {

        double precioParcial = 0, precioNeto = 0, precioUnitario = 0, descuento = 0 ;
        int cantidad = 0;
        String respuesta;
        boolean validez = false;
        
        // Pedir precio unitario
        while (true) {
            try {
                String inputPrecio = JOptionPane.showInputDialog(null, "Ingrese el precio unitario del producto:");
                if (inputPrecio == null) { 
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor."); 
                    continue; 
                }
                precioUnitario = Double.parseDouble(inputPrecio);

                if (precioUnitario > 0) { // Validar que sea positivo
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "El precio debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número.");
            }
        }

        // Pedir cantidad
        while (true) {
            try {
                String inputCantidad = JOptionPane.showInputDialog(null, "Ingrese la cantidad de venta:");
                if (inputCantidad == null) { 
                    JOptionPane.showMessageDialog(null, "Debe ingresar un valor."); 
                    continue; 
                }
                cantidad = Integer.parseInt(inputCantidad);

                if (cantidad > 0) { // Validar que sea positivo
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número entero.");
            }
        }

        precioParcial = precioUnitario * cantidad;


        while (validez == false) {

            respuesta = JOptionPane.showInputDialog(null, "¿Mostrar descuento? s/n");

            boolean afirmacion = respuesta.equalsIgnoreCase("s");
            boolean negacion = respuesta.equalsIgnoreCase("n");

            if (afirmacion) {

                while (validez == false){
                    try {
                        descuento = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué descuento aplicar? \n5%        10%        20%\n30%       40%       50%\nColoque el número sin %."));

                        if (descuento == 5 || descuento == 10 || descuento == 20 || descuento == 30 || descuento == 40 || descuento == 50) {

                            descuento = descuento / 100.0;
                            descuento = descuento * precioParcial; 
                            precioNeto = precioParcial - descuento;
                            validez = true;

                            JOptionPane.showMessageDialog(null, "Aplicando descuentos..."); 

                        } else {
                            JOptionPane.showMessageDialog(null, "Descuento no válido, vuelva a intentarlo.");
                        }

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número.");
                    }
                }

            } else if (negacion) {
                JOptionPane.showMessageDialog(null, "Continuando sin descuentos...");
                validez = true;
                precioNeto = precioParcial;
            } else {
                JOptionPane.showMessageDialog(null, "Respuesta no válida. \n\nIntentelo de nuevo.");
            }
        }
    
        JOptionPane.showMessageDialog(null, String.format("El precio neto es: $%.2f", precioNeto));
    }
}