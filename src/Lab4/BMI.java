package Lab4;

public class BMI {
    public static String BMI(double w, double h) {
        String bmi = null;
        double BMI;
        BMI = w/(h*h);
        if (BMI<18.5) {
            bmi = "Thieu can";
        }
        else if (18.5<=BMI && BMI<23) {
            bmi = "Binh thuong";
        }
        else if (23<=BMI && BMI<25) {
            bmi = "Thua can";
        }
        else if (BMI>=25) {
            bmi = "Beo phi";
        }
        return bmi;
    }
}
