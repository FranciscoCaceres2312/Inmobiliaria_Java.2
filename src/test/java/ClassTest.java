

import java.util.ArrayList;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import main.java.model.Property;
import org.junit.jupiter.api.Test;
public class ClassTest {

    @Test

    public void test1(){
        main.java.model.Model model = new main.java.model.Model();
        ArrayList<main.java.model.Property> property = new ArrayList<>();
        property.addAll((Collection<? extends Property>) model.getAllProperties());
        main.java.model.Property p;
        p = new main.java.model.Property("33498B","10000","San Juan 25", 2255, 12000 );
        assertEquals(property.get(1).getId(),p.getId());
    }

}
