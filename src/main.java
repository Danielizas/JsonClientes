import com.google.gson.*;
public class main {
public static void main(String[] args) {
    Gson gs = new Gson();
    String clientej = clientesjson();
    JsonParser parseo = new JsonParser();
    JsonElement jsElement = parseo.parse(clientej); // aqui_viene_todo
    JsonArray jsonArray = jsElement.getAsJsonObject().getAsJsonArray("clientes");

    for (int i = 0; i < jsonArray.size(); i++) {
        JsonObject clientesJson = jsonArray.get(i).getAsJsonObject();
        Clientes client1 = gs.fromJson(clientesJson, Clientes.class);
        imprimirDatosCliente(client1);

        for (int j = 0; j< client1.getCuentas().size(); j++){
            imprimirCuentas(client1.getCuentas().get(j));
            for(int k=0; k<client1.getCuentas().get(j).getTarjetas().size(); k++){
                imprimirTarjetas(client1.getCuentas().get(j).getTarjetas().get(k));
            }
            for(int x=0; x<client1.getCuentas().get(j).getBeneficiarios().size(); x++){
                imprimirBeneficiarios(client1.getCuentas().get(j).getBeneficiarios().get(x));
            }
        }
        /*


        * */
    }

}

public static void  imprimirDatosCliente(Clientes clientes){
    System.out.println();
    System.out.println("Datos de los clientes");
    System.out.println("nombre del Cliente " + clientes.getNombreCliente());
    System.out.println("Apellidos del cliente " + clientes.getApellidoCliente());

}

public static void imprimirCuentas(Cuenta cuenta){
    System.out.println("Datos de la cuenta ");
    System.out.println("Numero de la cuenta: " + cuenta.getNumeroCuenta());
    System.out.println("Nombre de la cuenta: " + cuenta.getNombreCuenta());
}

public static void imprimirBeneficiarios(Beneficiario beneficiario){
    System.out.println("Datos del beneficiario ");
    System.out.println("Nombre del beneficiario: " + beneficiario.getNombreBeneficiario());
    System.out.println("DPI del beneficiario: " + beneficiario.getDPIBeneficiario());
    System.out.println("Direccion del beneficiario " + beneficiario.getDireccionBeneficiario());
}

public static void imprimirTarjetas(Tarjeta tarjeta){
    System.out.println("Datos de la tarjeta ");
    System.out.println("Numero de la Tarjeta " + tarjeta.getNumeroTarjeta());
    System.out.println("Nombre de la Tarjeta " + tarjeta.getNombreTarjeta());
    System.out.println("CVV " + tarjeta.getCvv());
    System.out.println("Fecha de vencimiento " + tarjeta.getFechaVencimiento());
}



public static String clientesjson(){
return "{\n" +
        "\t\"clientes\":[\n" +
        "\t\t{\n" +
        "\t\t\t\"nombreCliente\":\"Gianni\",\n" +
        "\t\t\t\"apellidoCliente\":\"De Leon\",\n" +
        "\t\t\t\"Cuentas\":[\n" +
        "\t\t\t\t{\n" +
        "\t\t\t\t\t\"numeroCuenta\":\"12345678\",\n" +
        "\t\t\t\t\t\"nombreCuenta\":\"Chiqui Ahorro\",\n" +
        "\t\t\t\t\t\"beneficiarios\":[\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Kimberly Hernandez\",\n" +
        "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"0912833123332\",\n" +
        "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Ciudad\"\n" +
        "\t\t\t\t\t\t}\n" +
        "\t\t\t\t\t],\n" +
        "\t\t\t\t\t\"tarjetas\":[\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"numeroTarjeta\":\"12390812137128\",\n" +
        "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Gianni De Leon\",\n" +
        "\t\t\t\t\t\t\t\"cvv\":123,\n" +
        "\t\t\t\t\t\t\t\"fechaVencimiento\":\"12/02/2023\"\n" +
        "\t\t\t\t\t\t}\n" +
        "\t\t\t\t\t]\n" +
        "\t\t\t\t}\n" +
        "\t\t\t]\n" +
        "\t\t},\n" +
        "\t\t{\n" +
        "\t\t\t\"nombreCliente\":\"Kimberly\",\n" +
        "\t\t\t\"apellidoCliente\":\"Hernandez\",\n" +
        "\t\t\t\"Cuentas\":[\n" +
        "\t\t\t\t{\n" +
        "\t\t\t\t\t\"numeroCuenta\":\"22212121\",\n" +
        "\t\t\t\t\t\"nombreCuenta\":\"Ahorro con sorteo\",\n" +
        "\t\t\t\t\t\"beneficiarios\":[\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Gianni De Leon\",\n" +
        "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"2221212121\",\n" +
        "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Mixco\"\n" +
        "\t\t\t\t\t\t}\n" +
        "\t\t\t\t\t],\n" +
        "\t\t\t\t\t\"tarjetas\":[\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"numeroTarjeta\":\"22222121989898\",\n" +
        "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Kimberly Hernandez\",\n" +
        "\t\t\t\t\t\t\t\"cvv\":221,\n" +
        "\t\t\t\t\t\t\t\"fechaVencimiento\":\"02/02/2023\"\n" +
        "\t\t\t\t\t\t}\n" +
        "\t\t\t\t\t]\n" +
        "\t\t\t\t},\n" +
        "\t\t\t\t{\n" +
        "\t\t\t\t\t\"numeroCuenta\":\"2221322222\",\n" +
        "\t\t\t\t\t\"nombreCuenta\":\"Ahorro con intereses\",\n" +
        "\t\t\t\t\t\"beneficiarios\":[\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Gianni De Leon\",\n" +
        "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"2221212121\",\n" +
        "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Mixco\"\n" +
        "\t\t\t\t\t\t},\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"nombreBeneficiario\":\"Julio Alexander\",\n" +
        "\t\t\t\t\t\t\t\"DPIBeneficiario\":\"32321223233232\",\n" +
        "\t\t\t\t\t\t\t\"direccionBeneficiario\":\"Villa Nueva\"\n" +
        "\t\t\t\t\t\t}\n" +
        "\t\t\t\t\t],\n" +
        "\t\t\t\t\t\"tarjetas\":[\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"numeroTarjeta\":\"32332323222318\",\n" +
        "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Kimberly Hernandez\",\n" +
        "\t\t\t\t\t\t\t\"cvv\":332,\n" +
        "\t\t\t\t\t\t\t\"fechaVencimiento\":\"03/03/2024\"\n" +
        "\t\t\t\t\t\t},\n" +
        "\t\t\t\t\t\t{\n" +
        "\t\t\t\t\t\t\t\"numeroTarjeta\":\"43443232345\",\n" +
        "\t\t\t\t\t\t\t\"nombreTarjeta\":\"Gianni De Leon\",\n" +
        "\t\t\t\t\t\t\t\"cvv\":334,\n" +
        "\t\t\t\t\t\t\t\"fechaVencimiento\":\"04/04/2024\"\n" +
        "\t\t\t\t\t\t}\n" +
        "\t\t\t\t\t]\n" +
        "\t\t\t\t}\n" +
        "\t\t\t]\n" +
        "\t\t}\n" +
        "\t]\n" +
        "}";
}
}