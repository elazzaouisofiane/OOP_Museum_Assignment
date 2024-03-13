
// Driver Class
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Member Sofiane = new Member("Mr", "Sofiane", "El Azzaoui", 38, LocalDateTime.of(2024, 2, 3, 13, 15, 00),
                MembershipType.INDIVIDUAL, "Month", LocalDate.of(2024, 2, 3));
        Member George = new Member("Mr", "George", "Redman", 10, LocalDateTime.of(2024, 3, 2, 10, 30, 00),
                MembershipType.NONE, null, null);
        Member Mohammed = new Member("Mr", "Mohammed", "BinSiddik", 16, LocalDateTime.of(2024, 5, 1, 15, 1, 00),
                MembershipType.NONE, null, null);

        Museum.memberList.add(Sofiane);
        Museum.memberList.add(George);
        Museum.memberList.add(Mohammed);

        for (Member member : Museum.memberList) {
            System.out.println(member);
        }

    }
}