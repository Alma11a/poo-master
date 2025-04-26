public class NumeroLetras {
    public static String[] unidades = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"};
    public static String[] decenas1 = {"Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"};
    public static String[] decenas2 = {"", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"};
    public static String[] centenas = {"", "Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};

    public static String separar(int num){
        if(num == 0){
            return "cero";
        }
        return convertirLetras(num).trim();
    }

    public static String convertirLetras(int num){
        if(num < 10){
            return unidades[num];
        }else if (num < 20){
            return decenas1[num-10];
        }else if (num < 100){
            String res = decenas2[num/10];
            if(num%10 != 0){
                res =res+ " y " + unidades[num%10];
            }
            return res;
        }else if (num < 1000){
            String res1 = centenas[num/100];
            if(num%100 != 0){
                res1 =res1+ " " + convertirLetras(num%100);
            }else if (num==100){
                return "cien";
            }
            return res1;
        }else if(num < 10000){
            String res2;
            if(num/1000 == 1){
                res2 = "Mil";
            }else{
                res2 = convertirLetras(num/1000) + " Mil";
            }
            if(num % 1000 != 0){
                res2 =res2+ " " + convertirLetras(num%1000);
            }
            return res2;
        }
        return "Número fuera de rango";

    }
}
class mainNumero {
    public static void main(String[] args) {
        int num = 1391;
        System.out.println(num + " en letras es: " + NumeroLetras.separar(num));
    }
}