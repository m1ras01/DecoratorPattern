package Example2;

public class TeamLead extends DevDecorator{
    public TeamLead(Devoleper devoleper){
        super(devoleper);
    }

    public String sendWeekReport(){
        return "Send a WeekReport to customers.";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + sendWeekReport();
    }
}
