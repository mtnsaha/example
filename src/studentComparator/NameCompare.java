package studentComparator;

import java.util.Comparator;

public class NameCompare implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
      return o1.getStudent_name().compareTo(o2.getStudent_name());
    }
}
