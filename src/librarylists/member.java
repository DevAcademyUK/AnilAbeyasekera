package librarylists;

import java.util.Comparator;

public class member {

    public int memberID;
    public String memberForename;
    public String memberSurname;
    public byte memberAge;

    public member(int ID, String forename, String surname, byte age){
        memberID = ID;
        memberForename = forename;
        memberSurname = surname;
        memberAge = age;
    }

    public static Comparator<member> memberForenameComparator = new Comparator<member>() {
        @Override
        public int compare(member m1, member m2) {
            String f1 = m1.memberForename.toUpperCase();
            String f2 = m2.memberForename.toUpperCase();

            return f1.compareTo(f2);
        }
    };

    public static Comparator<member> memberSurnameComparator = new Comparator<member>() {
        @Override
        public int compare(member m1, member m2) {
            String s1 = m1.memberSurname.toUpperCase();
            String s2 = m2.memberSurname.toUpperCase();

            return s1.compareTo(s2);
        }

        public Comparator<member> memberAgeComparator = new Comparator<member>() {
            @Override
            public int compare(member m1, member m2) {
                String a1 = m1.memberForename.toUpperCase();
                String a2 = m2.memberForename.toUpperCase();

                return a1.compareTo(a2);
            }
        };

    };


}
