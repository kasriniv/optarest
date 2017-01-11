package taskou.optataskprj;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;
import taskou.optataskprj.AbstractPersistable;

@PlanningEntity
public abstract class TaskOrEmployee extends AbstractPersistable {

    // Shadow variables
    @InverseRelationShadowVariable(sourceVariableName = "previousTaskOrEmployee")
    protected Task nextTask;

    public TaskOrEmployee() {
    }

    public TaskOrEmployee(long id) {
        super(id);
    }

    public Task getNextTask() {
        return nextTask;
    }

    public void setNextTask(Task nextTask) {
        this.nextTask = nextTask;
    }

    /**
     * @return sometimes null
     */
    public abstract Integer getEndTime();

    /**
     * @return sometimes null
     */
    public abstract Employee getEmployee();

}