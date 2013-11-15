package Romanos;

import java.util.HashMap;

public class Numero {
    private final HashMap<Integer, String> decimales = new HashMap();
    private final HashMap<String, Integer> romanos = new HashMap();
    
    public Numero() {
        agregaRomanos();
        agregaDecimales();
    }
    
    public final void agregaRomanos(){
        romanos.put("I", 1);
        romanos.put("V", 5);
        romanos.put("X", 10);
        romanos.put("L", 50);
        romanos.put("C", 100);
        romanos.put("D", 500); 
        romanos.put("M", 1000);
    }
    
    public final void agregaDecimales(){
        decimales.put(1, "I");
        decimales.put(5, "V");
        decimales.put(10, "X");
        decimales.put(50, "L");
        decimales.put(100, "C");
        decimales.put(500, "D"); 
        decimales.put(1000, "M");        
    }
    
    public String Decimal2Romano(int num) {
        String romano = "";
        String numero = Integer.toString(num);
        Integer deci;
        for(int i=0; i<numero.length(); i++){
            deci = Integer.valueOf(String.valueOf(numero.charAt(i)));
            romano += decimales.get(deci);
        }
        return romano;
    }

    public int Romano2Decimal(String romano) {
        Integer decimal = 0;
        Integer numero, siguiente;
        if(!"".equals(romano)){
            for(int i=0; i<romano.length(); i++){
                String caracter = String.valueOf(romano.charAt(i));
                numero = romanos.get(caracter);
                if(i == romano.length()-1){
                    decimal += numero;
                }else{
                    siguiente = romanos.get(String.valueOf(romano.charAt(i+1)));
                    if(numero < siguiente){
                        decimal -= numero;
                    }else{
                        decimal += numero;
                    }
                }
            }
        }
        return decimal;
    }
}
