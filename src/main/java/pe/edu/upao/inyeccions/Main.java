package pe.edu.upao.inyeccions;

import pe.edu.upao.inyeccions.services.CarService;
import pe.edu.upao.inyeccions.services.CarServiceRest;
import pe.edu.upao.inyeccions.services.ICarService;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main (String[] args){

        Map<String, Object> bolsaBeansSpring = new HashMap<>();

        bolsaBeansSpring.put("CarService", new CarService());


        System.out.println("----Modulo 1000----");
        ICarService carService = (ICarService) bolsaBeansSpring.get("CarService");
        haceCosasComplejas(carService);


        System.out.println("----Modulo 1001----");
        ICarService carService2 = (ICarService) bolsaBeansSpring.get("CarService");
        haceCosasComplejas(carService2);


        System.out.println("----Modulo 1002----");
        ICarService carService3 = (ICarService) bolsaBeansSpring.get("CarService");
        haceCosasComplejas(carService3);
    }

    private static void haceCosasComplejas(ICarService carService) {
        carService.printListCars();
    }
}
