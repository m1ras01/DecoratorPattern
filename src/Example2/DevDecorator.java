package Example2;

public class DevDecorator implements Devoleper{
    Devoleper devoleper;

    public DevDecorator(Devoleper devoleper){
        this.devoleper = devoleper;
    }
    @Override
    public String makeJob(){
        return devoleper.makeJob();
    }
}
