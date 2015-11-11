package test.guava;

import com.google.common.base.Preconditions;

public class TestPreconditions {
	public static boolean getPersonByPrecondition(int age,String neme)throws Exception{
        Preconditions.checkNotNull(neme, "neme为null");
        Preconditions.checkArgument(neme.length()>0, "neme为\'\'");
        Preconditions.checkArgument(age>0, "age 必须大于0");
        return true;
    }
}
