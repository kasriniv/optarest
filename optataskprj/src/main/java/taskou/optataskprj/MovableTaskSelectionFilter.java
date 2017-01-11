package taskou.optataskprj;

import org.optaplanner.core.impl.heuristic.selector.common.decorator.SelectionFilter;
import org.optaplanner.core.impl.score.director.ScoreDirector;
import org.optaplanner.examples.taskassigning.domain.Task;
import org.optaplanner.examples.taskassigning.domain.TaskAssigningSolution;

public class MovableTaskSelectionFilter implements SelectionFilter<TaskAssigningSolution, Task> {

    @Override
    public boolean accept(ScoreDirector<TaskAssigningSolution> scoreDirector, Task task) {
        return !task.isLocked();
    }

}