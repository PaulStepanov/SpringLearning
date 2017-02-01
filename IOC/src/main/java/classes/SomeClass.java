package classes;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SomeClass {
    private NeededClass neededClass;

    @Autowired
    private Log log;

    public SomeClass(NeededClass neededClass) {
        this.neededClass = neededClass;
    }

    public NeededClass getNeededClass() {
        return neededClass;
    }

    public SomeClass setNeededClass(NeededClass neededClass) {
        this.neededClass = neededClass;
        return this;
    }

    public void init(){
        log.warn("SomeClass has been constructed with NeededClassParam:"+neededClass.getText());
    }
}
