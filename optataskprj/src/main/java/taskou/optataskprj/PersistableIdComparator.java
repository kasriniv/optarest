package taskou.optataskprj;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class PersistableIdComparator implements Comparator<AbstractPersistable>, Serializable {

    @Override
    public int compare(AbstractPersistable a, AbstractPersistable b) {
        return new CompareToBuilder().append(a.getId(), b.getId()).toComparison();
    }

}