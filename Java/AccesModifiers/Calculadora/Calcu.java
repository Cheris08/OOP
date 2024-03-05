package calcu;

public class Calcu {
    float x;
    float y;
    double z;
    
public Calcu(float a, float b){
    
    x = a;
    y = b;
    z = 0;
}

public double suma (float a, float b){
    
    x = a;
    y = b;
    z = x+y;
    
    return z;
}

public double resta (float a, float b){
    
    x = a;
    y = b;
    z = x - y;
    
    return z;
}

public double multiplicacion (float a, float b){
    
    x = a;
    y = b;
    z = x * y;
    
    return z;
}

public double division (float a, float b){
    
    x = a;
    y = b;
    z = x / y;
    
    return z;
}

public double potencia (int a, int b){
    
    x = a;
    y = b; 
    z = Math.pow(x,y);
    return z;
}

public void imprimirResultado(){
    
    System.out.println("resultados:  " + z);
}


public static void main(String[] args) {
    Calcu operario = new Calcu(0,0);
    
    //float result=operario.suma(8,8);
    operario.suma(8,8);
    //System.out.println("El resultado de la suma es:  " + result );
    operario.imprimirResultado();
    
    //result = operario.resta(95,50);
    operario.resta(95,50);
    //System.out.println("El resultado de la resta es:  " + result );
    operario.imprimirResultado();
    
    //result = operario.multiplicacion(5,8);
    operario.multiplicacion(5,8);
    //System.out.println("El resultado de la multiplicacion es:  " + result );
    operario.imprimirResultado();
    
    //result = operario.division (3,10);
    operario.division (3,10);
    //System.out.println("El resultado de la division es:  " + result );
    operario.imprimirResultado();
    
    //double resultado = Math.pow (4,2); Nooooo!!!!!
    operario.potencia(4,2);
    //System.out.println("El  resultado de la potencia es:  " +  resultado);
    operario.imprimirResultado();        
    }
    
}