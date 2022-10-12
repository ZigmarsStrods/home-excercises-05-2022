package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3App {

    public static void main(String[] args) {
        List<Vclass> vClassList = new ArrayList<>();
        vClassList.add(new Vclass());
        List<VsuperClass> vSuperList = new ArrayList<>();
        vSuperList.add(new VsuperClass());
        List<Object> objectList = new ArrayList<>();
        objectList.add(new Object());

        Exercise3.addAllX(vClassList, vSuperList);
        Exercise3.addAllX(vClassList, objectList);
        Exercise3.addAllX(vSuperList, objectList);
        /* Does not work with type superclasses

        Exercise3.addAllY(vClassList, vSuperList);
        Exercise3.addAllY(vClassList, objectList);
        Exercise3.addAllY(vSuperList, objectList);
        */
    }


}
