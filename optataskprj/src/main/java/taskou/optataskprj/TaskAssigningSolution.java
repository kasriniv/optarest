package taskou.optataskprj;

import java.util.List;
import org.optaplanner.persistence.xstream.api.score.buildin.bendable.BendableScoreXStreamConverter;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.persistence.xstream.api.score.buildin.bendable.*;
//import org.optaplanner.persistence.xstream.api.score.buildin.bendable.BendableScoreXStreamConverter;

import taskou.optataskprj.AbstractPersistable;

@PlanningSolution
@XStreamAlias("TaTaskAssigningSolution")
public class TaskAssigningSolution extends AbstractPersistable {

    @ProblemFactCollectionProperty
    private List<Skill> skillList;
    @ProblemFactCollectionProperty
    private List<TaskType> taskTypeList;
    @ProblemFactCollectionProperty
    private List<Customer> customerList;
    @ValueRangeProvider(id = "employeeRange")
    @ProblemFactCollectionProperty
    private List<Employee> employeeList;

    @PlanningEntityCollectionProperty
    @ValueRangeProvider(id = "taskRange")
    private List<Task> taskList;

    @XStreamConverter(BendableScoreXStreamConverter.class)
    @PlanningScore(bendableHardLevelsSize = 1, bendableSoftLevelsSize = 4)
    private BendableScore score;

    public TaskAssigningSolution() {
    }

    public TaskAssigningSolution(long id, List<Skill> skillList, List<TaskType> taskTypeList,
            List<Customer> customerList, List<Employee> employeeList, List<Task> taskList) {
        super(id);
        this.skillList = skillList;
        this.taskTypeList = taskTypeList;
        this.customerList = customerList;
        this.employeeList = employeeList;
        this.taskList = taskList;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }

    public List<TaskType> getTaskTypeList() {
        return taskTypeList;
    }

    public void setTaskTypeList(List<TaskType> taskTypeList) {
        this.taskTypeList = taskTypeList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public BendableScore getScore() {
        return score;
    }

    public void setScore(BendableScore score) {
        this.score = score;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

}