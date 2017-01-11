package taskou.optataskprj;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import taskou.optataskprj.AbstractPersistable;
//import org.optaplanner.examples.common.swingui.components.Labeled;

@XStreamAlias("TaTaskType")
public class TaskType extends AbstractPersistable {
//implements Labeled {

    private String code;
    private String title;
    private int baseDuration;

    private List<Skill> requiredSkillList;

    public TaskType() {
    }

    public TaskType(long id, String code, String title, int baseDuration) {
        super(id);
        this.code = code;
        this.title = title;
        this.baseDuration = baseDuration;
        requiredSkillList = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBaseDuration() {
        return baseDuration;
    }

    public void setBaseDuration(int baseDuration) {
        this.baseDuration = baseDuration;
    }

    public List<Skill> getRequiredSkillList() {
        return requiredSkillList;
    }

    public void setRequiredSkillList(List<Skill> requiredSkillList) {
        this.requiredSkillList = requiredSkillList;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

   // @Override
    public String getLabel() {
        return title;
    }

    @Override
    public String toString() {
        return code;
    }

}