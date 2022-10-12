package io.codelex.generics.practice.exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3App {

    public static void main(String[] args) {
        List<Vclass> vClassList = new ArrayList<>();
        vClassList.add(new Vclass());
        List<VsuperClass> vSuperList = new ArrayList<>();
        vSuperList.add(new VsuperClass());

        Exercise3.addAllX(vClassList, vSuperList);
        //Exercise3.addAllY(vClassList, vSuperList); does not work with type superclasses
    }


}
