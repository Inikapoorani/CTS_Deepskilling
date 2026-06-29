package DataStructuresandAlgorithms.FinancialForecasting;
class Fc{
    double PresentVal;
    int year;
    double growthRate;
    
    public double FuturePrediction(double PresentVal,int year,double growthRate){
        if(year<=0){
            return PresentVal;
        }
        else{
            return FuturePrediction(PresentVal,year-1,growthRate)*(1+growthRate/100.0);
        }
    }

}
public class Forecast {
    public static void main(String args[]){
        Fc f1=new Fc(); 
        System.out.println("Future Value: "+f1.FuturePrediction(1000,5,10));
    }
}
