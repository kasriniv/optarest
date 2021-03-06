package taskou.optataskprj;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;
import taskou.optataskprj.Task;

public class TaskDifficultyComparator implements Comparator<Task>, Serializable {

    @Override
    public int compare(Task a, Task b) {
        return new CompareToBuilder()
                .append(a.getPriority(), b.getPriority())
                .append(a.getTaskType().getRequiredSkillList().size(), b.getTaskType().getRequiredSkillList().size())
                .append(a.getTaskType().getBaseDuration(), b.getTaskType().getBaseDuration())
                .append(a.getId(), b.getId())
                .toComparison();
    }

}