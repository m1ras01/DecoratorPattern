package Example2;

public class Process {
    public static void main(String[] args) {
        Devoleper Junior = new JavaDev();
        System.out.println(Junior.makeJob());

        Devoleper Senior = new SeniorDev(new JavaDev());
        System.out.println(Senior.makeJob());

        Devoleper TeamLeader = new TeamLead(new SeniorDev(new JavaDev()));
        System.out.println(TeamLeader.makeJob());
    }
}
