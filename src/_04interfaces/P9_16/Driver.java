package _04interfaces.P9_16;

/**
 * Created by yangmei555 on 2016/10/23.
 */
public class Driver {
    public static void main(String[] args) {
        Measurable[] countries = new Measurable[5];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 514000);
        countries[2] = new Country("Belgium", 30510);
        countries[3] = new Country("China", 9634057);
        countries[4] = new Country("United States", 9631420);
        Measurable mea = maximum(countries);
        System.out.println("The country with the largest area is: " + maximum(countries).getName());
    }
    public static Measurable maximum(Measurable[] objects){
        if (objects.length ==0 )
            return null;
        Measurable mea = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > mea.getMeasure())
                mea = obj;
        }
        return mea;
    }
}
