public class GestorDispositivo {
    public static final int Max = 10;

    public static void main(String[] args) {
        Dispositivos[] midisp = new Dispositivos[Max];
        midisp[0] = new ordenador("16GB", "IntelI5", "1TB", "no", "HP");
        midisp[1] = new ordenador("18GB", "IntelI9", "13TB", "no", "MSI");
        midisp[2] = new Television(14, "OLED", false, "Reloj","hp");

        for (int i = 0; i < Dispositivos.getContadorDisp(); i++) {
            ((Encendido) midisp[i]).encender();
            System.out.println(midisp[i]);

        }

    }
}
