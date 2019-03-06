import java.util.Comparator;

public class StudentComparator implements Comparator<CompareExample.Student> {
    @Override
    public int compare(CompareExample.Student a, CompareExample.Student b) {
        if(a.sno < b.sno) return -1;
        else if(a.sno == b.sno) return 0;
        else return 1;
    }
}
