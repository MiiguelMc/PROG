/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author nocturno
 */
public class ticket {

    int pizzanormal;
    int pizzapina;

    public ticket(int pizzanormal, int pizzapina) {
        this.pizzanormal = pizzanormal;
        this.pizzapina = pizzapina;
    }

    public int Getpizzanormal() {
        return pizzanormal;
    }

    public String toString() {
        return "<h1>Aqui tienes tu pedido </h1>"
                + "<br>"
                + "TABLE FRAME=\"border\" RULES=\"none\">\n"
                + "	<TR>\n"
                + "		<TD>Comida</TD> <TD>PVP</TD> <TD>Cantidad</TD> <TD>Subtotal</TD>  \n"
                + "	<TR>\n"
                + "		<TD>Pizza normal</TD> <TD>12,4</TD> <TD>"+pizzanormal+"</TD> <TD>"+(pizzanormal * 12.4)+"</TD>\n"
                + "	</TR>\n"
                + "	<TR>\n"
                + "		<TD>Pizza piña</TD> <TD>13,4</TD> <TD>"+pizzapina+"</TD> <TD>"+(pizzapina * 13.4)+"</TD>\n"
                + "	</TR>\n"
                + "</TABLE>";
    }

}
