package Example2;

public class SeniorDev extends DevDecorator{

    public SeniorDev(Devoleper devoleper){
        super(devoleper);
    }

    public String makeCodeReview(){
        return "Make Code Review.";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + makeCodeReview();
    }
}
