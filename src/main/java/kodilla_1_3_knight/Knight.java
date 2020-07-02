package kodilla_1_3_knight;

public class Knight {
    private Quest quest;

    public Knight (Quest quest){
        this.quest = quest;
    }
    public void doMission(){
        System.out.print("This is a task: ");
        this.quest.process();
        System.out.println(" and it has been completed.");
    }
}
