package dungeonmania.Goals;

public class AndGoal implements GoalComposite {
    private GoalComposite goal1;
    private GoalComposite goal2;

    /**
     * And Goal class that requires two goal composites. Implements Goal Composite
     * 
     * @param goal1
     * @param goal2
     */
    public AndGoal(GoalComposite goal1, GoalComposite goal2) {
        this.goal1 = goal1;
        this.goal2 = goal2;
    }

    @Override
    public boolean checkGoalCompleted() {
        if (goal1.checkGoalCompleted() == true && goal2.checkGoalCompleted() == true) {
            return true;
        }
        return false;
    }

    @Override
    public String getGoalName() {
        return "(" + goal1.getGoalName() + " AND " + goal2.getGoalName() + ")";

    }

}
