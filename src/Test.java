import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
    public static void main(String[] arg) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        List<jjq> list = new ArrayList<>();
        jjq j = new jjq();
        j.setId("1");
        j.setDate(sdf.parse("20191010"));
        list.add(j);
        jjq j1 = new jjq();
        j1.setId("2");
        j1.setDate(sdf.parse("20190101"));
        list.add(j1);
        jjq j2 = new jjq();
        j2.setId("3");
        j2.setDate(sdf.parse("20200101"));
        list.add(j2);
        Date date  = getNextOperTime(list);
        System.out.println(sdf.format(date));
    }

    public static Date getNextOperTime(List<jjq> list) {

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                jjq sr1 = (jjq) o1;
                jjq sr2 = (jjq) o2;
                Date date1 = sr1.getDate();
                Date date2 = sr2.getDate();
                if (date1 == null || date2 == null) {
                    return -1;
                }
                int flag = date2.compareTo(date1);
                return flag;
            }

        });
        return list.get(0).getDate();
    }
}
