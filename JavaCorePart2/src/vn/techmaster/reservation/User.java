package vn.techmaster.reservation;


public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public Member register(String username, String password,
                         String email, String id, String address, String tel, String cardNumber, int balance, boolean eligible) {

        var newMember = new Member(this.name, username, password, email, id, address, tel,
                new Card(cardNumber, balance, eligible));
        Member.addMembers(newMember);
        return newMember;
    }

    @Override
    public String toString() {
        return name;
    }
}
