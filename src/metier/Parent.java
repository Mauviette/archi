package metier;

import java.util.ArrayList;

public class Parent {

    ArrayList<Child> children = new ArrayList<Child>();

    public Parent(int lig, int col) {
        for (int i = 0; i < lig; i++) {
            for (int j = 0; j < col; j++) {
                children.add(new Child(i, j));
            }
        }
    }
    
}
