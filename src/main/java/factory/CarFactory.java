package factory;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 18:00 2018/7/24
 * @Modified by
 */
public class CarFactory {




    public Car getCar(String type){
        if(type == null){
            return null;
        }
        if(type.equals("SEDAN")){
            return new Sedan();
        }
        if(type.equals("AUTOMOBILE")){
            return new Automobile();
        }
        if(type.equals("TRUCK")){
            return new Truck();
        }
        return null;
    }
}
