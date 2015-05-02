package presentacion;

import javax.swing.JOptionPane;

public class Ventana {

    public static void imp(String msg1, String msg2) {
        JOptionPane.showMessageDialog(null, msg1, msg2, 3);
    }

    public static void imp(int msg1, String msg2) {

        JOptionPane.showMessageDialog(null, Integer.toString(msg1), msg2, 3);
    }

    public static void imp(double msg1, String msg2) {

        JOptionPane.showMessageDialog(null, Double.toString(msg1), msg2, 3);
    }

    public static void imp(byte msg1, String msg2) {
        JOptionPane.showMessageDialog(null, Byte.toString(msg1), msg2, 3);
    }

    public static void imp(short msg1, String msg2) {

        JOptionPane.showMessageDialog(null, Short.toString(msg1), msg2, 3);
    }

    public static void imp(float msg1, String msg2) {

        JOptionPane.showMessageDialog(null, Float.toString(msg1), msg2, 3);
    }

    public static void imp(long msg1, String msg2) {
        JOptionPane.showMessageDialog(null, Long.toString(msg1), msg2, 3);
    }

    public static int leerInt(String msg) {
        return (Integer.parseInt(JOptionPane.showInputDialog(msg)));
    }

    public static double leerDouble(String msg) {
        return (Double.parseDouble(JOptionPane.showInputDialog(msg)));
    }

    public static long leerLong(String msg) {
        return (Long.parseLong(JOptionPane.showInputDialog(msg)));
    }

    public static char leerChar(String msg) {
        String a = JOptionPane.showInputDialog(msg);
        char b[] = a.toCharArray();
        return (b[0]);
    }

    public static byte leerByte(String msg) {
        return (Byte.parseByte(JOptionPane.showInputDialog(msg)));
    }

    public static float leerFloat(String msg) {
        return (Float.parseFloat(JOptionPane.showInputDialog(msg)));
    }

    public static String leerCadena(String msg) {
        return (JOptionPane.showInputDialog(msg));
    }

    public static int leerOption(String msg) {
        return (JOptionPane.showOptionDialog(null, msg, "venmtana", 1, 2, null, null, null));
    }

    static class leerInt {

        public leerInt() {
        }
    }
}
